package com.batmafia.batbus.activity;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.batmafia.batbus.view.View;

public class BaseActivity extends AppCompatActivity implements View {

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
