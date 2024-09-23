package org.example;

public class Table {
    private final int[][] table;
    private final int rows;
    private final int columns;

    public Table(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        table = new int[rows][columns];
    }

    public int getValue(int rowIndex, int columnIndex) {
        if (rowIndex >= 0 && rowIndex < rows && columnIndex >= 0 && columnIndex < columns) {
            return table[rowIndex][columnIndex];
        } else {
            throw new IndexOutOfBoundsException("Incorrect row or column index");
        }
    }

    public void setValue(int rowIndex, int columnIndex, int value) {
        if (rowIndex >= 0 && rowIndex < rows && columnIndex >= 0 && columnIndex < columns) {
            table[rowIndex][columnIndex] = value;
        } else {
            throw new IndexOutOfBoundsException("Incorrect row or column index");
        }
    }

    public int rows() {
        return rows;
    }

    public int cols() {
        return columns;
    }

    public String toString() {
        StringBuilder stringTable = new StringBuilder();

        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int columnIndex = 0; columnIndex < columns; columnIndex++) {
                stringTable.append(table[rowIndex][columnIndex]);
                if (columnIndex < columns - 1) {
                    stringTable.append(" ");
                }
            }
            if (rowIndex < rows - 1) {
                stringTable.append("\n");
            }
        }

        return stringTable.toString();
    }

    public double average() {
        int sum = 0;

        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int columnIndex = 0; columnIndex < columns; columnIndex++) {
                sum += table[rowIndex][columnIndex];
            }
        }

        return (double) sum / (rows * columns);
    }
}
