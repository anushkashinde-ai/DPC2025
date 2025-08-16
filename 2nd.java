class 2nd {
    public static int missingSum(int[] arr){
        int n = arr.length+1;
        long total = (long)n*(n+1)/2;
        long have = 0;
        for(int x : arr){
            have += x;
        }
        return(int)(total-have);
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,5};
        System.out.println("Missing number (Sum method): " + missingSum(arr));
    }
}
