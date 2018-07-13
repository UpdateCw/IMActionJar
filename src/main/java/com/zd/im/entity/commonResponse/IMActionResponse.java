package com.zd.im.entity.commonResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * @author : cw
 * @create : 2018 - 07 - 04
 *
 * IM响应结果
 */
@JsonInclude( JsonInclude.Include.NON_NULL)
public class    IMActionResponse {

    /**
     * 请求处理的结果，OK 表示处理成功，FAIL 表示失败。
     */
    @JsonProperty("ActionStatus")
    private String actionStatus;

    /**
     * 错误信息。
     */
    @JsonProperty("ErrorInfo")
    private String errorInfo;

    /**
     * 错误码。
     */
    @JsonProperty("ErrorCode")
    private int errorCode;

    /**
     * 消息时间戳，unix 时间戳。
     */
    @JsonProperty("MsgTime")
    private Integer msgTime;

    /**
     * 群组总数
     */
    @JsonProperty("TotalCount")
    private Integer totalCount;

    /**
     * 分页拉取标志
     */
    @JsonProperty("Next")
    private Integer next;

    /**
     * 获取到的群组 ID 的集合。
     */
    @JsonProperty("GroupIdList")
    private List<Map<String,String>> groupIdList;

    /**
     * 创建成功之后的群 ID，由 IM 云后台分配。
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 推送任务报告列表。
     */
    @JsonProperty("Reports")
    private IMActionReportsResponse reports;

    /**
     *
     * @return
     */
    @JsonProperty("UserAttrs")
    private List<UserAttrsResponse> userAttrs;

    /**
     * 应用属性名称
     * @return
     */
    @JsonProperty("AttrNames")
    private Map<String,String> attrNames;

    /**
     * 返回结果为群组信息数组
     * @return
     */
    @JsonProperty("GroupInfo")
    private List<GroupInfoResponse> groupInfo;

    /**
     * 返回成员信息
     * @return
     */
    @JsonProperty("MemberList")
    private List<MemberResponse> memberList;

    public boolean isSuccess() {
        return "OK".equals(actionStatus);
    }

    public List<MemberResponse> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberResponse> memberList) {
        this.memberList = memberList;
    }

    public List<GroupInfoResponse> getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(List<GroupInfoResponse> groupInfo) {
        this.groupInfo = groupInfo;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }

    public List<Map<String, String>> getGroupIdList() {
        return groupIdList;
    }

    public void setGroupIdList(List<Map<String, String>> groupIdList) {
        this.groupIdList = groupIdList;
    }

    public Map<String, String> getAttrNames() {
        return attrNames;
    }

    public void setAttrNames(Map<String, String> attrNames) {
        this.attrNames = attrNames;
    }

    public List<UserAttrsResponse> getUserAttrs() {
        return userAttrs;
    }

    public void setUserAttrs(List<UserAttrsResponse> userAttrs) {
        this.userAttrs = userAttrs;
    }

    public String getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Integer getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Integer msgTime) {
        this.msgTime = msgTime;
    }

    public IMActionReportsResponse getReports() {
        return reports;
    }

    public void setReports(IMActionReportsResponse reports) {
        this.reports = reports;
    }

}
