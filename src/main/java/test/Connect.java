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

        // Sendインスタンスを作成する
        Send send = new Send();
        // メッセージを送信する
        send.sendMessage(session);

        session.disconnect();
    }

}
