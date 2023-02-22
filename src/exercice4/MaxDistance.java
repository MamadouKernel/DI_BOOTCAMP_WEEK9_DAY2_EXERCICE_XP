package exercice4;

import java.util.*;

public class MaxDistance {
    public static int maxDistance(int[] arr) {
        int n = arr.length;
        int maxDist = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            } else {
                int dist = i - map.get(arr[i]);
                maxDist = Math.max(maxDist, dist);
            }
        }
        return maxDist;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        int maxDist = maxDistance(arr);
        System.out.println("Maximum distance between two occurrences of the same element: " + maxDist);
    }
}

