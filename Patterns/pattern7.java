package Patterns;

class Solution {

    void printTriangle(int n) {
        // code here
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            k += 2;
            System.out.println();
        }
    }
}