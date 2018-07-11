package com.zd.im.imReqEntity.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author : cw
 * @create : 2018 - 07 - 10
 * 群组信息
 */
@JsonInclude( JsonInclude.Include.NON_NULL)
public class GroupsQuery {

    /**
     * 本次获取的群组 ID 数量的上限，不得超过 10000。如果不填，默认为最大值 10000。
     */
    @JsonProperty("Limit")
    private Integer limit;

    /**
     * 群太多时分页拉取标志，第一次填 0，以后填上一次返回的值，返回的 Next 为 0 代表拉完了。
     */
    @JsonProperty("Next")
    private Integer next;

    /**
     * 群组形态的群组
     * Public（公开群），
     * Private（私密群），
     * ChatRoom（聊天室），
     * AVChatRoom（互动直播聊天室）
     * BChatRoom（在线成员广播大群）
     */
    @JsonProperty("GroupType")
    private String groupType;

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }
}
