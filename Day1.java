
import java.util.Arrays;

public class Day1 {
    public static void Sorting(int arr[]){
        int low = 0, mid = 0, high = arr.length - 1;
        while(mid <= high){
            switch(arr[mid]){
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 1, 0, 2, 1, 0};
        Day1(arr);
        System.out.println(Arrays.toString(arr));
    }
}
