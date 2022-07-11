package com.adam.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.adam.multiplelogin.IButton;
import com.adam.multiplelogin.LoginThroughTencent;

public class MainActivity extends AppCompatActivity implements IButton {
    static LoginThroughTencent loginThroughTencent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginThroughTencent = new LoginThroughTencent(this);

        loginThroughTencent.setOnclickCallback(this);
        loginThroughTencent.showMultipleLogin();

        findViewById(R.id.btn_show).setOnClickListener(view->{
            loginThroughTencent.showMultipleLogin();

        });
    }

    @Override
    public void onQQClick() {

        loginThroughTencent.hideMultipleLogin();
        Toast.makeText(this,"QQ登录",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onWeChatClick() {
        loginThroughTencent.hideMultipleLogin();
        Toast.makeText(this,"Wechat登录",Toast.LENGTH_SHORT).show();

    }
}