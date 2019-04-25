package com.example.android.bluetoothlegatt;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class BindButton extends Activity {
    public String button_code = SettingsActivity.button_code;

    public void bindButton(String newKey){
        if (button_code == "1"){
            BluetoothLeService.b1_intent = newKey;
        }

        else if (button_code == "2"){
            BluetoothLeService.b2_intent = newKey;
        }

        else if (button_code == "3"){
            BluetoothLeService.b3_intent = newKey;
        }

        else if (button_code == "4"){
            BluetoothLeService.b4_intent = newKey;
        }
    }

    public void bindChrome(View v){
        bindButton("Chrome");
        finish();
    }

    public void bindMail(View v){
        bindButton("Mail");
        finish();
    }

    public void bindPhone(View v){
        bindButton("Phone");
        finish();
    }

    public void bindSMS(View v){
        bindButton("SMS");
        finish();
    }

    public void bindCamera(View v){
        bindButton("Camera");
        finish();
    }

    public void bindTaktil(View v){
        bindButton("Taktil");
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setTitle("Button Bindings");
        setContentView(R.layout.activity_bind_button);
    }

}
