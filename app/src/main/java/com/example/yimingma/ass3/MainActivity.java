package com.example.yimingma.ass3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void onBtnLinearClick() {
        Intent intent = new Intent(this, LinearLayout.class);
        startActivity(intent);
    }

    private void onBtnRelativeClick() {
        Intent intent = new Intent(this, RelativeLayout.class);
        startActivity(intent);
    }

    private void onBtnWebViewClick() {
        Intent intent = new Intent(this, WebView.class);
        startActivity(intent);
    }
}
