package net.lz1998.pbbot.task;

import lombok.extern.slf4j.Slf4j;
import net.lz1998.pbbot.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @文件名 :   net.lz1998.pbbot.task
 * @作者 :     Boting
 * @时间 :     2021/1/14 16:32
 * @功能描述：
 */
@Component
@Slf4j
public class ImageTask {
    @Autowired
    ImageService imageService;
    @Scheduled(cron = "0 0 6 * * *")
    public void upDateImage(){
        log.info("更新图片文件名");
        imageService.getFilesName();
    }
}
