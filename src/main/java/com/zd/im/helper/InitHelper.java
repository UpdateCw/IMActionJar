package com.zd.im.helper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zd.im.entity.IMRequestAddress;
import com.zd.im.entity.TencentIMConfig;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author : cw
 * @create : 2018 - 07 - 05
 * 加载请求数据源
 */
public class InitHelper {

    private static  TencentIMHelper tencentIMHelper ;

    private static  InitHelper INITHELPER  ;

    public static  TencentIMConfig config;

    public static IMRequestAddress imRequestAddress;

    private InitHelper(){}

    public static  InitHelper getInstance(){
        if(INITHELPER == null){
            synchronized (InitHelper.class){
                    if(INITHELPER == null){
                        AbstractXmlApplicationContext appContext = new ClassPathXmlApplicationContext("/spring-bean.xml");
                        config = (TencentIMConfig)appContext.getBean("tncentIMConfig");
                        imRequestAddress = (IMRequestAddress)appContext.getBean("iMAddres");
                        INITHELPER = new InitHelper();
                    }
            }
        }
        return INITHELPER;
    }


    public synchronized   TencentIMHelper init(){
        if(tencentIMHelper != null){
            return  tencentIMHelper;
        }

        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("private_key");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        StringBuilder strBuilder = new StringBuilder();
        String s = "";
        try {
            while ((s = br.readLine()) != null) {
                strBuilder.append(s + '\n');
            }
            br.close();
            String priKey = strBuilder.toString();
            config.setPrivateKey(priKey);
            tencentIMHelper = new TencentIMHelper(config, new ObjectMapper());
            return tencentIMHelper;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
