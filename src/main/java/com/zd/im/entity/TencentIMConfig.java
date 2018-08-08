package com.zd.im.entity;

/**
 * @author : cw
 * @create : 2018 - 07 - 04
 *
 */
public class TencentIMConfig {

    /**
     * sdkAppid
     */
    private String sdkAppid;

    /**
     * Jnisigcheck 包地址
     */
    private String jnisigcheckLibWindowPath;

    /**
     * Jnisigcheck 包地址
     */
    private String jnisigcheckLibLinuxPath;


    /**
     * 私有key地址
     */
    private String privateKeyPath;

    /**
     * 私有key
     */
    private String privateKey;

    /**
     * 默认IM账号
     */
    private String defaultImAdminAccount;

    public TencentIMConfig() {
    }

    public TencentIMConfig(String sdkAppid, String jnisigcheckLibWindowPath,String jnisigcheckLibLinuxPath, String privateKeyPath, String privateKey, String defaultImAdminAccount) {
        this.sdkAppid = sdkAppid;
        this.jnisigcheckLibWindowPath = jnisigcheckLibWindowPath;
        this.jnisigcheckLibLinuxPath = jnisigcheckLibLinuxPath;
        this.privateKeyPath = privateKeyPath;
        this.privateKey = privateKey;
        this.defaultImAdminAccount = defaultImAdminAccount;
    }


    public String getJnisigcheckLibWindowPath() {
        return jnisigcheckLibWindowPath;
    }

    public void setJnisigcheckLibWindowPath(String jnisigcheckLibWindowPath) {
        this.jnisigcheckLibWindowPath = jnisigcheckLibWindowPath;
    }

    public String getJnisigcheckLibLinuxPath() {
        return jnisigcheckLibLinuxPath;
    }

    public void setJnisigcheckLibLinuxPath(String jnisigcheckLibLinuxPath) {
        this.jnisigcheckLibLinuxPath = jnisigcheckLibLinuxPath;
    }

    public String getSdkAppid() {
        return sdkAppid;
    }

    public void setSdkAppid(String sdkAppid) {
        this.sdkAppid = sdkAppid;
    }


    public String getPrivateKeyPath() {
        return privateKeyPath;
    }

    public void setPrivateKeyPath(String privateKeyPath) {
        this.privateKeyPath = privateKeyPath;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getDefaultImAdminAccount() {
        return defaultImAdminAccount;
    }

    public void setDefaultImAdminAccount(String defaultImAdminAccount) {
        this.defaultImAdminAccount = defaultImAdminAccount;
    }
}
