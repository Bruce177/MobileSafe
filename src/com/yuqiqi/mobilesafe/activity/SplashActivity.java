package com.yuqiqi.mobilesafe.activity;

import com.yuqiqi.mobilesafe.R;
import com.yuqiqi.mobilesafe.R.layout;
import com.yuqiqi.mobilesafe.utils.PackageUtils;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SplashActivity extends Activity {
	private TextView mTvVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        
        mTvVersion = (TextView) findViewById(R.id.splash_tv_version);
        mTvVersion.setText(PackageUtils.getVersionName(this));
    }
}
