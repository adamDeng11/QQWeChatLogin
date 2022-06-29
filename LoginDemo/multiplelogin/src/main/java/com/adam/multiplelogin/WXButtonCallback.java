package com.adam.multiplelogin;

import android.view.View;


public final class WXButtonCallback implements View.OnClickListener {
    private IButton callback;
    public WXButtonCallback(IButton mcallback){
        callback=mcallback;
    }
    @Override
    public void onClick(View view){
        callback.onWeChatClick();
    }
}
