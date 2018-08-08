import com.tls.sigcheck.tls_sigcheck;
import com.zd.im.entity.commonResponse.AttrsResponse;
import com.zd.im.entity.commonResponse.UserAttrsRemoveResponse;
import com.zd.im.entity.commonResponse.UserAttrsResponse;
import com.zd.im.helper.InitHelper;
import com.zd.im.helper.TencentIMHelper;
import com.zd.im.imReqEntity.group.AppMember;
import com.zd.im.imReqEntity.group.Group;
import com.zd.im.imReqEntity.group.GroupMember;
import com.zd.im.imReqEntity.group.GroupsQuery;
import com.zd.im.imReqEntity.user.User;
import com.zd.im.imReqEntity.message.Message;
import com.zd.im.imReqEntity.message.MsgBody;
import com.zd.im.imReqEntity.message.MsgContent;
import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.zd.im.helper.InitHelper.stringRedisTemplate;

/**
 * @author : cw
 * @create : 2018 - 07 - 05
 * 测试
 */
public class CompileJnisigcheckTest {

    /**
     * 本机导入账号
     * @throws IOException
     */
   public  void helperTest() throws IOException {
       TencentIMHelper helper = InitHelper.getInstance().init();
       helper.accountImport(new User("13981919959","浪","http://www.qq.com",0));

    }
    /**
     * 本机发送单聊消息
     * @throws IOException
     */
    public  void sendMsg() throws IOException {
        TencentIMHelper helper = InitHelper.getInstance().init();
        Message message = new Message();
        message.setSyncOtherMachine(2);
        message.setFromAccount("testadmin");
        message.setToAccount("test13");
        message.setMsgTimeStamp(3600);
        message.setMsgRandom(0);
        message.setMsgTimeStamp(5454457);
        ArrayList<MsgBody> msgBodies = new ArrayList<>();
        MsgBody msgBody = new MsgBody();
        msgBody.setMsgType("TIMTextElem");
        MsgContent msgContent = new MsgContent();
        msgContent.setText("我是消息");
        msgBody.setMsgContent(msgContent);
        msgBodies.add(msgBody);
        message.setMsgBody(msgBodies);
        helper.sendMsg(message);
    }

    /**
     * 设置用户属性
     */
    public void imSetAttr() throws UnsupportedEncodingException {
        TencentIMHelper helper = InitHelper.getInstance().init();
        List<UserAttrsResponse> list = new ArrayList<>();
        UserAttrsResponse userAttrsResponse = new UserAttrsResponse();
        userAttrsResponse.setToAccount("test13");
        AttrsResponse attrsResponse = new AttrsResponse();
        attrsResponse.setCity("成都");
        attrsResponse.setSex("男");
        userAttrsResponse.setAttrs(attrsResponse);
        list.add(userAttrsResponse);
        helper.imSetAttr(list);
    }

    /**
     * 获取用户属性
     */
    public void imGetAttr(){
        TencentIMHelper helper = InitHelper.getInstance().init();
        String[] str = {"testadmin"};
        helper.imGetAttr(str);
    }

    /**
     * 设置属性名称
     */
    public void imSetAttrName(){
        TencentIMHelper helper = InitHelper.getInstance().init();
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("0","sex");
        hashMap.put("1","city");
        helper.imSetAttrName(hashMap);
    }

    /**
     * 获取属性名称
     */
    public void imGetAttrName(){
        TencentIMHelper helper = InitHelper.getInstance().init();
        helper.imGetAttrName();
    }

    /**
     * 删除用户属性
     */
    public void imRemoveAttr(){
        TencentIMHelper helper = InitHelper.getInstance().init();
        List<UserAttrsRemoveResponse> list = new ArrayList<>();
        UserAttrsRemoveResponse userAttrsResponse = new UserAttrsRemoveResponse();
        userAttrsResponse.setToAccount("test13");
        List<String> stringList = new ArrayList<>();
        stringList.add("sex");
        stringList.add("city");
        userAttrsResponse.setAttrs(stringList);
        list.add(userAttrsResponse);
        helper.imRemoveAttr(list);
    }

