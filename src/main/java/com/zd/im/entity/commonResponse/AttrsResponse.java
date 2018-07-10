package com.zd.im.entity.commonResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author : cw
 * @create : 2018 - 07 - 10
 */
@JsonInclude( JsonInclude.Include.NON_NULL)
public class AttrsResponse {

        /**
         * 性别
         */
        @JsonProperty("sex")
        private String sex;

        /**
         * 城市
         */
        @JsonProperty("city")
        private String city;

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
}
