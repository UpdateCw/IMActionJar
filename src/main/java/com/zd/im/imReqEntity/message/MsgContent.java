package com.zd.im.imReqEntity.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author : cw
 * @create : 2018 - 07 - 09
 * 消息具体内容
 */
@JsonInclude( JsonInclude.Include.NON_NULL)
public class MsgContent {
    /**
     * 消息内容。
     * 1、当接收方为iphone后台在线时，做iOS离线Push时文本展示。
     * 2、当接收方为iOS系统且应用处在后台时，json请求包体中的Text字段作为离线推送文本。
     */
    @JsonProperty("Text")
    private String text;

    /**
     *  地理位置描述信息。
     *  当接收方为iOS系统且应用处在后台时，中文版离线推送文本为“[位置]”，英文版推送文本为“[Location]”。
     */
    @JsonProperty("Desc")
    private String desc;

    /**
     * 	纬度
     */
    @JsonProperty("Latitude")
    private Number latitude;

    /**
     * 经度
     */
    @JsonProperty("Longitude")
    private Number longitude;

    /**
     * 表情索引，用户自定义。
     * 当接收方为iOS系统且应用处在后台时，中文版离线推送文本为“[表情]”，英文版为“[Face]”。
     */
    @JsonProperty("Index")
    private Number index;

    /**
     * 额外数据
     */
    @JsonProperty("Data")
    private String data;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Number getLatitude() {
        return latitude;
    }

    public void setLatitude(Number latitude) {
        this.latitude = latitude;
    }

    public Number getLongitude() {
        return longitude;
    }

    public void setLongitude(Number longitude) {
        this.longitude = longitude;
    }

    public Number getIndex() {
        return index;
    }

    public void setIndex(Number index) {
        this.index = index;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
