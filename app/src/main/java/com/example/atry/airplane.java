package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.EditText;

public class airplane extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airplane);
        editText =findViewById(R.id.air);

    }
    private void SetAirplaneMode(boolean enabled){
        Settings.System.putInt(
                getContentResolver(),
                Settings.System.AIRPLANE_MODE_ON, enabled ? 1 : 0);
        Intent i = new Intent(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        i.putExtra("state", enabled);
        sendBroadcast(i);
    }
}