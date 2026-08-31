import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Handle edge case where there is no input
        if (!scan.hasNext()) {
            System.out.println(0);
            return;
        }
        
        String s = scan.nextLine();
        scan.close();
        
        // Trim leading and trailing spaces
        s = s.trim();
        
        // Handle edge case where the string is empty after trimming
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        
        // Split the string by any non-alphabetic characters
        String[] tokens = s.split("[^A-Za-z]+");
        
        // Print the number of tokens
        System.out.println(tokens.length);
        
        // Print each token on a new line
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
