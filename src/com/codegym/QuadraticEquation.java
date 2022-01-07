package com.codegym;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    //Xây dựng phương thức khởi tạo không tham số
    public QuadraticEquation() {

    }

    // Xây dựng phương thức khởi tạo có tham số
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // Xây dựng hàm get/set

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    // Xây dựng hàm tính giá trị delta
    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

}
