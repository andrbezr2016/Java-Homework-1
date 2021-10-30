package com.andrbezr2016.tasksoop.figures;

import java.util.Objects;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ",width=" + width +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Float.compare(this.length, rectangle.length) == 0 && Float.compare(this.width, rectangle.width) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Float.hashCode(length);
        result = 31 * result + Float.hashCode(width);
        return result;
    }
}
