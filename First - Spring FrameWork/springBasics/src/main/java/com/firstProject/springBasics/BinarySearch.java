package com.firstProject.springBasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
    @Autowired      //Adding Autowired
    private SortAlgorithm sortAlgorithm = null;

    private String searchAlgo;

    public BinarySearch(SortAlgorithm algorithm)  // Constructor Injection
    {
        super();
        this.sortAlgorithm = algorithm;
    }


    public String getSearchAlgo() {
        return searchAlgo;
    }

    public void setSearchAlgo(String searchAlgo) {
        this.searchAlgo = searchAlgo;
    }

    public int searchNumber(int[] numbers, int number) {
        numbers = sortAlgorithm.sort(numbers);   // first sorting the given array.

        //Performing Binar Search
        int left = 0, right = numbers.length - 1;
        while (left <= right) {
            int medium = left + (right - left) / 2;
            if (numbers[medium] == number)
                return medium;
            if (numbers[medium] < number)
                left = medium + 1;
            else
                right = medium - 1;
        }
        return -1;
    }
}
