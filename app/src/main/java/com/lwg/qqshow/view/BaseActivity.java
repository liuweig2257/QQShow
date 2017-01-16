package com.lwg.qqshow.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by LWG on 2017/1/13.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void startActivity(Class clazz,boolean isFinish){
        Intent intent = new Intent(this,clazz);
        startActivity(intent);
        if(isFinish){
            this.finish();
        }
    }

}
