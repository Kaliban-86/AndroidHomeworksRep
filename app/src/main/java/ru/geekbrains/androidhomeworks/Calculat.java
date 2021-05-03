package ru.geekbrains.androidhomeworks;

public class Calculat {

    private int leftNum;
    private int rightNum;
    private String display = "";

    public int summ() {
        return leftNum + rightNum;
    }

    public int subtraction() {
        return leftNum - rightNum;
    }

    public int multiply() {
        return leftNum * rightNum;
    }

    public int split() {
        return leftNum / rightNum;
    }

    public void setLeftNum(int leftNum) {
        this.leftNum = leftNum;
    }

    public void setRightNum(int rightNum) {
        this.rightNum = rightNum;
    }

    public void setDisplay(String displayText) {
        this.display = display + displayText;
    }

    public void resetDisplay(){
        display = "";
    }

    public String getDisplay() {
        return display;
    }
}
