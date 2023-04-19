package Patterns;

class Solution {

    void printTriangle(int n) {
        // code here
        int k = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = k; j > 0; j--) {
                System.out.print("*");
            }
            k -= 2;
            System.out.println();
        }
    }
}