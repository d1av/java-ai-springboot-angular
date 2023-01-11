package io.davi.javai.utils;

import org.springframework.stereotype.Component;

@Component
public class RandomNumber {
    public int Generate(int maxRange) {
        int max = maxRange;
        int min = 1;
        int range = max - min + 1;

        // generate random numbers within 1 to 10
        int rand = (int) (Math.random() * range) + min;

        // Output is different everytime this code is executed
        return rand;
    }
}

