class Solution {
    public void nextPermutation(int[] arr) {
        int i = arr.length - 1;
        boolean flag = true;
        while(i > 0){
            if(arr[i] > arr[i - 1]){
                int min = i;
                for (int j = i; j < arr.length; j++) {
                    if(arr[j] > arr[i - 1] && arr[min] > arr[j]){
                        min = j;
                    }
                }
                int fake = arr[i - 1];
                arr[i - 1] = arr[min];
                arr[min] = fake;
                Arrays.sort(arr, i, arr.length);
                flag = false;
                break;
            }
            i--;
        }
        if(flag) Arrays.sort(arr);
    }
}