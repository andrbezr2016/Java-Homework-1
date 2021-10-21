package com.andrbezr2016.tasksoop.math;

import java.util.Arrays;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        if (coeffs != null && coeffs.length > 0 && coeffs[coeffs.length - 1] == 0) {
            int new_length = coeffs.length;
            while (new_length > 0 && coeffs[new_length - 1] == 0) {
                new_length--;
            }
            this.coeffs = Arrays.copyOf(coeffs, new_length);
        } else {
            this.coeffs = coeffs;
        }
    }

    public int getDegree() {
        if (coeffs != null) {
            return coeffs.length - 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = getDegree(); i >= 0; i--) {
            if (i == 0) {
                stringBuilder.append(coeffs[i]);
            } else if (i == 1) {
                stringBuilder.append(coeffs[i]).append("x");
            } else {
                stringBuilder.append(coeffs[i]).append("x^").append(i);
            }

            if (i >= 1 && coeffs[i - 1] >= 0) {
                stringBuilder.append("+");
            }
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
        double[] new_coeffs = this.getDegree() >= right.getDegree() ?
                new double[this.getDegree() + 1] : new double[right.getDegree() + 1];
        for (int i = 0; i < new_coeffs.length; i++) {
            new_coeffs[i] = this.coeffs[i] + right.coeffs[i];
        }
        return new MyPolynomial(new_coeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] new_coeffs = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i < new_coeffs.length; i++) {
            for (int j = 0; j <= i; j++) {
                double a = 0;
                double b = 0;
                if (j <= this.getDegree() && i - j <= right.getDegree()) {
                    a = this.coeffs[j];
                    b = right.coeffs[i - j];
                }
                new_coeffs[i] += a * b;
            }
        }
        return new MyPolynomial(new_coeffs);
    }
}
