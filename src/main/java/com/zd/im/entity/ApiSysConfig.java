package com.zd.im.entity;

/**
 * @author : cw
 * @create : 2018 - 07 - 04
 *  接口统一请求参数
 */
public class ApiSysConfig {

    /**
     * 	App 在云通信控制台上获取的 Appid。
     */
    private String sdkappid;

    /**
     * 用户名，调用 REST API 时一般为 App 管理员帐号。
     */
    private String identifier;

    /**
     * 用户名对应的签名。
     */
    private String usersig;

    /**
     * 标识当前请求的整数随机数参数。32 位无符号整数随机数。
     */
    private String random;

    public ApiSysConfig() {
    }

    public ApiSysConfig(String sdkappid, String identifier, String usersig, String random) {
        this.sdkappid = sdkappid;
        this.identifier = identifier;
        this.usersig = usersig;
        this.random = random;
    }

    public String getSdkappid() {
        return sdkappid;
    }

    public void setSdkappid(String sdkappid) {
        this.sdkappid = sdkappid;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getUsersig() {
        return usersig;
    }

    public void setUsersig(String usersig) {
        this.usersig = usersig;
    }

    public String getRandom() {
        return random;
    }

    public void setRandom(String random) {
        this.random = random;
    }
}
