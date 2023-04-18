package Patterns;

class Solution {

    void printTriangle(int n) {
        // code here
        for (int i = n; i > 0; i--) {
            int k = 1;
            for (int j = i; j > 0; j--) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}