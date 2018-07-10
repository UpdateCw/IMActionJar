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

    public boolean isSuccess() {
        return "OK".equals(actionStatus);
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
