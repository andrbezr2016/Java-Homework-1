package com.andrbezr2016.tasksoop;

import com.andrbezr2016.tasksoop.balls.Ball;
import com.andrbezr2016.tasksoop.balls.Container;
import com.andrbezr2016.tasksoop.employees.Employee;
import com.andrbezr2016.tasksoop.figures.Circle;
import com.andrbezr2016.tasksoop.figures.Rectangle;
import com.andrbezr2016.tasksoop.books.Author;
import com.andrbezr2016.tasksoop.books.Book;
import com.andrbezr2016.tasksoop.math.MyComplex;
import com.andrbezr2016.tasksoop.math.MyPolynomial;
import com.andrbezr2016.tasksoop.points.MyPoint;
import com.andrbezr2016.tasksoop.points.MyTriangle;

public class Main {
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("==Figures==");

        Circle circle = new Circle(2, "green");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("==Employee==");

        Employee employee = new Employee(1, "Ivan", "Ivanov", 10000);
        System.out.println(employee);
        System.out.println("Annual salary: " + employee.getAnnualSalary());
        employee.raiseSalary(40);
        System.out.println("The salary has been raised by 40 percent!");
        System.out.println(employee);
        System.out.println("Annual salary: " + employee.getAnnualSalary());
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("==Book==");

        Author ivan = new Author("Ivan", "ivan@email.com", 'm');
        Author anna = new Author("Anna", "anna@email.com", 'f');
        Book book = new Book("Book", new Author[]{ivan, anna}, 500.0);
        System.out.println(book);
        System.out.println("Author names: " + book.getAuthorNames());

        Author[] authors = book.getAuthors();
        authors[0] = new Author("John", "john@email.com", 'm');
        System.out.println(book);
        System.out.println("Author names: " + book.getAuthorNames());

        Book emptyBook = new Book("EmptyBook", new Author[]{}, 250.0);
        System.out.println(emptyBook);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("==Triangle==");

        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(1, 0);
        MyPoint point3 = new MyPoint(2, 1);

        MyTriangle triangle1 = new MyTriangle(point1, point2, point3);
        System.out.println(triangle1);
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println("Type: " + triangle1.getType());

        MyTriangle triangle2 = new MyTriangle(0, 0, 1, 1, 2, 0);
        System.out.println(triangle2);
        System.out.println("Perimeter: " + triangle2.getPerimeter());
        System.out.println("Type: " + triangle2.getType());
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("==Complex==");

        MyComplex myComplex1 = new MyComplex(2, -2);
        MyComplex myComplex2 = new MyComplex(4, 1);
        MyComplex myComplex3 = new MyComplex(-2, -3);
        MyComplex myComplex4 = myComplex2.addNew(myComplex3);
        MyComplex myComplex5 = new MyComplex(0, 0);

        System.out.println(myComplex1);
        System.out.println("Magnitude: " + myComplex1.magnitude());
        System.out.println("Argument: " + myComplex1.argument());
        System.out.println("Conjugate: " + myComplex1.conjugate());
        System.out.println("4+1i + -2-3i = " + myComplex4 + " " + myComplex4.equals(2, -2));
        System.out.println("IsNaN: " + myComplex1.divide(myComplex5));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("==Polynomial==");

        MyPolynomial myPolynomial1 = new MyPolynomial(new double[]{0});
        MyPolynomial myPolynomial2 = new MyPolynomial(new double[]{-1});
        MyPolynomial myPolynomial3 = new MyPolynomial(new double[]{-1, -2});
        MyPolynomial myPolynomial4 = new MyPolynomial(new double[]{1, 2, 3, 4});
        MyPolynomial myPolynomial5 = new MyPolynomial(new double[]{0, 0, 3, 4});
        MyPolynomial myPolynomial6 = new MyPolynomial(new double[]{1, 0, 0, 4, 0, 0});
        MyPolynomial myPolynomial7 = myPolynomial4.add(myPolynomial6);
        MyPolynomial myPolynomial8 = myPolynomial4.multiply(myPolynomial6);

        System.out.println("Polynomial: " + myPolynomial1);
        System.out.println("Degree: " + myPolynomial1.getDegree());
        System.out.println("Evaluate: " + myPolynomial1.evaluate(2));

        System.out.println("Polynomial: " + myPolynomial2);
        System.out.println("Degree: " + myPolynomial2.getDegree());
        System.out.println("Evaluate: " + myPolynomial2.evaluate(2));

        System.out.println("Polynomial: " + myPolynomial3);
        System.out.println("Degree: " + myPolynomial3.getDegree());
        System.out.println("Evaluate: " + myPolynomial3.evaluate(2));

        System.out.println("Polynomial: " + myPolynomial4);
        System.out.println("Degree: " + myPolynomial4.getDegree());
        System.out.println("Evaluate: " + myPolynomial4.evaluate(2));

        System.out.println("Polynomial: " + myPolynomial5);
        System.out.println("Degree: " + myPolynomial5.getDegree());
        System.out.println("Evaluate: " + myPolynomial5.evaluate(2));

        System.out.println("Polynomial: " + myPolynomial6);
        System.out.println("Degree: " + myPolynomial6.getDegree());
        System.out.println("Evaluate: " + myPolynomial6.evaluate(2));

        System.out.println("Polynomial: " + myPolynomial7);
        System.out.println("Degree: " + myPolynomial7.getDegree());
        System.out.println("Evaluate: " + myPolynomial7.evaluate(2));

        System.out.println("Polynomial: " + myPolynomial8);
        System.out.println("Degree: " + myPolynomial8.getDegree());
        System.out.println("Evaluate: " + myPolynomial8.evaluate(2));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("==Ball==");
        Container container = new Container(0, 0, 200, 200);
        System.out.println(container);
        Ball ball = new Ball(100, 100, 10, 100, 90);
        System.out.println(ball);
        System.out.println("The ball is in the container? " + container.collides(ball));
        ball.move();
        System.out.println(ball);
        System.out.println("The ball is in the container? " + container.collides(ball));
        ball.reflectVertical();
        ball.move();
        System.out.println(ball);
        System.out.println("The ball is in the container? " + container.collides(ball));
    }
}
