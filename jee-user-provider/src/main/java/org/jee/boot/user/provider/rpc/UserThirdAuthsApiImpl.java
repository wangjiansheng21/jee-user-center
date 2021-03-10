package org.jee.boot.user.provider.rpc;

import com.alibaba.dubbo.config.annotation.Service;
import org.jee.boot.dubbo.response.RpcResponse;
import org.jee.boot.user.api.UserThirdAuthsApi;
import org.jee.boot.user.api.request.AddUserThirdAuthsRequest;
import org.jee.boot.user.api.vo.ThirdAuthVO;
import org.jee.boot.user.provider.entity.UserThirdAuths;
import org.jee.boot.user.provider.service.UserThirdAuthsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author jiansheng.wang
 * @Date 2021/3/10 13:48
 */
@Service
public class UserThirdAuthsApiImpl implements UserThirdAuthsApi {

    @Autowired
    UserThirdAuthsService userThirdAuthsService;

    @Override
    public RpcResponse<ThirdAuthVO> getUserThirdAuthInfo(Byte identityType, String identifier) {
        RpcResponse rpcResponse = RpcResponse.ok();
        UserThirdAuths userThirdAuths = userThirdAuthsService.getUserThirdAuthInfo(identityType, identifier);
        if (userThirdAuths != null) {
            ThirdAuthVO thirdAuthVO = new ThirdAuthVO();
            BeanUtils.copyProperties(userThirdAuths, thirdAuthVO);
            rpcResponse.setData(thirdAuthVO);
        }
        return rpcResponse;
    }

    @Override
    public RpcResponse<Long> addUserThirdAuths(AddUserThirdAuthsRequest addUserThirdAuthsRequest) {
        RpcResponse rpcResponse = RpcResponse.ok();
        UserThirdAuths userThirdAuths = new UserThirdAuths();
        BeanUtils.copyProperties(addUserThirdAuthsRequest, userThirdAuths);
        userThirdAuthsService.insert(userThirdAuths);
        rpcResponse.setData(userThirdAuths.getId());
        return rpcResponse;
    }
}
