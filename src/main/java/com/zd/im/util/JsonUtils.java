package com.zd.im.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.SerializationException;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * @author : cw
 * @create : 2018 - 07 - 04
 * JSON工具
 */
public class JsonUtils {
    public static final ObjectMapper objectMapper = new ObjectMapper();
    public static final ObjectMapper INDENT_OUTPUT_OBJECT_MAPPER = new ObjectMapper();

    static {
        objectMapper.enable(MapperFeature.USE_GETTERS_AS_SETTERS);
        objectMapper.enable(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS);
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

//        INDENT_OUTPUT_OBJECT_MAPPER.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        INDENT_OUTPUT_OBJECT_MAPPER.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        INDENT_OUTPUT_OBJECT_MAPPER.enable(SerializationFeature.INDENT_OUTPUT);
        INDENT_OUTPUT_OBJECT_MAPPER.setSerializationInclusion(Include.NON_NULL);
    }

    private JsonUtils() {
    }

    /**
     * 将对象转换为字符转
     *
     * @param object
     * @return
     */
    public static String obj2Str(Object object) {
        String str = "";
        try {
            str = objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 将字符串转换为对象
     *
     * @param str
     * @param cls
     * @return
     */
    public static <T> T str2Obj(String str, Class<T> cls) {
        T object = null;
        try {
            object = objectMapper.readValue(str, cls);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return object;
    }

    /**
     * 对象存Json字符串于文件
     *
     * @param File   保存文件
     * @param object 数据存储对象
     */
    public static void writeValue(File File, Object object) {
        try {
            if (null != object) {
                INDENT_OUTPUT_OBJECT_MAPPER.writeValue(File, object);
            }
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    /**
     * 对象转为json字符串，不输出空属性
     * @param object
     */
    public static void writeValueWithoutNullValue(Object object) {
        try {
            if (null != object) {
                INDENT_OUTPUT_OBJECT_MAPPER.writeValueAsString(object);
            }
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }


    /**
     * 读取文件(json格式)并反序列化未指定对象
     *
     * @param File  读取文件
     * @param clazz 序列化对象
     * @return
     */
    public static <T> T readValue(File File, Class<T> clazz) {
        try {
            if (null != File) {
                return objectMapper.readValue(File, clazz);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
