package ru.geekbrains.androidhomeworks;

import java.io.Serializable;

public class Calculat implements Serializable {

    private float leftNum;
    private float rightNum;
    private String display = "";
    private String displayResult = "";


    public float summ() {
        return leftNum + rightNum;
    }

    public float subtraction() {
        return leftNum - rightNum;
    }

    public float multiply() {
        return leftNum * rightNum;
    }

    public float split() {
        return leftNum / rightNum;
    }
    public float persent() {
        return leftNum / 100;
    }

    public void setLeftNum(float leftNum) {
        this.leftNum = leftNum;
    }

    public void setRightNum(float rightNum) {
        this.rightNum = rightNum;
    }

    public void setDisplay(String displayText) {
        this.display = display + displayText;
    }

    public void resetDisplay() {
        display = "";
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplayResult(String displayResult) {
        this.displayResult = displayResult;
    }

    public String getDisplayResult() {
        return displayResult;
    }
}
