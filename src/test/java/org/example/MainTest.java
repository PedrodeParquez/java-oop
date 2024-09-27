package org.example;

import Exceptions.InvalidFigureException;
import Exceptions.InvalidSizeException;
import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.jupiter.api.Test
    void getValue() {
        Table tab = new Table(2, 2);

        tab.setValue(0,0, 1);
        tab.setValue(0,1, 2);
        tab.setValue(1,0, 3);
        tab.setValue(1,1, 4);

        assertEquals(4, tab.getValue(1, 1));
    }

    @org.junit.jupiter.api.Test
    void average() {
        Table tab = new Table(2, 2);

        tab.setValue(0,0, 1);
        tab.setValue(0,1, 2);
        tab.setValue(1,0, 3);
        tab.setValue(1,1, 4);

        assertEquals(2.5, tab.average());
    }

    @org.junit.jupiter.api.Test
    void result() {
       Balance balance = new Balance();

       balance.addRight(2);
       balance.addLeft(3);

       assertEquals("L", balance.result());

       balance.addRight(1);

       assertEquals("=", balance.result());

       balance.addRight(1);

       assertEquals("R", balance.result());
    }

    @org.junit.jupiter.api.Test
    void separator() {
        OddEvenSeparator separator = new OddEvenSeparator();

        for (int i = 0; i < 10; i++) {
            separator.addNumber(i);
        }

        assertEquals(List.of(0, 2, 4, 6, 8), separator.even());
        assertEquals(List.of(1, 3, 5, 7, 9), separator.odd());
    }

    @org.junit.jupiter.api.Test
    void rectangle() throws InvalidSizeException {
        Rectangle rectangle = new Rectangle(8, 5);

        assertEquals(40, rectangle.area());

        assertEquals("Rectangle\nwidth = 8.0\nheight = 5.0\narea = 40.0", rectangle.toString());
    }

    @org.junit.jupiter.api.Test
    void circle() throws InvalidSizeException {
        Circle circle = new Circle(4.0);

        assertEquals(50.26548245743669, circle.area());

        assertEquals("Circle\nradius = 4.0\narea = 50.26548245743669", circle.toString());
    }

    @org.junit.jupiter.api.Test
    void cylinder() throws InvalidSizeException, InvalidFigureException {
        Circle circle = new Circle(4);
        Cylinder cylinder = new Cylinder(circle, 6);

        assertEquals(301.59289474462014, cylinder.volume());
    }
}