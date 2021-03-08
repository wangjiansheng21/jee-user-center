package org.jee.boot.dubbo;

public enum ReponseCodeEnum {
    SYS_EXCEPTION("500", "系统异常"),
    SYS_BUSY("600", "系统繁忙"),
    SYS_FAIL("700", "调用失败");
    private String code;

    private String msg;

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ReponseCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
