package Arrays;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        System.out.println("Enter " + len + " array elements: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are: " + Arrays.toString(arr));

        System.out.println("Enter the target for two sum: ");
        int target = sc.nextInt();

        int[] result = twosum(arr, target);

        // ✅ Print result in [0, 1] format
        System.out.println(Arrays.toString(result));

        sc.close();
    }

    public static int[] twosum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }

        return new int[]{-1, -1}; // return [-1, -1] if no solution
    }
}