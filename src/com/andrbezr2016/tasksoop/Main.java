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
        System.out.println("====");
        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("==Employee==");
        Employee employee = new Employee(1, "Ivan", "Ivanov", 10000);
        System.out.println(employee);
        System.out.println("Annual salary: " + employee.getAnnualSalary());
        employee.raiseSalary(40);
        System.out.println("*The salary has been raised by 40 percent!");
        System.out.println(employee);
        System.out.println("New annual salary: " + employee.getAnnualSalary());
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("==Book==");
        Author ivan = new Author("Ivan", "ivan@email.com", 'm');
        Author anna = new Author("Anna", "anna@email.com", 'f');
        Book book = new Book("MyBook", new Author[]{ivan, anna}, 500.0);
        System.out.println(book);
        System.out.println("Author names: " + book.getAuthorNames());
        System.out.println("====");
        Author[] authors = book.getAuthors();
        authors[0] = new Author("John", "john@email.com", 'm');
        System.out.println("*The author has been changed!");
        System.out.println(book);
        System.out.println("Author names: " + book.getAuthorNames());
        System.out.println("====");
        Book emptyBook = new Book("EmptyBook", new Author[]{}, 250.0);
        System.out.println(emptyBook);
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("==Triangle==");
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(1, 0);
        MyPoint point3 = new MyPoint(2, 1);
        MyTriangle triangle1 = new MyTriangle(point1, point2, point3);
        System.out.println(triangle1);
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println("Type: " + triangle1.getType());
        System.out.println("====");
        MyTriangle triangle2 = new MyTriangle(-1, 0, 1, 0, 0, 2);
        System.out.println(triangle2);
        System.out.println("Perimeter: " + triangle2.getPerimeter());
        System.out.println("Type: " + triangle2.getType());
        System.out.println("====");
        MyTriangle triangle3 = new MyTriangle(0, 0, 4, 0, 2, 2 * Math.sqrt(3));
        System.out.println(triangle3);
        System.out.println("Perimeter: " + triangle3.getPerimeter());
        System.out.println("Type: " + triangle3.getType());
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("==Complex==");

        MyComplex myComplex1 = new MyComplex(2, -2);
        MyComplex myComplex2 = new MyComplex(-4, 1);
        MyComplex myComplex3 = new MyComplex(-2, -3);
        MyComplex myComplex4 = new MyComplex(5, 5);
        MyComplex myComplex5 = myComplex1.addNew(myComplex2);
        MyComplex myComplex6 = myComplex3.subtractNew(myComplex4);

        System.out.println(myComplex1);
        System.out.println("Magnitude: " + myComplex1.magnitude());
        System.out.println("Argument: " + myComplex1.argument());
        System.out.println("Conjugate: " + myComplex1.conjugate());
        System.out.println("====");
        System.out.println(myComplex2);
        System.out.println("Magnitude: " + myComplex2.magnitude());
        System.out.println("Argument: " + myComplex2.argument());
        System.out.println("Conjugate: " + myComplex2.conjugate());
        System.out.println("====");
        System.out.println(myComplex3);
        System.out.println("Magnitude: " + myComplex3.magnitude());
        System.out.println("Argument: " + myComplex3.argument());
        System.out.println("Conjugate: " + myComplex3.conjugate());
        System.out.println("====");
        System.out.println(myComplex4);
        System.out.println("Magnitude: " + myComplex4.magnitude());
        System.out.println("Argument: " + myComplex4.argument());
        System.out.println("Conjugate: " + myComplex4.conjugate());
        System.out.println("====");
        System.out.println(myComplex1 + "+" + myComplex2 + "=" + myComplex5);
        System.out.println("====");
        System.out.println(myComplex3 + "-" + myComplex4 + "=" + myComplex6);
        System.out.println("====");
        System.out.println(myComplex1 + "*" + myComplex2 + "=" + myComplex1.multiply(myComplex2));
        System.out.println("====");
        System.out.println(myComplex1 + "/" + myComplex2 + "=" + myComplex1.divide(myComplex2));
        System.out.println("====");
        System.out.println(myComplex1 + "/(0.0+0.0i)=" + myComplex1.divide(new MyComplex(0, 0)));
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("==Polynomial==");

        MyPolynomial myPolynomial1 = new MyPolynomial(null);
        myPolynomial1.add(myPolynomial1);
        myPolynomial1.multiply(myPolynomial1);
        MyPolynomial myPolynomial2 = new MyPolynomial(1);
        MyPolynomial myPolynomial3 = new MyPolynomial(-1);
        MyPolynomial myPolynomial4 = new MyPolynomial(-1, -2);
        MyPolynomial myPolynomial5 = new MyPolynomial(1, 2, 3, 4);
        MyPolynomial myPolynomial6 = new MyPolynomial(0, 0, -3, 4);
        MyPolynomial myPolynomial7 = new MyPolynomial(1, 0, 0, -4, 0, 0);
        MyPolynomial myPolynomial8 = myPolynomial4.add(myPolynomial7);
        MyPolynomial myPolynomial9 = myPolynomial7.add(myPolynomial4);
        MyPolynomial myPolynomial10 = myPolynomial2.add(myPolynomial3);
        MyPolynomial myPolynomial11 = myPolynomial5.add(myPolynomial6);
        MyPolynomial myPolynomial12 = myPolynomial5.multiply(myPolynomial7);
        MyPolynomial myPolynomial13 = myPolynomial4.multiply(myPolynomial6);

        System.out.println("Polynomial: " + myPolynomial1);
        System.out.println("Degree: " + myPolynomial1.getDegree());
        System.out.println("Evaluate (x = 2): " + myPolynomial1.evaluate(2));
        System.out.println("====");
        System.out.println("Polynomial: " + myPolynomial2);
        System.out.println("Degree: " + myPolynomial2.getDegree());
        System.out.println("Evaluate (x = 2): " + myPolynomial2.evaluate(2));
        System.out.println("====");
        System.out.println("Polynomial: " + myPolynomial3);
        System.out.println("Degree: " + myPolynomial3.getDegree());
        System.out.println("Evaluate (x = 2): " + myPolynomial3.evaluate(2));
        System.out.println("====");
        System.out.println("Polynomial: " + myPolynomial4);
        System.out.println("Degree: " + myPolynomial4.getDegree());
        System.out.println("Evaluate (x = 2): " + myPolynomial4.evaluate(2));
        System.out.println("====");
        System.out.println("Polynomial: " + myPolynomial5);
        System.out.println("Degree: " + myPolynomial5.getDegree());
        System.out.println("Evaluate (x = 2): " + myPolynomial5.evaluate(2));
        System.out.println("====");
        System.out.println("Polynomial: " + myPolynomial6);
        System.out.println("Degree: " + myPolynomial6.getDegree());
        System.out.println("Evaluate (x = 2): " + myPolynomial6.evaluate(2));
        System.out.println("====");
        System.out.println("Polynomial: " + myPolynomial7);
        System.out.println("Degree: " + myPolynomial7.getDegree());
        System.out.println("Evaluate (x = 2): " + myPolynomial7.evaluate(2));
        System.out.println("====");
        System.out.println("Polynomial: " + myPolynomial8);
        System.out.println("Degree: " + myPolynomial8.getDegree());
        System.out.println("Evaluate (x = 2): " + myPolynomial8.evaluate(2));
        System.out.println("====");
        System.out.println("Polynomial: " + myPolynomial9);
        System.out.println("Degree: " + myPolynomial9.getDegree());
        System.out.println("Evaluate (x = 2): " + myPolynomial9.evaluate(2));
        System.out.println("====");
        System.out.println("Polynomial: " + myPolynomial10);
        System.out.println("Degree: " + myPolynomial10.getDegree());
        System.out.println("Evaluate (x = 2): " + myPolynomial10.evaluate(2));
        System.out.println("====");
        System.out.println("Polynomial: " + myPolynomial11);
        System.out.println("Degree: " + myPolynomial11.getDegree());
        System.out.println("Evaluate (x = 2): " + myPolynomial11.evaluate(2));
        System.out.println("====");
        System.out.println("Polynomial: " + myPolynomial12);
        System.out.println("Degree: " + myPolynomial12.getDegree());
        System.out.println("Evaluate (x = 2): " + myPolynomial12.evaluate(2));
        System.out.println("====");
        System.out.println("Polynomial: " + myPolynomial13);
        System.out.println("Degree: " + myPolynomial13.getDegree());
        System.out.println("Evaluate (x = 2): " + myPolynomial13.evaluate(2));
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("==Ball==");
        Container container = new Container(0, 0, 200, 200);
        System.out.println(container);
        Ball ball = new Ball(100, 100, 10, 100, 90);
        System.out.println(ball);
        System.out.println("The ball is in the container? " + container.collides(ball));
        ball.move();
        System.out.println("*Move ball!");
        System.out.println(ball);
        System.out.println("The ball is in the container? " + container.collides(ball));
        ball.reflectVertical();
        ball.move();
        System.out.println("*Reflect vertical + move ball!");
        System.out.println(ball);
        System.out.println("The ball is in the container? " + container.collides(ball));
        ball.setXDelta(10);
        ball.setYDelta(-10);
        ball.move();
        System.out.println("*Set xDelta = 10 and yDelta = -10 + move ball!");
        System.out.println(ball);
        System.out.println("The ball is in the container? " + container.collides(ball));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("==Equals and HashCode==");
        Circle cir1 = new Circle(10, "cyan");
        Circle cir2 = new Circle(10, "cyan");
        System.out.println("Circle: " + cir1.equals(cir2));

        Rectangle rec1 = new Rectangle(2, 5);
        Rectangle rec2 = new Rectangle(2, 5);
        System.out.println("Rectangle: " + rec1.equals(rec2));

        Employee emp1 = new Employee(1, "Petr", "Petrov", 30000);
        Employee emp2 = new Employee(1, "Petr", "Petrov", 30000);
        System.out.println("Employee: " + emp1.equals(emp2));

        Author aut1 = new Author("Ivan", "Petrov", 'f');
        Author aut2 = new Author("Ivan", "Petrov", 'f');
        System.out.println("Author: " + aut1.equals(aut2));

        Book book1 = new Book("Book", new Author[]{}, 500);
        Book book2 = new Book("Book", new Author[]{aut2}, 500);
        System.out.println("Book: " + book1.equals(book2));

        MyPoint pt1 = new MyPoint(10.8, -1.9);
        MyPoint pt2 = new MyPoint(10.8, -1.9);
        System.out.println("MyPoint: " + pt1.equals(pt2));

        MyTriangle tri1 = new MyTriangle(1, 2, 3, 4, 5, 6);
        MyTriangle tri2 = new MyTriangle(1, 2, 3, 4, 5, 6);
        System.out.println("MyTriangle: " + tri1.equals(tri2));

        MyComplex com1 = new MyComplex(9.45, -6.56);
        MyComplex com2 = new MyComplex(9.45, -6.56);
        System.out.println("MyComplex: " + com1.equals(com2));

        MyPolynomial pol1 = new MyPolynomial(1, 2, 3, 4, 5, 6);
        MyPolynomial pol2 = new MyPolynomial(1, 2, 3, 4, 5, 6);
        System.out.println("MyPolynomial: " + pol1.equals(pol2));

        Ball bl1 = new Ball(100, 100, 10, 30, -30);
        Ball bl2 = new Ball(100, 100, 10, 30, -30);
        System.out.println("Ball: " + bl1.equals(bl2));

        Container cont1 = new Container(0, 0, 1000, 1000);
        Container cont2 = new Container(0, 0, 1000, 1000);
        System.out.println("Container: " + cont1.equals(cont2));
    }
}
