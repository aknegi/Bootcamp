package com.firstProject.springBasics;

import org.springframework.stereotype.Component;

@Component
public class SelectionSortAlgo implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        System.out.println( "Selection Sort Called ");
        int length = numbers.length;
        for (int i = 0; i < length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < length; j++)
                if (numbers[j] < numbers[min_idx])
                    min_idx = j;
            int temp = numbers[min_idx];
            numbers[min_idx] = numbers[i];
            numbers[i] = temp;
        }
        return numbers;
    }
}
