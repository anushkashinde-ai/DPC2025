import java.util.*;

class Day5 {
    public static List<Integer> findLeaders(int[] arr) {
        int n = arr.length;
        List<Integer> leaders = new ArrayList<>();
        
        int maxSoFar = arr[n - 1];
        leaders.add(maxSoFar);
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxSoFar) {
                leaders.add(arr[i]);
                maxSoFar = arr[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println("Leaders (Optimized): " + findLeaders(arr));
    }
}
