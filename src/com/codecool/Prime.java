package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    public Prime() {

    }

    List<Integer> optimusPrime(int n){
        List<Integer> primeNumbers = new ArrayList<>();

        if(n < 2) return primeNumbers;

        if(n == 2) {
            primeNumbers.add(2);
            return primeNumbers;
        }


        for(int i = 2; i < n; i++)
            primeNumbers.add(i);


        for(int i = 2; i < n; i++) {
            List<Integer> numbers = new ArrayList<>();
            for(Integer integer : primeNumbers){
                if(integer%i!=0 || integer==i)
                    numbers.add(integer);
            }

            primeNumbers=numbers;
        }

        return primeNumbers;

    }

    void showNumbers(List<Integer> numbers){
        for(Integer integer : numbers){
            System.out.println(integer.toString());
        }
    }

}
