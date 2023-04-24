package Patterns;

class Solution {

    void printTriangle(int n) {
        // code here
        int k = 65;
        for (int i = 0; i < n; i++) {
            char c = (char) k;
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
            }
            k++;
            System.out.println();
        }
    }
}