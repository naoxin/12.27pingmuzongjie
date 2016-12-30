package com.result.guangbo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity implements IListener{

    private TextView tv_c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv_c = (TextView)findViewById(R.id.tv_b);
        ListenerManager.getInstance().registerListtener(this);
    }

    @Override
    public void notifyAllActivity(String str) {
        tv_c.setText(str);
    }
    public void btnClick(View v)
    {
        //发送广播通知所有注册该接口的监听器
        ListenerManager.getInstance().sendBroadCast("大家能收到我的信息吗");
    }
}
