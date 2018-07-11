package com.zd.im.helper;

import com.tls.sigcheck.tls_sigcheck;
import com.zd.im.entity.commonResponse.IMActionResponse;
import com.zd.im.entity.TencentIMConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Joiner;
import com.zd.im.entity.commonResponse.UserAttrsRemoveResponse;
import com.zd.im.entity.commonResponse.UserAttrsResponse;
import com.zd.im.imReqEntity.group.Group;
import com.zd.im.imReqEntity.group.GroupsQuery;
import com.zd.im.imReqEntity.user.User;
import com.zd.im.imReqEntity.message.Message;
import com.zd.im.util.HttpClientUtil;
import com.zd.im.util.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;


/**
 * @author : cw
 * @create : 2018 - 07 - 04
 * 业务执行
 */
public class TencentIMHelper {
    private static final Logger log = LoggerFactory.getLogger(TencentIMHelper.class);

    private TencentIMConfig config;
    private ObjectMapper objectMapper;



    /**
     * 封装请求参数
     */
    private Joiner.MapJoiner joiner = Joiner.on("&").withKeyValueSeparator("=");

    public TencentIMHelper(TencentIMConfig config,ObjectMapper objectMapper) {
        this.config = config;
        this.objectMapper = objectMapper;
    }

    /**
     * 生成usersig
     *
     * @param identifier
     * @return
     */
    public String genUsersig(String identifier) {
        String path = TencentIMHelper.class.getResource("/").toString();
        tls_sigcheck tlsSigcheck = new tls_sigcheck();
        tlsSigcheck.loadJniLib(System.getProperty("user.dir") + config.getJnisigcheckLibPath());
        int ret = tlsSigcheck.tls_gen_signature_ex2(config.getSdkAppid(), identifier, config.getPrivateKey());
        if (0 != ret) {
            log.error("ret: {}, errMsg:{}", ret, tlsSigcheck.getErrMsg());
        } else {
            String usersig = tlsSigcheck.getSig();
            log.info("identifier '{}' take usersig is {}", identifier, usersig);
            return usersig;
        }
        return  null;
    }
    /**
     * 导入账号
     *
     * @param user
     */
    public IMActionResponse accountImport(User user) {
        String url = InitHelper.getInstance().imRequestAddress.getAccountAmport();
        String queryString = joiner.join(getDefaultParams());
        Map<String, Object> requestBody = ImmutableMap.of(
                "Identifier", user.getIdentifier(),
                "Nick",user.getNick(),
                "FaceUrl",user.getFaceUrl(),
                "Type",user.getType());
        IMActionResponse res = request(url + queryString, requestBody, IMActionResponse.class);
        if (!res.isSuccess()) {
            log.error("导入'{}'到腾讯云IM失败, response message is: {}", res);
        }
        return res;
    }

    /**
     * 批量导入账号
     *
     * @param accounts 用户名，单个用户名长度不超过 32 字节，单次最多导入100个用户名
     */
    public IMActionResponse multiaccountImport(String... accounts) {
        String url = InitHelper.getInstance().imRequestAddress.getMultiaccountImport();
        String queryString = joiner.join(getDefaultParams());
        Map<String, Object> requestBody = ImmutableMap.of("Accounts", accounts);
        IMActionResponse res = request(url + queryString, requestBody, IMActionResponse.class);
        if (!res.isSuccess()) {
            log.error("批量导入'{}'到腾讯云IM失败, response message is: {}", res);
        }
        return  res;
    }

    /**
     * 单发单聊消息
     */
    public  IMActionResponse sendMsg(Message message){
        String url = InitHelper.getInstance().imRequestAddress.getSendMsg();
        String queryString = joiner.join(getDefaultParams());
        IMActionResponse res =  request(url + queryString,  message, IMActionResponse.class);
        if (!res.isSuccess()) {
            log.error("单聊消息发送失败, response message is: {}", res);
        }
        return res;
    }

