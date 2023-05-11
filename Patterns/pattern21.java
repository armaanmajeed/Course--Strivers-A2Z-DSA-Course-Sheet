package Patterns;

class Solution {

    void printSquare(int n) {
        // code here
        if (n == 1) {
            System.out.print("*");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            if (n != 2) {
                for (int i = 0; i < n - 2; i++) {
                    System.out.print("*");
                    for (int j = 0; j < n - 2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.println();
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }
    }
}