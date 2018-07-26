package com.codecool;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Prime prime = new Prime();
        List<Integer> numbers = prime.optimusPrime(2);

        prime.showNumbers(numbers);
    }
}
