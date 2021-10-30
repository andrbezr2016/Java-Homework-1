package com.andrbezr2016.tasksoop.math;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return Double.compare(this.real, myComplex.real) == 0 && Double.compare(this.imag, myComplex.imag) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Double.hashCode(real);
        result = 31 * result + Double.hashCode(imag);
        return result;
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
        double newReal = this.real * right.real - this.imag * right.imag;
        double newImag = this.real * right.imag + this.imag * right.real;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double divider = (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        double newReal = (this.real * right.real + this.imag * right.imag) / divider;
        double newImag = (this.imag * right.real - this.real * right.imag) / divider;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }
}
