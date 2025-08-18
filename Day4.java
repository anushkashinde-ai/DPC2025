import java.util.Arrays;

class Day3 {
    private static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);  // ceil(gap/2)
    }

    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int gap = n + m;

        for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
            int i, j;
            for (i = 0; i + gap < n; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }
            }

            for (j = (gap > n ? gap - n : 0), i = (i < n ? i : n - 1); 
                 i < n && j < m; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }

           
            if (j < m) {
                for (j = 0; j + gap < m; j++) {
                    if (arr2[j] > arr2[j + gap]) {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        merge(arr1, arr2);

        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}
