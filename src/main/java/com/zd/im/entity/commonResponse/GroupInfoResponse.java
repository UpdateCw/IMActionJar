package com.zd.im.entity.commonResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author : cw
 * @create : 2018 - 07 - 11
 * 群组信息
 */
@JsonInclude( JsonInclude.Include.NON_NULL)
public class GroupInfoResponse {

    /**
     * appid
     */
    @JsonProperty("Appid")
    private Integer appid;

    /**
     * 申请加群选项
     */
    @JsonProperty("ApplyJoinOption")
    private String applyJoinOption;

    /**
     * 创建时间
     */
    @JsonProperty("CreateTime")
    private Integer createTime;


    /**
     * 错误code
     */
    @JsonProperty("ErrorCode")
    private String errorCode;

    /**
     * 群头像
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    /**
     * 群组iD
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 群组简介
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 最后群资料变更时间（UTC 时间）
     */
    @JsonProperty("LastInfoTime")
    private Integer lastInfoTime;

    /**
     * 群内最后一条消息的时间（UTC 时间）
     */
    @JsonProperty("LastMsgTime")
    private Integer lastMsgTime;

    /**
     * 最大成员数
     */
    @JsonProperty("MaxMemberNum")
    private Integer maxMemberNum;

    /**
     * 当前成员数
     */
    @JsonProperty("MemberNum")
    private Integer memberNum;

    /**
     * 群名称
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 群内下一条消息的 Seq
     */
    @JsonProperty("NextMsgSeq")
    private Integer nextMsgSeq;

    /**
     * 群组公告
     */
    @JsonProperty("Notification")
    private String notification;

    /**
     * 在线成员数量
     */
    @JsonProperty("OnlineMemberNum")
    private String onlineMemberNum;

    /**
     * 群组ID
     */
    @JsonProperty("Owner_Account")
    private String ownerAccount;

    /**
     * 群全员禁言状态
     */
    @JsonProperty("ShutUpAllMember")
    private String shutUpAllMember;

    /**
     * 群组类型
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 群成员列表
     */
    @JsonProperty("MemberList")
    private List<MemberResponse> memberList;

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public String getApplyJoinOption() {
        return applyJoinOption;
    }

    public void setApplyJoinOption(String applyJoinOption) {
        this.applyJoinOption = applyJoinOption;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getLastInfoTime() {
        return lastInfoTime;
    }

    public void setLastInfoTime(Integer lastInfoTime) {
        this.lastInfoTime = lastInfoTime;
    }

    public Integer getLastMsgTime() {
        return lastMsgTime;
    }

    public void setLastMsgTime(Integer lastMsgTime) {
        this.lastMsgTime = lastMsgTime;
    }

    public Integer getMaxMemberNum() {
        return maxMemberNum;
    }

    public void setMaxMemberNum(Integer maxMemberNum) {
        this.maxMemberNum = maxMemberNum;
    }

    public Integer getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(Integer memberNum) {
        this.memberNum = memberNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNextMsgSeq() {
        return nextMsgSeq;
    }

    public void setNextMsgSeq(Integer nextMsgSeq) {
        this.nextMsgSeq = nextMsgSeq;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getOnlineMemberNum() {
        return onlineMemberNum;
    }

    public void setOnlineMemberNum(String onlineMemberNum) {
        this.onlineMemberNum = onlineMemberNum;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public String getShutUpAllMember() {
        return shutUpAllMember;
    }

    public void setShutUpAllMember(String shutUpAllMember) {
        this.shutUpAllMember = shutUpAllMember;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<MemberResponse> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberResponse> memberList) {
        this.memberList = memberList;
    }
}
