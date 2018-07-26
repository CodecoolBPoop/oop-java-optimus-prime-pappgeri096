package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    private Prime prime;

    @BeforeEach
    void setUp(){
        prime = new Prime();
    }

    @Test
    @DisplayName("Smaller then 2")
    void optimusPrime_EmptyList_LessThanTwo(){
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected,prime.optimusPrime(1));
    }

    @Test
    @DisplayName("Just the first prim")
    void optimusPrime_ListWithOneItem_Two(){
        List<Integer> expected = new ArrayList<>();
        expected.add(2);

        assertEquals(expected,prime.optimusPrime(2));
    }

    @Test
    @DisplayName("Test with 30")
    void optimusPrime_ListOfIntiger_testWith30Number(){
        int[] ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        List<Integer> expected = Arrays.stream(ints).boxed().collect(Collectors.toList());

        assertEquals(expected,prime.optimusPrime(30));
    }

    @Test
    @DisplayName("Test with 120")
    void optimusPrime_ListOfIntiger_testWith120Number(){
        int[] ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
                47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113};
        List<Integer> expected = Arrays.stream(ints).boxed().collect(Collectors.toList());

        assertEquals(expected,prime.optimusPrime(120));
    }
}