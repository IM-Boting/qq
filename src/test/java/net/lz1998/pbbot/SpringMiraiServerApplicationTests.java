package net.lz1998.pbbot;

import net.lz1998.pbbot.service.ImageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@WebAppConfiguration
class SpringMiraiServerApplicationTests {

    @Autowired
    ImageService imageService;
    @Test
    void contextLoads() {
        //imageService.getFilesName();
        System.out.println(imageService.getRandomImageUrl());
        System.out.println(imageService.getRandomImageUrl());
    }

}
