package com.zd.im.entity;

/**
 * @author : cw
 * @create : 2018 - 07 - 05
 * IM请求地址
 */
public class IMRequestAddress {

    /**
     * 独立模式帐号导入
     */
    private   String accountAmport;

    /**
     * 独立模式账户批量导入
     */
    private String multiaccountImport;

    /**
     * 帐号登录态失效接口
     */
    private String kick;

    /**
     * 获取APP中的所有群组
     */
    private String groupOpenHttpSvc;

    /**
     * 创建群组
     */
    private String createGroup;

    /**
     * 获取群组详细资料
     */
    private String GroupInfo;

    /**
     * 增加群组成员
     */
    private String addGroupMember;

    /**
     * 删除群组成员
     */
    private  String deleteGroupMember;

    /**
     * 解散群组
     */
    private  String destroyGroup;

    /**
     * 推送
     */
    private  String imPush;

    /**
     * 获取推送报告
     */
    private String imGetPushReport;

    /**
     * 设置应用属性名称
     */
    private String imSetAttrName;

    /**
     * 获取应用属性名称
     */
    private String imGetAttrName;

    /**
     * 设置用户属性
     */
    private String imSetAttr;

    /**
     * 删除用户属性
     */
    private String imRemoveAttr;

    /**
     * 获取用户属性
     */
    private String imGetAttr;

    /**
     * 获取用户在线状态
     */
    private String querystate;

    /**
     * 拉取资料
     */
    private String portraitGet;

    /**
     * 设置资料
     */
    private String portraitSet;

    /**
     * 单发单聊消息
     */
    private   String sendMsg;

    public IMRequestAddress() {
    }


    public String getImSetAttrName() {
        return imSetAttrName;
    }

    public void setImSetAttrName(String imSetAttrName) {
        this.imSetAttrName = imSetAttrName;
    }

    public String getImGetAttrName() {
        return imGetAttrName;
    }

    public void setImGetAttrName(String imGetAttrName) {
        this.imGetAttrName = imGetAttrName;
    }

    public String getAccountAmport() {
        return accountAmport;
    }

    public String getImRemoveAttr() {
        return imRemoveAttr;
    }

    public void setImRemoveAttr(String imRemoveAttr) {
        this.imRemoveAttr = imRemoveAttr;
    }

    public String getImGetAttr() {
        return imGetAttr;
    }

    public void setImGetAttr(String imGetAttr) {
        this.imGetAttr = imGetAttr;
    }

    public void setAccountAmport(String accountAmport) {
        this.accountAmport = accountAmport;
    }

    public String getMultiaccountImport() {
        return multiaccountImport;
    }

    public void setMultiaccountImport(String multiaccountImport) {
        this.multiaccountImport = multiaccountImport;
    }

    public String getKick() {
        return kick;
    }

    public void setKick(String kick) {
        this.kick = kick;
    }

    public String getGroupOpenHttpSvc() {
        return groupOpenHttpSvc;
    }

    public void setGroupOpenHttpSvc(String groupOpenHttpSvc) {
        this.groupOpenHttpSvc = groupOpenHttpSvc;
    }

    public String getCreateGroup() {
        return createGroup;
    }

    public void setCreateGroup(String createGroup) {
        this.createGroup = createGroup;
    }

    public String getGroupInfo() {
        return GroupInfo;
    }

    public void setGroupInfo(String groupInfo) {
        GroupInfo = groupInfo;
    }

    public String getAddGroupMember() {
        return addGroupMember;
    }

    public void setAddGroupMember(String addGroupMember) {
        this.addGroupMember = addGroupMember;
    }

    public String getDeleteGroupMember() {
        return deleteGroupMember;
    }

    public void setDeleteGroupMember(String deleteGroupMember) {
        this.deleteGroupMember = deleteGroupMember;
    }

    public String getDestroyGroup() {
        return destroyGroup;
    }

    public void setDestroyGroup(String destroyGroup) {
        this.destroyGroup = destroyGroup;
    }

    public String getImPush() {
        return imPush;
    }

    public void setImPush(String imPush) {
        this.imPush = imPush;
    }

    public String getImGetPushReport() {
        return imGetPushReport;
    }

    public void setImGetPushReport(String imGetPushReport) {
        this.imGetPushReport = imGetPushReport;
    }

    public String getImSetAttr() {
        return imSetAttr;
    }

    public void setImSetAttr(String imSetAttr) {
        this.imSetAttr = imSetAttr;
    }

    public String getQuerystate() {
        return querystate;
    }

    public void setQuerystate(String querystate) {
        this.querystate = querystate;
    }

    public String getPortraitGet() {
        return portraitGet;
    }

    public void setPortraitGet(String portraitGet) {
        this.portraitGet = portraitGet;
    }

    public String getPortraitSet() {
        return portraitSet;
    }

    public void setPortraitSet(String portraitSet) {
        this.portraitSet = portraitSet;
    }

    public String getSendMsg() {
        return sendMsg;
    }

    public void setSendMsg(String sendMsg) {
        this.sendMsg = sendMsg;
    }
}
