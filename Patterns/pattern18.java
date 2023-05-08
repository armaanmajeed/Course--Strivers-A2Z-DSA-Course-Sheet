package Patterns;

class Solution {

    void printTriangle(int n) {
        // code here
        int k = 65;
        k += n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                char c = (char) k;
                System.out.print(c + " ");
                k--;
            }
            k += i;
            System.out.println();
        }
    }
}