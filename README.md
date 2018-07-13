# IMActionJar
腾讯云IM,Java服务端Jar

根据腾讯云官方文档利用Java编写Server，因腾讯云现不支持Java。
官方在后台服务中调用 REST API，本质上是发起 HTTPS POST 请求。云通信提供了 Server SDK 来封装对 REST API 的调用，开发者可以将其直接集成到您的服务端代码中。


* PHP Server SDK；
* Node.js Server SDK；
* Java Server SDK ~~敬请期待~~ (完善中)；
* Golang Server SDK（敬请期待）。

现已完成：
# 缓存identifier usersig 存入Redis。

# 独立模式账号导入
account_import_address = https://console.tim.qq.com/v4/im_open_login_svc/account_import?
# 独立模式账户批量导入
multiaccount_import_address = https://console.tim.qq.com/v4/im_open_login_svc/multiaccount_import?
# 单发单聊消息
send_msg_address = https://console.tim.qq.com/v4/openim/sendmsg?
# 推送
im_push_address = https://console.tim.qq.com/v4/openim/im_push?
# 获取推送报告
im_get_push_report_address = https://console.tim.qq.com/v4/openim/im_get_push_report?
# 设置应用属性名称
im_set_attr_name_address = https://console.tim.qq.com/v4/openim/im_set_attr_name?
# 获取应用属性名称
im_get_attr_name_address = https://console.tim.qq.com/v4/openim/im_get_attr_name?
# 获取用户属性
im_get_attr_address = https://console.tim.qq.com/v4/openim/im_get_attr?
# 设置用户属性
im_set_attr_address = https://console.tim.qq.com/v4/openim/im_set_attr?

# 群组功能
# 获取APP中的所有群组
group_open_http_svc_address = https://console.tim.qq.com/v4/group_open_http_svc/get_appid_group_list?
# 创建群组
create_group_address = https://console.tim.qq.com/v4/group_open_http_svc/create_group?
# 获取群组详细资料
get_group_info_address = https://console.tim.qq.com/v4/group_open_http_svc/get_group_info?
# 增加群组成员
add_group_member_address = https://console.tim.qq.com/v4/group_open_http_svc/add_group_member?
# 删除群组成员
delete_group_member_address = https://console.tim.qq.com/v4/group_open_http_svc/delete_group_member?
# 解散群组
destroy_group_address = https://console.tim.qq.com/v4/group_open_http_svc/destroy_group?

持续更新...
