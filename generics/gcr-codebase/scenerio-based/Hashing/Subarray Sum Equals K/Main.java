import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int subarraySumEqualsK(int[] nums, int k) {

        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);

        int sum = 0;
        int answer = 0;

        for (int num : nums) {

            sum += num;

            answer += prefixCount.getOrDefault(sum - k, 0);

            prefixCount.put(sum,
                    prefixCount.getOrDefault(sum, 0) + 1);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};

        System.out.println(subarraySumEqualsK(nums, 2));
    }
}