package net.lz1998.pbbot.plugin;

import lombok.extern.slf4j.Slf4j;
import net.lz1998.pbbot.bot.Bot;
import net.lz1998.pbbot.bot.BotPlugin;
import net.lz1998.pbbot.utils.Msg;
import onebot.OnebotBase;
import onebot.OnebotEvent;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class DemoPlugin extends BotPlugin {

    @Override
    public int onPrivateMessage(@NotNull Bot bot, @NotNull OnebotEvent.PrivateMessageEvent event) {
        long userId = event.getUserId();
        String msg = event.getRawMessage();
        Msg sendMsg;
        if(msg.startsWith("#")){
            sendMsg = Msg.builder()
                    .face(4)
                    .text("hello!")
                    .text("耗子尾汁")
                    .image("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1516308740,1469782608&fm=11&gp=0.jpg");
        }else {
            sendMsg = Msg.builder()
                    .face(1)
                    .text("hello1")
                    .text("hello2");
        }
        bot.sendPrivateMsg(userId, sendMsg, false);
        return MESSAGE_BLOCK;
    }


    @Override
    public int onGroupMessage(@NotNull Bot bot, @NotNull OnebotEvent.GroupMessageEvent event) {
        long groupId = event.getGroupId();
        long userId = event.getUserId();
        String getMsg = event.getRawMessage();
        //log.info("接收成功群号{}，个人号{}，内容{}",groupId,userId,getMsg);
        Msg sendMsg;
        if (getMsg.startsWith("#")){
            switch (getMsg.replace("#","").replace(" ","")){
                case "来点色图":
                    sendMsg = Msg.builder()
                            .at(userId)
                            .face(178)
                            .text("小伙子，耗子尾汁！")
                            .image("http://gchat.qpic.cn/gchatpic_new/469021548/667059626-3088001736-DEA2B0E0BDAF3DA85AEB84EB7F3180B6/0?term=3")
                            ;break;
                case "不是吧":
                    sendMsg = Msg.builder()
                            .at(userId)
                            .face(277)
                            .text("不是吧！啊sir")
                            .image("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2271924522,4000613224&fm=26&gp=0.jpg")
                            ;break;
                default:sendMsg = Msg.builder()
                        .at(userId)
                        .face(268)
                        .text("你在说啥我咋听不懂啊！")
                        .image("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=4165329404,657358694&fm=26&gp=0.jpg")
                        ;break;
            }
            bot.sendGroupMsg(groupId,sendMsg,false);
        }
        return MESSAGE_BLOCK;
    }
}
