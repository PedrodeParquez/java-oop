package org.example;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    private final List<Integer> evenNumbers = new ArrayList<>();
    private final List<Integer> oddNumbers = new ArrayList<>();

    public void addNumber (int num) {
        if (num % 2 == 0){
            evenNumbers.add(num);
            return;
        }

        oddNumbers.add(num);
    }

    public List<Integer> even() {
        return evenNumbers;
    }

    public List<Integer> odd() {
        return oddNumbers;
    }
}
