package com.andrbezr2016.tasksoop.math;

import java.util.Arrays;

public class MyPolynomial {

    private final double[] coeffs;

    public MyPolynomial(double... coeffs) {
        if (coeffs == null || coeffs.length == 0) {
            this.coeffs = new double[]{0};
        } else if (coeffs[coeffs.length - 1] == 0) {
            int newLength = coeffs.length;
            while (newLength > 1 && coeffs[newLength - 1] == 0) {
                newLength--;
            }
            this.coeffs = Arrays.copyOf(coeffs, newLength);
        } else {
            this.coeffs = coeffs;
        }
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = getDegree(); i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (coeffs[i] > 0) {
                    stringBuilder.append("+");
                }

                if (i == 0) {
                    stringBuilder.append(coeffs[i]);
                } else if (i == 1) {
                    stringBuilder.append(coeffs[i]).append("x");
                } else {
                    stringBuilder.append(coeffs[i]).append("x^").append(i);
                }
            }
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.append("0");
        }
        return stringBuilder.toString();
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = getDegree(); i >= 0; i--) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        double[] newCoeffs = this.getDegree() >= right.getDegree() ?
                addCalculate(right, this) : addCalculate(this, right);
        return new MyPolynomial(newCoeffs);
    }

    private double[] addCalculate(MyPolynomial minPolynomial, MyPolynomial maxPolynomial) {
        double[] newCoeffs = maxPolynomial.coeffs.clone();
        for (int i = 0; i < minPolynomial.getDegree() + 1; i++) {
            newCoeffs[i] += minPolynomial.coeffs[i];
        }
        return newCoeffs;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] newCoeffs = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i < newCoeffs.length; i++) {
            for (int j = 0; j <= i; j++) {
                double a = 0;
                double b = 0;
                if (j <= this.getDegree() && i - j <= right.getDegree()) {
                    a = this.coeffs[j];
                    b = right.coeffs[i - j];
                }
                newCoeffs[i] += a * b;
            }
        }
        return new MyPolynomial(newCoeffs);
    }
}
