package com.zd.im.imReqEntity.User;

/**
 * @author : cw
 * @create : 2018 - 07 - 06
 * 账号用户
 */
public class User {

    /**
     * 用户名，长度不超过 32 字节
     */
    private String identifier;
    /**
     * 	用户昵称
     */
    private String nick;
    /**
     * 用户头像URL。
     */
    private String faceUrl;
    /**
     * 	帐号类型，开发者默认无需填写，值0表示普通帐号，1表示机器人帐号。
     */
    private Integer type;

    public User() {
    }

    public User(String identifier, String nick, String faceUrl, Integer type) {
        this.identifier = identifier;
        this.nick = nick;
        this.faceUrl = faceUrl;
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
