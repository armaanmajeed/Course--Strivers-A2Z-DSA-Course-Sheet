package Patterns;

class Solution {

    void printTriangle(int n) {
        // code here
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(k + " ");
                if (k == 1) {
                    k--;
                } else {
                    k++;
                }
            }
            System.out.println();
            if (i % 2 == 0) {
                k = 0;
            } else {
                k = 1;
            }
        }
    }
}