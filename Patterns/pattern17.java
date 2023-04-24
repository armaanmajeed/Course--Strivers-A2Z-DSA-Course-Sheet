package Patterns;

class Solution {

    void printTriangle(int n) {
        // code here
        int k = 64;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                k++;
                char c = (char) k;
                System.out.print(c);
            }
            for (int j = 1; j <= i; j++) {
                k--;
                char c = (char) k;
                System.out.print(c);
            }
            k = 64;
            System.out.println();
        }
    }
}