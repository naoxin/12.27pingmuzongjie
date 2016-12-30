package com.result.guangbo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements IListener{

    private TextView tv_a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_a = (TextView)findViewById(R.id.te);
        tv_a.setText("刘冬冬！！！");
        //注册监听器
        ListenerManager.getInstance().registerListtener(this);

    }
    public void guang(View v){
        Intent intent = new Intent();
        intent.setClass(this, Main2Activity.class);
        startActivity(intent);
    }

    @Override
    public void notifyAllActivity(String str) {
        tv_a.setText(str);
    }
}
