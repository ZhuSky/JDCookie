package com.app.jdcookie.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.widget.Toast;

import com.app.jdcookie.R;

public class SetActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);


        findViewById(R.id.set_back_image).setOnClickListener(this);
        findViewById(R.id.set_clear_cookie_layout).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.set_back_image) {

            onBackPressed();
        } else if (v.getId() == R.id.set_clear_cookie_layout) {
            //清除浏览器的cookie
            CookieManager instance = CookieManager.getInstance();
            instance.removeAllCookies(value -> Toast.makeText(SetActivity.this, "清除" + (value ? "成功" : "失败"), Toast.LENGTH_SHORT).show());
            instance.flush();
        }
    }
}