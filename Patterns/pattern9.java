package Patterns;

class Solution {

    void printDiamond(int n) {
        // Your code here
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = k; j > 0; j--) {
                System.out.print("* ");
            }
            k++;
            System.out.println();
        }
        k = n;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = k; j > 0; j--) {
                System.out.print("* ");
            }
            k--;
            System.out.println();
        }
    }
}