    /**
     * 获取APP中的所有群组
     */
    public void groupOpenHttpSvc(){
        TencentIMHelper helper = InitHelper.getInstance().init();
        GroupsQuery groups = new GroupsQuery();
        helper.groupOpenHttpSvc(groups);
    }

    /**
     * 获取群组详细资料
     */
    public void createGroup(){
        TencentIMHelper helper = InitHelper.getInstance().init();
        Group groups = new Group();
        groups.setOwnerAccount("test13");
        groups.setType("Public");
        groups.setName("持续更新");
        helper.createGroup(groups);
    }

    /**
     * 根据账号生成签名
     */
    public void getIMAdminUsersig(){
        TencentIMHelper helper = InitHelper.getInstance().init();
        String identifier = "13981919959";
        helper.getIMAdminUsersig(identifier);
    }

    /**
     * 根据账号生成签名
     */
    public void genUsersig(){
        TencentIMHelper helper = InitHelper.getInstance().init();
        String identifier = "13981919959";
        helper.genUsersig(identifier);
    }

    /**
     * 获取群组详细资料
     */
    public void getGroupInfo(){
        TencentIMHelper helper = InitHelper.getInstance().init();
        String[] str = {"@TGS#2FTMZ7JFI"};
        helper.getGroupInfo(str);
    }

    /**
     * 添加群成员
     */
    public void addGroupMember(){
        TencentIMHelper helper = InitHelper.getInstance().init();
        GroupMember member = new GroupMember();
        member.setGroupId("@TGS#2FTMZ7JFI");
        List<AppMember> appMembers = new ArrayList<>();
        AppMember appMember = new AppMember();
        appMember.setMemberAccount("13981919959");
        appMembers.add(appMember);
        member.setMemberList(appMembers);
        helper.addGroupMember(member);
    }

    /**
     * 删除群成员
     */
    public void delGroupMember(){
        TencentIMHelper helper = InitHelper.getInstance().init();
        GroupMember member = new GroupMember();
        member.setGroupId("@TGS#2FTMZ7JFI");
        List<String> strings = new ArrayList<>();
        strings.add("13981919959");
        member.setMemberToDelAccount(strings);
        helper.deleteGroupMember(member);
    }

    public static void main(String[] args) throws IOException {
       /* CompileJnisigcheckTest jnisigcheckTest = new CompileJnisigcheckTest();
        jnisigcheckTest.addGroupMember();*/
        TencentIMHelper helper = InitHelper.getInstance().init();

        stringRedisTemplate.expire("14726123985",  30, TimeUnit.SECONDS);
        System.out.print(stringRedisTemplate.getExpire("14726123985", TimeUnit.SECONDS));
    }
    /**
     * 官方测试
     */
    public void test(){
    /*    tls_sigcheck sigcheck = new tls_sigcheck();
        sigcheck.loadJniLib("C:\\Users\\pzc\\Desktop\\IM\\jnisigcheck_mt_x64.dll");*/

        tls_sigcheck demo = new tls_sigcheck();

        // 使用前请修改动态库的加载路径
         demo.loadJniLib("C:\\Users\\pzc\\Desktop\\IM\\jnisigcheck_mt_x64.dll");
        //demo.loadJniLib("/home/tls/tls_sig_api/src/jnisigcheck.so");

        String priKey;
        try {
            try (InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("private_key")) {
                priKey = IOUtils.toString(in, "utf-8");
                int ret = demo.tls_gen_signature_ex2("1400073125", "zhidian2018", priKey);

                if (0 != ret) {
                    System.out.println("ret " + ret + " " + demo.getErrMsg());
                } else {
                    System.out.println("sig:\n" + demo.getSig());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        String pubKey;
        try {
            try (InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("public_key")) {
                pubKey = IOUtils.toString(in, "utf-8");
                int ret = demo.tls_check_signature_ex2(demo.getSig(), pubKey, "1400073125", "zhidian2018");
                if (0 != ret) {
                    System.out.println("ret " + ret + " " + demo.getErrMsg());
                } else {
                    System.out.println("--\nverify ok -- expire time " + demo.getExpireTime() + " -- init time " + demo.getInitTime());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
