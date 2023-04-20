package Patterns;

class Solution {

    void printTriangle(int n) {
        // code here
        int k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = k; j < 2 * n - 2; j++) {
                System.out.print("  ");
            }
            k += 2;
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}