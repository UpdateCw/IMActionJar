package com.zd.im.entity.commonResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author : cw
 * @create : 2018 - 07 - 09
 *  推送任务报告列表。
 */
@JsonInclude( JsonInclude.Include.NON_NULL)
public class IMActionReportsResponse {

    /**
     * 0(未处理) / 1（推送中) / 2（推送完成） 。
     * 注意：推送完成不代表完全推送成功，具体发送情况见Finished和Total字段数据。
     */
    @JsonProperty("Status")
    private Integer status;

    /**
     *  推送开始时间，Status不为0，才有这个字段。
     */
    @JsonProperty("StartTime")
    private String startTime;

    /**
     * 已完成推送人数。
     */
    @JsonProperty("Finished")
    private Integer finished;

    /**
     *  需推送总人数。
     */
    @JsonProperty("Total")
    private Integer total;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Integer getFinished() {
        return finished;
    }

    public void setFinished(Integer finished) {
        this.finished = finished;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
