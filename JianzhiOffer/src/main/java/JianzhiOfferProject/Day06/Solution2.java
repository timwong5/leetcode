package JianzhiOfferProject.Day06;

/**
 * @author timwong5
 * @date 2022-08-03 14:10
 */
public class Solution2 {
    public int minArray(int[] numbers) {
        if (numbers.length == 1) {
            return numbers[0];
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                return numbers[i];
            }
        }
        return numbers[0];
    }

}
