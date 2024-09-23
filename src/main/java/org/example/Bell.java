package org.example;

public class Bell {
    public int counter;

    public String sound() {
        if (counter % 2 == 0){
            counter++;
            return "ding";
        }

        counter++;
        return "dong";
    }
}
