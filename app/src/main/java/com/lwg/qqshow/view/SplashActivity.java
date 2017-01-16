package com.lwg.qqshow.view;

import android.os.Bundle;

import com.lwg.qqshow.MainActivity;
import com.lwg.qqshow.R;
import com.lwg.qqshow.view.viewImpl.SplashView;

/**
 * Created by LWG on 2017/1/13.
 */

public class SplashActivity extends BaseActivity implements SplashView {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }


    @Override
    public void onLogin(boolean isLogin) {
        if(isLogin){
            startActivity(MainActivity.class,true);
        }else{
            startActivity(LoginActivity.class,true);
        }
    }
}
