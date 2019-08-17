package com.tlq.securitydemoone.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Description: Spring Security密码编码方式配置
 * @Author: TanLinQuan
 * @Date: 2019/8/17 16:11
 * @Version: V1.0
 **/
public class Password implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
