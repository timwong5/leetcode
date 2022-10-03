package JianzhiOfferProject.Day18;

import java.util.Scanner;

/**
 * @author timwong5
 * @date 2022-10-14 19:18
 */
public class Solution3 {
    static int MOD = 100000007;
    static int n;
    static int count[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int s = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = n * (n - 1) / 2;
        count = new int[sum + 1];
        long ans = 0;

        dp();

        long tmp = (long) a * sum - s;
        ans = (tmp % n == 0) ? 1 : 0;
        for (int i = 1; i <= sum; i++) {
            tmp = tmp - a - b;
            if (tmp % n == 0) {
                ans += count[i];
                ans %= MOD;
            }

        }

        System.out.println(ans);
        scanner.close();
    }

    private static void dp() {
        count[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i * (i + 1) / 2; j >= i; j--) {
                count[j] += count[j - i];
                count[j] %= MOD;
            }
        }

    }
}
