package com.adam.multiplelogin;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;



public final class LoginThroughTencent {
    private Activity activity;
    private IButton callback;
    private ViewGroup.LayoutParams layoutParams;
    private View addview;
    public LoginThroughTencent(Activity mactivity){
        activity = mactivity;
    }
    //显示按钮
    public void showMultipleLogin(){
        if(activity!=null){
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    LayoutInflater inflater = (LayoutInflater)activity.getSystemService(activity.LAYOUT_INFLATER_SERVICE);
                    addview = inflater.inflate(R.layout.login_layout,null);
                    layoutParams =new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                    ImageView QQbutton = (ImageView)addview.findViewById(R.id.buttonQQ);
                    QQbutton.setOnClickListener(new QQButtonCallback(callback));
                    ImageView WXbutton = (ImageView)addview.findViewById(R.id.buttonWX);
                    WXbutton.setOnClickListener(new WXButtonCallback(callback));
                    activity.addContentView(addview,layoutParams);
                }
            });
        }
    }
    public void hideMultipleLogin(){
        if(activity!=null){
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    ((ViewGroup)addview.getParent()).removeView(addview);
                }
            });
        }
    }
    //设置按钮回调
    public void setOnclickCallback(IButton mcallback){
        callback = mcallback;
    }
}
