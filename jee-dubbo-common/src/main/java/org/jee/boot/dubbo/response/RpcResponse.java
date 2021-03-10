package org.jee.boot.dubbo.response;

import lombok.Data;
import org.jee.boot.dubbo.ReponseCodeEnum;
import org.springframework.util.StringUtils;

import java.io.Serializable;

@Data
public class RpcResponse<T> implements Serializable {

    private String code = "200";

    private String msg = "成功";

    private Long total = 0L;

    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    //系统调用失败
    public void setSysFail(String msg) {
        this.code = ReponseCodeEnum.SYS_FAIL.getCode();
        this.msg = ReponseCodeEnum.SYS_FAIL.getMsg();
        if (!StringUtils.isEmpty(msg)) {
            this.msg = msg;
        }
    }

    //系统异常
    public void setSysException() {
        this.code = ReponseCodeEnum.SYS_EXCEPTION.getCode();
        this.msg = ReponseCodeEnum.SYS_EXCEPTION.getMsg();
    }

    //系统繁忙
    public void setSysBusy() {
        this.code = ReponseCodeEnum.SYS_BUSY.getCode();
        this.msg = ReponseCodeEnum.SYS_BUSY.getMsg();
    }

    public static RpcResponse build(ReponseCodeEnum reponseCodeEnum) {
        RpcResponse rpcResponse = new RpcResponse();
        rpcResponse.code = reponseCodeEnum.getCode();
        rpcResponse.msg = reponseCodeEnum.getMsg();
        return rpcResponse;
    }


    public Boolean isSucces() {
        if (code.equals("200")) {
            return true;
        }
        return false;
    }

    public void copy(RpcResponse rpcResponse) {
        code = rpcResponse.getCode();
        msg = rpcResponse.getMsg();
    }

    public static RpcResponse ok() {
        return new RpcResponse();
    }


}
