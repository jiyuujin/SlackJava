package test.message;

import com.ullink.slack.simpleslackapi.*;
import java.io.IOException;

public class Message {

    // クラスフィールド
    // チャンネル名は定数として扱われるためfinal修飾子を指定
    private static final String channelName = "general";

    /**
     * メッセージ送信
     * @param session Slack用セッション
     */
    public void getMessage(SlackSession session) {
        SlackChannel channel = session.findChannelByName(channelName);
        String message = "Hello World!";
        // generalチャンネルに送信する
        session.sendMessage(channel, message);
        System.out.println("送信しました: " + message);
    }

}
