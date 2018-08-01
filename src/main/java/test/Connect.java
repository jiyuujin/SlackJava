package test;

import com.ullink.slack.simpleslackapi.*;
import com.ullink.slack.simpleslackapi.impl.*;
import test.message.Message;
import test.util.Log;

import java.io.IOException;

public class Connect {

    // クラスフィールド
    // BotTokenは定数として扱われるためfinal修飾子を指定
    private static final String botToken = "xoxb-294501866708-398667584307-LyQ7KyVOQ6PiOeqTY4Pi7TYS";

    public static void main(String[] args) throws IOException {
        SlackSession session = SlackSessionFactory.createWebSocketSlackSession(botToken);

        session.connect();

        // Connectインスタンスを作成する
        Connect connect = new Connect();
        // メッセージを送信する
        connect.sendWithSession(session);

        session.disconnect();
    }

    /**
     * メッセージを送信する
     * @param session SlackSessionオブジェクト
     */
    private void sendWithSession(SlackSession session) {
        // Messageインスタンスを作成する
        Message message = new Message();
        // メッセージを送信する
        if (message.sendMessage(session)) {
            // 成功した
            Log.printLog(true);
        } else {
            // 失敗した
            Log.printLog(false);
        }
    }

}
