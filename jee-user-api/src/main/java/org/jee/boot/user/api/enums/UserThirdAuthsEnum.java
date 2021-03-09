package org.jee.boot.user.api.enums;

/**
 * @Author jiansheng.wang
 * @Date 2021/3/9 16:44
 */
public enum UserThirdAuthsEnum {
    WX("WX", Byte.parseByte("1")),
    QQ("QQ", Byte.parseByte("2")),
    WB("WB", Byte.parseByte("3"));
    private String name;
    private byte value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getValue() {
        return value;
    }

    public void setValue(byte value) {
        this.value = value;
    }

    UserThirdAuthsEnum(String name, byte value) {
        this.name = name;
        this.value = value;
    }
}
