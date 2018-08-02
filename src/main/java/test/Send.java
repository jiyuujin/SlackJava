package test;

import com.ullink.slack.simpleslackapi.SlackSession;
import test.message.Message;
import test.util.Log;

// アクセス修飾子無しはパッケージプライベート
class Send {
    /**
     * メッセージを送信する
     * @param session SlackSessionオブジェクト
     */
    void sendMessage(SlackSession session) {
        // Messageインスタンスを作成する
        Message message = new Message();
        // generalチャンネルにメッセージを送信する
        if (message.sendToGeneralChannel(session)) {
            // 成功した
            Log.printLog(true);
        } else {
            // 失敗した
            Log.printLog(false);
        }
    }
}
