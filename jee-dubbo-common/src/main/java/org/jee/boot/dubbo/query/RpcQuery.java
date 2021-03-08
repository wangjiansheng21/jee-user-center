package org.jee.boot.dubbo.query;

import lombok.Data;

import java.io.Serializable;

@Data
public class RpcQuery implements Serializable {

    private Integer pageIndex;

    private Integer pageSize;


}
