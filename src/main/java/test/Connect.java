package test;

import com.ullink.slack.simpleslackapi.*;
import com.ullink.slack.simpleslackapi.impl.*;
import test.message.Message;

import java.io.IOException;

public class Connect {
    // クラスフィールド
    // Slack-bot Token
    private static final String botToken = "xoxb-294501866708-398667584307-LyQ7KyVOQ6PiOeqTY4Pi7TYS";

    public static void main(String[] args) throws IOException {
        SlackSession session = SlackSessionFactory.createWebSocketSlackSession(botToken);

        session.connect();

        Message messageInfo = new Message();
        messageInfo.getMessage(session);

        session.disconnect();
    }
}
