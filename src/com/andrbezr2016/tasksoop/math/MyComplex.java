package com.andrbezr2016.tasksoop.math;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (imag >= 0 || Double.isNaN(real) && Double.isNaN(imag)) {
            return "(" + real + "+" + imag + "i)";
        }
        return "(" + real + imag + "i)";
    }

    public boolean isReal() {
        return real == 0 ? false : true;
    }

    public boolean isImaginary() {
        return imag == 0 ? false : true;
    }

    public boolean equals(double real, double imag) {
        double eps = 1E-5;
        return Math.abs(real - this.real) < eps && Math.abs(imag - this.imag) < eps;
    }

    public boolean equals(MyComplex another) {
        if (this == another) return true;
        if (another == null) return false;
        double eps = 1E-5;
        return Math.abs(another.real - this.real) < eps && Math.abs(another.imag - this.imag) < eps;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        return Math.atan(imag / real);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        this.real = this.real * right.real - this.imag * right.imag;
        this.imag = this.real * right.imag - this.imag * right.real;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        this.real = (this.real * right.real + this.imag * right.imag) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        this.imag = (this.imag * right.real - this.real * right.imag) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }
}
