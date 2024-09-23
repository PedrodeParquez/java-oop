package org.example;

public class Balance {
    public int weightRightBowl;
    public int weightLeftBowl;

    public void addRight(int weight) {
        weightRightBowl += weight;
    }

    public void addLeft(int weight) {
        weightLeftBowl += weight;
    }

    public String result() {
        if (weightLeftBowl > weightRightBowl) {
            return "L";
        }

        if (weightLeftBowl < weightRightBowl) {
            return "R";
        }

        return "=";
    }
}


