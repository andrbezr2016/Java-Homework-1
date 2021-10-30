package com.andrbezr2016.tasksoop.points;

import java.util.Objects;

public class MyPoint {

    private double x = 0;
    private double y = 0;

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double[] getXY() {
        return new double[]{x, y};
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(double x, double y) {
        double xx = Math.pow(this.x - x, 2);
        double yy = Math.pow(this.y - y, 2);
        return Math.sqrt(xx + yy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPoint point = (MyPoint) o;
        return Double.compare(this.x, point.x) == 0 && Double.compare(this.y, point.y) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Double.hashCode(x);
        result = 31 * result + Double.hashCode(y);
        return result;
    }

    public double distance(MyPoint another) {
        double xx = Math.pow(this.x - another.x, 2);
        double yy = Math.pow(this.y - another.y, 2);
        return Math.sqrt(xx + yy);
    }

    public double distance() {
        double xx = Math.pow(this.x, 2);
        double yy = Math.pow(this.y, 2);
        return Math.sqrt(xx + yy);
    }
}


