package com.adam.multiplelogin;

import android.view.View;


public final class QQButtonCallback implements View.OnClickListener{
    IButton callback;
    public QQButtonCallback(IButton mCallback){
        callback = mCallback;
    }
    @Override
    public  void onClick(View view){
        callback.onQQClick();
    }

}
