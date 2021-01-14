package net.lz1998.pbbot.init;

import lombok.extern.slf4j.Slf4j;
import net.lz1998.pbbot.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * @文件名 :   net.lz1998.pbbot.init
 * @作者 :     Boting
 * @时间 :     2021/1/14 16:28
 * @功能描述：
 */
@Order(1)
@Component
@Slf4j
public class MyApplicationRunner1 implements ApplicationRunner {
    @Autowired
    ImageService imageService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("初始化image文件夹");
        imageService.getFilesName();
    }
}