    /**
     * 推送
     */
   public IMActionResponse imPush(Message message){
       String url = InitHelper.getInstance().imRequestAddress.getImPush();
       String queryString = joiner.join(getDefaultParams());
       IMActionResponse res =  request(url + queryString,  message, IMActionResponse.class);
       if (!res.isSuccess()) {
           log.error("推送消息发送失败, response message is: {}", res);
       }
       return res;
   }

    /**
     * 获取推送报告
     * @return
     */
    public IMActionResponse imGetPushReport(String... taskIds){
        String url = InitHelper.getInstance().imRequestAddress.getImGetPushReport();
        String queryString = joiner.join(getDefaultParams());
        Map<String, Object> requestBody = ImmutableMap.of("TaskIds", taskIds);
        IMActionResponse res = request(url + queryString, requestBody, IMActionResponse.class);
        if (!res.isSuccess()) {
            log.error("获取推送报告失败, response message is: {}", res);
        }
        return  res;
    }

    /**
     * 设置应用属性名称
     * @return
     */
    public IMActionResponse imSetAttrName(Map<String,String> attrNames){
        String url = InitHelper.getInstance().imRequestAddress.getImSetAttrName();
        String queryString = joiner.join(getDefaultParams());
        Map<String, Object> requestBody = ImmutableMap.of("AttrNames", attrNames);
        IMActionResponse res = request(url + queryString, requestBody, IMActionResponse.class);
        if (!res.isSuccess()) {
            log.error("设置应用属性名称失败, response message is: {}", res);
        }
        return  res;
    }

    /**
     * 获取应用属性名称
     * @return
     */
    public IMActionResponse imGetAttrName(){
        String url = InitHelper.getInstance().imRequestAddress.getImGetAttrName();
        String queryString = joiner.join(getDefaultParams());
        IMActionResponse res = request(url + queryString, null, IMActionResponse.class);
        if (!res.isSuccess()) {
            log.error("设置应用属性名称失败, response message is: {}", res);
        }
        return  res;
    }

    /**
     * 获取用户属性
     * @param toAccounts
     * @return
     */
    public  IMActionResponse  imGetAttr(String... toAccounts){
        String url = InitHelper.getInstance().imRequestAddress.getImGetAttr();
        String queryString = joiner.join(getDefaultParams());
        Map<String, Object> requestBody = ImmutableMap.of("To_Account", toAccounts);
        IMActionResponse res = request(url + queryString, requestBody, IMActionResponse.class);
        if (!res.isSuccess()) {
            log.error("获取用户属性失败, response message is: {}", res);
        }
        return  res;
    }

    /**
     * 设置用户属性
     * @param userAttrs
     */
    public  IMActionResponse  imSetAttr(List<UserAttrsResponse> userAttrs){
        String url = InitHelper.getInstance().imRequestAddress.getImSetAttr();
        String queryString = joiner.join(getDefaultParams());
        Map<String, Object> requestBody = ImmutableMap.of("UserAttrs", userAttrs);
        IMActionResponse res = request(url + queryString, requestBody, IMActionResponse.class);
        if (!res.isSuccess()) {
            log.error("设置用户属性失败, response message is: {}", res);
        }
        return  res;
    }

    /**
     * 删除用户属性
     * @param userAttrs
     */
    public  IMActionResponse  imRemoveAttr(List<UserAttrsRemoveResponse> userAttrs){
        String url = InitHelper.getInstance().imRequestAddress.getImRemoveAttr();
        String queryString = joiner.join(getDefaultParams());
        Map<String, Object> requestBody = ImmutableMap.of("UserAttrs", userAttrs);
        IMActionResponse res = request(url + queryString, requestBody, IMActionResponse.class);
        if (!res.isSuccess()) {
            log.error("删除用户属性失败, response message is: {}", res);
        }
        return  res;
    }

    /**
     * 获取APP中的所有群组
     * @param groups
     */
    public  IMActionResponse  groupOpenHttpSvc(GroupsQuery groups){
        String url = InitHelper.getInstance().imRequestAddress.getGroupOpenHttpSvc();
        String queryString = joiner.join(getDefaultParams());
        IMActionResponse res = request(url + queryString, groups, IMActionResponse.class);
        if (!res.isSuccess()) {
            log.error("获取APP中的所有群组失败, response message is: {}", res);
        }
        return  res;
    }

