package net.lz1998.pbbot.service.impl;

import lombok.extern.slf4j.Slf4j;
import net.lz1998.pbbot.service.ImageService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Arrays;
import java.util.Random;

/**
 * @文件名 :   net.lz1998.pbbot.service.impl
 * @作者 :     Boting
 * @时间 :     2021/1/14 15:07
 * @功能描述：
 */
@Service
@Slf4j
public class ImageServiceImpl implements ImageService {
    static File[] files;
    static final String PATH = "/mydata/image/";//"D:/image/";
    static String URL = "http://116.62.176.99:8081/";
    static Random random = new Random();

    @Override
    public void getFilesName() {
        File f = new File(PATH);
        if(!f.exists()){
            log.info(PATH+"文件不存在");
            return;
        }
        files = f.listFiles();

    }

    @Override
    public String getRandomImageUrl() {
        int index = random.nextInt(files.length);
        return URL+files[index].getName();
    }

    @Override
    public void updateImage() {

    }
}
