package com.andrbezr2016.tasksoop.points;

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


