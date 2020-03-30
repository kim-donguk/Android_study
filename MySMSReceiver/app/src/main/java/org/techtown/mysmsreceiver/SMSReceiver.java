package org.techtown.mysmsreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SMSReceiver extends BroadcastReceiver {
    private static final String TAG = "SmsReceiver";
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, " onREceive()호출됨");
        Bundle bundle = intent.getExtras();
        SmsMessage[] messages = parseSmsMessage(bundle);
        if(messages.length > 0){
            String sender = messages[0].getOriginatingAddress() // 보낸 사람의 정보
;           Log.d(TAG,"sender" + sender);

            String contents = messages[0].getMessageBody().toString(); // 메세지 내용
            Log.d(TAG, "contents :" + contents);

            Date receivedDate = new Date(messages[0].getTimestampMillis()); //메세지가 온 시간을 데이터화
            Log.d(TAG, "receiveDate : " + receivedDate);

            sedToActivitiy(context, sender, contents, receivedDate);
        }
    }
    private void sedToActivitiy(Context context, String sender, String contents, Date receivedDate){
        Intent intent = new Intent(context, SmsActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|
                        Intent.FLAG_ACTIVITY_SINGLE_TOP|
                        Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("sender", sender);
        intent.putExtra("content", contents);
        intent.putExtra("receivedDate", format.format(receivedDate));

        context.startActivity(intent);
    }
    private SmsMessage[] parseSmsMessage(Bundle bundle) {
        Object[] objs = (Object[]) bundle.get("pdus");
        SmsMessage[] messages = new SmsMessage[objs.length];

        for (int i = 0; i < objs.length; i++) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                String format = bundle.getString("format");
                SmsMessage.createFromPdu((byte[]) objs[i], format);
            } else {
                SmsMessage.createFromPdu((byte[]) objs[i]);
            }
        }
        return messages;
    }
}
