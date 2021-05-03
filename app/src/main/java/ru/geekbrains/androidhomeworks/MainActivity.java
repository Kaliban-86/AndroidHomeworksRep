package ru.geekbrains.androidhomeworks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    int num;
    int numToButton;
    char action;
    private TextView calcDisplay;
    private TextView equal;
    String calcDisplayContent = "0";
    String equalContent = "0";
    private Calculat calculat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculat = new Calculat();

        calcDisplay = findViewById(R.id.textView);
        equal = findViewById(R.id.textNumber);

        calcDisplay.setText(calcDisplayContent);
        equal.setText(equalContent);

        findViewById(R.id.button_0).setOnClickListener(v -> {
            forNumButtonAction(0);
        });

        findViewById(R.id.button_1).setOnClickListener(v -> {
            forNumButtonAction(1);
        });

        findViewById(R.id.button_2).setOnClickListener(v -> {
            forNumButtonAction(2);
        });

        findViewById(R.id.button_3).setOnClickListener(v -> {
            forNumButtonAction(3);
        });

        findViewById(R.id.button_4).setOnClickListener(v -> {
            forNumButtonAction(4);
        });

        findViewById(R.id.button_5).setOnClickListener(v -> {
            forNumButtonAction(5);
        });

        findViewById(R.id.button_6).setOnClickListener(v -> {
            forNumButtonAction(6);
        });

        findViewById(R.id.button_7).setOnClickListener(v -> {
            forNumButtonAction(7);
        });

        findViewById(R.id.button_8).setOnClickListener(v -> {
            forNumButtonAction(8);
        });

        findViewById(R.id.button_9).setOnClickListener(v -> {
            forNumButtonAction(9);
        });

        findViewById(R.id.button_summ).setOnClickListener(v -> {
            action = '+';
            forButtonAction(action);
        });

        findViewById(R.id.button_subtraction).setOnClickListener(v -> {
            action = '-';
            forButtonAction(action);
        });

        findViewById(R.id.button_multiply).setOnClickListener(v -> {
            action = '*';
            forButtonAction(action);
        });

        findViewById(R.id.button_split).setOnClickListener(v -> {
            action = '/';
            forButtonAction(action);
        });

        findViewById(R.id.button_reset).setOnClickListener(v -> {
            calculat.resetDisplay();
            calcDisplayContent = "0";
            num = 0;
            calcDisplay.setText(calcDisplayContent);
            equal.setText(calcDisplayContent);
        });

        findViewById(R.id.button_equal).setOnClickListener(v -> {

            calculat.setRightNum(num);

            if (action == '+') {
                equalContent = "" + calculat.summ();
                num = calculat.summ();
            } else if (action == '-') {
                equalContent = "" + calculat.subtraction();
                num = calculat.subtraction();
            } else if (action == '*') {
                equalContent = "" + calculat.multiply();
                num = calculat.multiply();
            } else if (action == '/') {
                equalContent = "" + calculat.split();
                num = calculat.split();
            }

            calcDisplay.setText(calculat.getDisplay());
            equal.setText(equalContent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void forNumButtonAction(int buttonNum) {
        calcDisplayContent = calcDisplayContent + buttonNum;
        num = Integer.parseInt(calcDisplayContent);
        calculat.setDisplay(String.format(Locale.getDefault(), "%d", buttonNum));
        calcDisplay.setText(calculat.getDisplay());
    }

    public void forButtonAction(char action) {
        calculat.setLeftNum(num);
        calculat.setDisplay(String.format(Locale.getDefault(), "%c", action));
        calcDisplay.setText(calculat.getDisplay());
        calcDisplayContent = "0";
        num = 0;
    }
}