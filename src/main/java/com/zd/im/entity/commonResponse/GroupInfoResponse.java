package com.zd.im.entity.commonResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author : cw
 * @create : 2018 - 07 - 11
 * 群组信息
 */
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
}
