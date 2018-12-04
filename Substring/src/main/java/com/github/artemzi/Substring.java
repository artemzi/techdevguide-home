package com.github.artemzi;

class Substring {
    int substrIndex(char[] needle, char[] haystack) {
        int n = haystack.length;
        int m = needle.length;
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while(j < m && haystack[i + j] == needle[j]) {
                j++;
            }
            if (j == m) return i;
        }
        return -1;
    }
}
