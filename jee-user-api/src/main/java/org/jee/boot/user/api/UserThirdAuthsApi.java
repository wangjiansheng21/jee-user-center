package org.jee.boot.user.api;

import org.jee.boot.dubbo.response.RpcResponse;
import org.jee.boot.user.api.request.AddUserThirdAuthsRequest;
import org.jee.boot.user.api.vo.ThirdAuthVO;

/**
 * @Author jiansheng.wang
 * @Date 2021/3/10 13:41
 */
public interface UserThirdAuthsApi {

    /**
     * 获取第三方授权信息
     *
     * @param identityType 三方授权类型：1=微信，2=qq, 3=weibo
     * @param identifier   第三方系统对应的用户唯一标志（如微信的openId）
     * @return RpcResponse<ThirdAuthVO>
     */
    RpcResponse<ThirdAuthVO> getUserThirdAuthInfo(Byte identityType, String identifier);

    /**
     * 添加用户第三方授权信息
     *
     * @param addUserThirdAuthsRequest
     * @return RpcResponse<Long> 主键id
     */
    RpcResponse<Long> addUserThirdAuths(AddUserThirdAuthsRequest addUserThirdAuthsRequest);
}
