package com.zd.im.entity.commonResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author : cw
 * @create : 2018 - 07 - 11
 * 成员信息
 */
@JsonInclude( JsonInclude.Include.NON_NULL)
public class MemberResponse {

    /**
     * 入群时间（UTC时间）
     */
    @JsonProperty("JoinTime")
    private Integer joinTime;
    /**
     *  最后发言时间（UTC时间）
     */
    @JsonProperty("LastSendMsgTime")
    private Integer lastSendMsgTime;

    /**
     * 成员ID
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 消息屏蔽选项
     */
    @JsonProperty("MsgFlag")
    private String msgFlag;

    /**
     * 1233
     */
    @JsonProperty("MsgSeq")
    private Integer msgSeq;

    /**
     * 群内角色
     */
    @JsonProperty("Role")
    private String role;

    /**
     * 禁言截至时间（UTC时间）
     */
    @JsonProperty("ShutUpUntil")
    private Integer shutUpUntil;

    /**
     *加人结果：0 为失败；1 为成功；2 为已经是群成员
     * @return
     */
    @JsonProperty("Result")
    private Integer result;

    public Integer getShutUpUntil() {
        return shutUpUntil;
    }

    public void setShutUpUntil(Integer shutUpUntil) {
        this.shutUpUntil = shutUpUntil;
    }

    public Integer getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Integer joinTime) {
        this.joinTime = joinTime;
    }

    public Integer getLastSendMsgTime() {
        return lastSendMsgTime;
    }

    public void setLastSendMsgTime(Integer lastSendMsgTime) {
        this.lastSendMsgTime = lastSendMsgTime;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public String getMsgFlag() {
        return msgFlag;
    }

    public void setMsgFlag(String msgFlag) {
        this.msgFlag = msgFlag;
    }

    public Integer getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Integer msgSeq) {
        this.msgSeq = msgSeq;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
