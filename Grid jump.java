import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan=new Scanner(System.in);
        if (scan.hasNextInt()){
            int t = scan.nextInt();
            while (t-- > 0) {
                int A = scan.nextInt();
                int B = scan.nextInt();
                long P = scan.nextLong();
                long Q = scan.nextLong();
                long R = scan.nextLong();
                long[][] dp = new long[A + 3][B + 3];
                for(int i = 0; i <= A + 2; i++) {
                    for(int j = 0; j <= B + 2; j++) {
                        dp[i][j] = Long.MAX_VALUE / 2; // Divide by 2 to prevent overflow on addition
                    }
                }
                dp[0][0] = 0;
            for(int i = 0; i <= A; i++) {
                    for(int j = 0; j <= B; j++) {
                        if(dp[i][j] == Long.MAX_VALUE / 2) continue;
                        dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j] + P);
                        dp[i+2][j] = Math.min(dp[i+2][j], dp[i][j] + P);
                        dp[i][j+1] = Math.min(dp[i][j+1], dp[i][j] + Q);
                        dp[i][j+2] = Math.min(dp[i][j+2], dp[i][j] + Q);
                        dp[i+1][j+1] = Math.min(dp[i+1][j+1], dp[i][j] + R);
                    }
                }
                System.out.println(dp[A][B]);
            }
        }
    }
}
