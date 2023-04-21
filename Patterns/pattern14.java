package Patterns;

class Solution {

    void printTriangle(int n) {
        // code here
        int k = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                char c = (char) k;
                System.out.print(c);
                k++;
            }
            k = 65;
            System.out.println();
        }
    }
}