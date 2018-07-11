package com.zd.im.imReqEntity.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author : cw
 * @create : 2018 - 07 - 10
 * 公用K V
 */
public class MapKV {

    @JsonProperty("Key")
    private String key;

    @JsonProperty("Value")
    private  String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
