package com.zd.im.entity.commonResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author : cw
 * @create : 2018 - 07 - 10
 * 用户属性
 */
@JsonInclude( JsonInclude.Include.NON_NULL)
public class UserAttrsResponse {

    /**
     * 用户帐号
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 属性内容
     */
    @JsonProperty("Attrs")
    private AttrsResponse attrs;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public AttrsResponse getAttrs() {
        return attrs;
    }

    public void setAttrs(AttrsResponse attrs) {
        this.attrs = attrs;
    }
}
