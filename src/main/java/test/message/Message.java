package test.message;

import com.ullink.slack.simpleslackapi.*;

public class Message {

    // クラスフィールド
    // チャンネル名は定数として扱われるためfinal修飾子を指定
    private static final String channelName = "general";

    /**
     * メッセージ送信
     * @param session SlackSessionオブジェクト
     * @return メッセージ送信に成功したか、失敗したか
     */
    public boolean sendMessage(SlackSession session) {
        SlackChannel channel = session.findChannelByName(channelName);
        String message = "Hello World!";

        try {
            // generalチャンネルに送信する
            session.sendMessage(channel, message);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
