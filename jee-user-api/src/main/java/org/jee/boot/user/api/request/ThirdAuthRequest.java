package org.jee.boot.user.api.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author jiansheng.wang
 * @Date 2021/3/10 13:34
 */
@Data
public class ThirdAuthRequest  implements Serializable {
  private   Byte identityType;
  private   String identifier;
}
