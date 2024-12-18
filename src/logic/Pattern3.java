package logic;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 7; // The middle row has n stars

        // Upper half of the pattern
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print("   ");
            }
            // Print stars with spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print("   ");
            }
            // Print stars with spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
