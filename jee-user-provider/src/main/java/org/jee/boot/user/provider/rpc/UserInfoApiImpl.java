package org.jee.boot.user.provider.rpc;

import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;
import org.jee.boot.dubbo.response.RpcResponse;
import org.jee.boot.user.api.UserInfoApi;
import org.jee.boot.user.api.request.AddUserInfoRequest;
import org.jee.boot.user.api.vo.UserInfoVO;
import org.jee.boot.user.provider.entity.UserInfo;
import org.jee.boot.user.provider.service.UserInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Slf4j
public class UserInfoApiImpl implements UserInfoApi {

    @Autowired
    UserInfoService userInfoService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public RpcResponse<Long> addUserInfo(AddUserInfoRequest addUserInfoRequest) {
        RpcResponse rpcResponse = new RpcResponse();
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(addUserInfoRequest, userInfo);
        userInfo.setCreatedTime(new Date());
        userInfo.setUpdatedTime(userInfo.getCreatedTime());
        userInfo.setVersion(0L);
        userInfo.setDeleted(Byte.parseByte("0"));
        userInfo.setUserStatus(Byte.parseByte("1"));
        userInfoService.insert(userInfo);
        rpcResponse.setData(userInfo.getId());
        return rpcResponse;
    }

    @Override
    public RpcResponse<UserInfoVO> getUserInfoByUserId(Long userId) {
        RpcResponse rpcResponse = new RpcResponse();
        UserInfo userInfo = userInfoService.queryById(userId);
        UserInfoVO userInfoVO = null;
        if (userInfo != null) {
            userInfoVO = new UserInfoVO();
            BeanUtils.copyProperties(userInfo, userInfoVO);
            userInfoVO.setUserId(userInfo.getId());
            rpcResponse.setData(userInfoVO);
        }
        rpcResponse.setData(userInfoVO);
        return rpcResponse;
    }


    @Override
    public RpcResponse<UserInfoVO> getUserInfoByPhone(String phone) {
        RpcResponse rpcResponse = new RpcResponse();
        UserInfo userInfo = userInfoService.getUserInfoByPhone(phone);
        UserInfoVO userInfoVO = null;
        if (userInfo != null) {
            userInfoVO = new UserInfoVO();
            BeanUtils.copyProperties(userInfo, userInfoVO);
            userInfoVO.setUserId(userInfo.getId());
            rpcResponse.setData(userInfoVO);
        }
        rpcResponse.setData(userInfoVO);
        return rpcResponse;
    }

    @Override
    public RpcResponse<UserInfoVO> getUserInfoByLoginName(String loginName) {
        RpcResponse rpcResponse = new RpcResponse();
        UserInfo userInfo = userInfoService.getUserInfoByLoginName(loginName);
        UserInfoVO userInfoVO = null;
        if (userInfo != null) {
            userInfoVO = new UserInfoVO();
            BeanUtils.copyProperties(userInfo, userInfoVO);
            userInfoVO.setUserId(userInfo.getId());
            rpcResponse.setData(userInfoVO);
        }
        rpcResponse.setData(userInfoVO);
        return rpcResponse;
    }

    @Override
    public RpcResponse<Boolean> authByPhoneAndPassWord(String phone, String passWord) {
        RpcResponse rpcResponse = RpcResponse.ok();
        boolean isPass = false;
        UserInfo userInfo = userInfoService.getUserInfoByPhone(phone);
        if (userInfo != null && userInfo.getPassWord().equals(passWord)) {
            isPass = true;
        }
        rpcResponse.setData(isPass);
        return rpcResponse;
    }
}
