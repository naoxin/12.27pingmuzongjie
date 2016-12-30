package com.result.guangbo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements IListener{

    private TextView tv_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_b = (TextView)findViewById(R.id.tv_b);
        ListenerManager.getInstance().registerListtener(this);
    }

    @Override
    public void notifyAllActivity(String str) {
        tv_b.setText(str);
    }
    public void btnClick(View v)
    {
        //b页面跳转到c页面
        Intent intent = new Intent();
        intent.setClass(this, Main3Activity.class);
        startActivity(intent);
    }
}
