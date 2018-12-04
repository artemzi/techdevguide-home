package com.github.artemzi;

class SelectionSort {
    int[] sort(int[] d) {
        for (int i = 0; i < d.length; i++) {
            int j = i;
            while (j > 0 && d[j] < d[j-1]) {
                d[j] = d[j] + d[j-1];
                d[j-1] = d[j] - d[j-1];
                d[j] = d[j] - d[j-1];
                j--;
            }
        }
        return d;
    }
}
