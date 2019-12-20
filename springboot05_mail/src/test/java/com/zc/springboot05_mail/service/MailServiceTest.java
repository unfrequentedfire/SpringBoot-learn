package com.zc.springboot05_mail.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author JY
 * @date 2019/12/18 16:22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {
    @Resource
    private MailService mailService;
    @Resource
    private TemplateEngine templateEngine;

    @Test
    public void testSimpleMail() throws Exception {
        mailService.sendSimpleMail("2534568468@qq.com","test simple mail"," hello this is simple mail");
    }

    @Test
    public void testHtmlMail(){
        String content="<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail("2534568468@qq.com","test simple mail",content);
    }

    @Test
    public void sendAttachmentsMail() {
        String filePath="C:\\Users\\JY\\Desktop\\恋情的终结.mobi";
        mailService.sendAttachmentsMail("2534568468@qq.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
    }

    @Test
    public void sendInlineResourceMail() {
        String rscId ="id001";
        String content="<html><body>这是有图片的邮件：<img src=\"cid:" + rscId + "\" ></body></html>";
        String imgPath = "C:\\Users\\JY\\Desktop\\-144bb6b45495c13.jpg";

        mailService.sendInlineResourceMail("2534568468@qq.com", "主题：这是有图片的邮件", content, imgPath, rscId);
    }
}
