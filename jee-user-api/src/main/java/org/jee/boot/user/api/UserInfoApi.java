package org.jee.boot.user.api;

import org.jee.boot.dubbo.response.RpcResponse;
import org.jee.boot.user.api.request.AddUserInfoRequest;
import org.jee.boot.user.api.vo.UserInfoVO;

public interface UserInfoApi {

    /**
     * 添加用户基本信息
     *
     * @param addUserInfoRequest
     * @return
     */
    public RpcResponse<Long> addUserInfo(AddUserInfoRequest addUserInfoRequest);

    /**
     * 根据userId 获取用户基本信息
     *
     * @param userId
     * @return
     */
    public RpcResponse<UserInfoVO> getUserInfoByUserId(Long userId);


    /**
     * 根据手机号码获取用户基本信息
     *
     * @param phone
     * @return
     */
    public RpcResponse<UserInfoVO> getUserInfoByPhone(String phone);


    /**
     * 根据登录账号查询用户基本信息
     *
     * @param loginName
     * @return
     */
    public RpcResponse<UserInfoVO> getUserInfoByLoginName(String loginName);


    /**
     * 根据手机号和密码授权
     *
     * @param phone
     * @param passWord
     * @return
     */
    public RpcResponse<Boolean> authByPhoneAndPassWord(String phone, String passWord);

}
