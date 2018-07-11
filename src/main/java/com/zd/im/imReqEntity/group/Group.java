package com.zd.im.imReqEntity.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zd.im.imReqEntity.common.MapKV;

import java.util.List;

/**
 * @author : cw
 * @create : 2018 - 07 - 10
 * 群组信息
 */
@JsonInclude( JsonInclude.Include.NON_NULL)
public class Group {

    /**
     * 群主 id，自动添加到群成员中。如果不填，群没有群主。
     */
    @JsonProperty("Owner_Account")
    private String ownerAccount;

    /**
     * 包括 Public（公开群），Private（私密群），
     * ChatRoom（聊天室），AVChatRoom（互动直播聊天室），
     * BChatRoom（在线成员广播大群）
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 群组 ID 更加简单
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 群名称
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 群介绍
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 群公告
     */
    @JsonProperty("Notification")
    private String notification;

    /**
     * 群头像
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    /**
     * 最大群成员数量，缺省时的默认值：私有群是 200，公开群是 2000，
     * 聊天室是 10000，互动直播聊天室和在线成员广播大群无限制。
     */
    @JsonProperty("MaxMemberCount")
    private Integer maxMemberCount;

    /**
     * 申请加群处理方式。
     * 包含 FreeAccess（自由加入），
     * NeedPermission（需要验证），
     * DisableApply（禁止加群），
     * 不填默认为 NeedPermission（需要验证）。
     */
    @JsonProperty("ApplyJoinOption")
    private String applyJoinOption;

    /**
     * 群组维度的自定义字段
     */
    @JsonProperty("AppDefinedData")
    private List<MapKV> AppDefinedData;

    /**
     * 初始群成员列表
     */
    @JsonProperty("MemberList")
    private List<AppMember> memberList;

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public Integer getMaxMemberCount() {
        return maxMemberCount;
    }

    public void setMaxMemberCount(Integer maxMemberCount) {
        this.maxMemberCount = maxMemberCount;
    }

    public String getApplyJoinOption() {
        return applyJoinOption;
    }

    public void setApplyJoinOption(String applyJoinOption) {
        this.applyJoinOption = applyJoinOption;
    }

    public List<MapKV> getAppDefinedData() {
        return AppDefinedData;
    }

    public void setAppDefinedData(List<MapKV> appDefinedData) {
        AppDefinedData = appDefinedData;
    }

    public List<AppMember> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<AppMember> memberList) {
        this.memberList = memberList;
    }
}
