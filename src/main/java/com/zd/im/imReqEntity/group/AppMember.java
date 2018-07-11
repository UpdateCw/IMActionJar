package com.zd.im.imReqEntity.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zd.im.imReqEntity.common.MapKV;

import java.util.List;

/**
 * @author : cw
 * @create : 2018 - 07 - 10
 * 初始化群成员
 */
@JsonInclude( JsonInclude.Include.NON_NULL)
public class AppMember {

    /**
     * 成员
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 赋予该成员的身份，目前备选项只有Admin（选填）
     */
    @JsonProperty("AppDefinedData")
    private String role;

    /**
     * 群成员维度自定义字段（选填）
     */
    @JsonProperty("AppMemberDefinedData")
    private List<MapKV> appMemberDefinedData;

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<MapKV> getAppMemberDefinedData() {
        return appMemberDefinedData;
    }

    public void setAppMemberDefinedData(List<MapKV> appMemberDefinedData) {
        this.appMemberDefinedData = appMemberDefinedData;
    }
}
