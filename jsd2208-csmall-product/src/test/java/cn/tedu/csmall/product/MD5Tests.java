package cn.tedu.csmall.product;

import org.junit.jupiter.api.Test;
import org.springframework.util.DigestUtils;

public class MD5Tests {

    @Test
    void encode() {
        String salt = "3r3HDSLQrAqweHKFwyJfDtt4876oruiSJF4glui"; // 盐值
        String rawPassword = "123456";
        String encodedPassword = DigestUtils.md5DigestAsHex(
                (rawPassword + salt).getBytes());
        System.out.println("原文：" + rawPassword);
        System.out.println("密文：" + encodedPassword);
    }

}
