package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTests {
    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testTextMail(){
        mailClient.sendMail("129072358@qq.com", "TESTxxxxx", "Welcome.这是一封测试邮件" +
                "。@Autowired：Marks a **constructor**, **field**, **setter method** or **config method** as to " +
                "be autowired by Spring’s dependency injection facilities.");
    }

    @Test
    public void testHtmlMail() {
        // thymeleaf模板
        Context context = new Context();
        // 传入参数
        context.setVariable("username", "sunday");

        String content = templateEngine.process("/mail/demo", context);
        System.out.println(content);

        mailClient.sendMail("1290723581@qq.com", "HTML", content);
    }

}