    /**
     * 创建群组 公开群人数：2000
     * @param groups
     */
    public  IMActionResponse  createGroup(Group groups){
        String url = InitHelper.getInstance().imRequestAddress.getCreateGroup();
        String queryString = joiner.join(getDefaultParams());
        IMActionResponse res = request(url + queryString, groups, IMActionResponse.class);
        if (!res.isSuccess()) {
            log.error("创建群组失败, response message is: {}", res);
        }
        return  res;
    }

    /**
     * 获取群组详细资料
     * @param groups
     */
    public  IMActionResponse  getGroupInfo(String... groups){
        String url = InitHelper.getInstance().imRequestAddress.getGroupInfo();
        String queryString = joiner.join(getDefaultParams());
        Map<String, Object> requestBody = ImmutableMap.of("GroupIdList", groups);
        IMActionResponse res = request(url + queryString, requestBody, IMActionResponse.class);
        if (!res.isSuccess()) {
            log.error("获取群组详细资料失败, response message is: {}", res);
        }
        return  res;
    }



    /**
     * 获取默认设置的im admin 账号的usersig
     *
     * @return
     */
    public String getIMAdminUsersig() {
        if (StringUtils.isEmpty(config.getDefaultImAdminAccount())) {
            log.error("TencentIMConfig.defaultImAdminAccount不存在");
        }
        return getIMAdminUsersig(config.getDefaultImAdminAccount());
    }

    /**
     * 返回默认的参数
     *
     * @return
     */
    private Map<String, String> getDefaultParams() {
        Map<String, String> pathParams = Maps.newHashMap();
        pathParams.put("usersig", getIMAdminUsersig());
        pathParams.put("identifier", config.getDefaultImAdminAccount());
        pathParams.put("sdkappid", config.getSdkAppid());
        pathParams.put("random", UUID.randomUUID().toString().replace("-", "").toLowerCase());
        pathParams.put("contenttype", "json");
        return pathParams;
    }

    private <T> T request(String url, Object params, Class<T> cls) {
        return toBean(requestInvoke(url, params), cls);
    }


    /**
     * http 请求service
     * @param url
     * @param params
     * @return
     */
    private String requestInvoke(String url, Object params) {
        String json = null;
        try {
            json = HttpClientUtil.sendJsonData(url, JsonUtils.obj2Str(params));
            log.info("request url {}, the params is: {}", url, objectMapper.writeValueAsString(params));
            log.info("request result is {}",json );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  json;
    }


    private <T> T toBean(String json, Class<T> cls) {
        try {
            return objectMapper.readValue(json, cls);
        } catch (IOException e) {
            log.error("json:{} 转换类型失败: {} ", json, cls);
            log.error(e.getMessage(), e);
        }
        return null;
    }

    /**
     * 获取im admin 账号的usersig
     *
     * @param identifier
     * @return
     */
    public String getIMAdminUsersig(String identifier) {
        String usersig = _getIMAdminUsersig(identifier);
        if (StringUtils.isEmpty(usersig)) {
            usersig = genUsersig(identifier);
               cacheIMAdminUsersig(identifier, usersig);
        }
        return usersig;
    }

    /**
     * 缓存identifier，usersig
     * @param identifier
     * @param usersig
     */
    private void cacheIMAdminUsersig(String identifier, String usersig) {
        InitHelper.stringRedisTemplate.opsForValue().set(identifier,usersig);
    }
    /**
     * 缓存中取账号usersig
     * @param identifier
     * @return
     */
    private String _getIMAdminUsersig(String identifier) {
        return  InitHelper.stringRedisTemplate.opsForValue().get(identifier);
    }
    /**
     * 删除缓存中的账号 usersig
     */
    private void _delMAdminUsersig(String identifier) {
        InitHelper.stringRedisTemplate.delete(identifier);
    }
}
