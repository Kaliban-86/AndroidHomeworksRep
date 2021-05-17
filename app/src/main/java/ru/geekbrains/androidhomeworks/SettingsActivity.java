package ru.geekbrains.androidhomeworks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity {
    private static final String NameSharedPreference = "LOGIN";
    private static final String appTheme = "APP_THEME";

    int var;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        var = R.style.StyleForSettingsTestOne;
        setTheme(var);
        setContentView(R.layout.activity_settings);

        Button buttonReturn = findViewById(R.id.buttonReturn);
        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        Button buttonTheme = findViewById(R.id.buttonTheme);
        buttonTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var = R.style.StyleForSettingsTestTwo;
                recreate();
            }
        });

    }
}