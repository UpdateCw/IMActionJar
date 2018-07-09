package com.zd.im.imReqEntity.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author : cw
 * @create : 2018 - 07 - 09
 * 消息详情类型
 */
@JsonInclude( JsonInclude.Include.NON_NULL)
public class MsgBody {

    /**
     * 消息元素类别；目前支持的消息对象包括：TIMTextElem(文本消息)，TIMFaceElem(表情消息)，
     * TIMLocationElem(位置消息)，TIMCustomElem(自定义消息)。
     */
    @JsonProperty("MsgType")
    private String msgType;

    /**
     * 消息内容
     */
    @JsonProperty("MsgContent")
    private MsgContent msgContent;

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public MsgContent getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(MsgContent msgContent) {
        this.msgContent = msgContent;
    }
}
