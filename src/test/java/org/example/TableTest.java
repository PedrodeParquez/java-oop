package org.example;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {
    Table tab = new Table(2, 2);

    @org.junit.jupiter.api.Test
    void getValue() {
        tab.setValue(0,0, 1);
        tab.setValue(0,1, 2);
        tab.setValue(1,0, 3);
        tab.setValue(1,1, 4);

        assertEquals(4, tab.getValue(1, 1));
    }

    @org.junit.jupiter.api.Test
    void average() {
        tab.setValue(0,0, 1);
        tab.setValue(0,1, 2);
        tab.setValue(1,0, 3);
        tab.setValue(1,1, 4);

        assertEquals(2.5, tab.average());
    }
}