public class ArraySort {
    public static void printArray(int [] nums,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + ", ");
        }
    }

    public static void SelectionSort(int [] nums, int n){
        for (int i = 0; i < n; i++) {
            int temp_high = i;
            for (int j = i + 1; j < n; j++) {
                if(nums[j] < nums[temp_high])
                    temp_high = j;
            }
            int temp = nums[i];
            nums[i] = nums[temp_high];
            nums[temp_high] = temp;
        }
    }

    public static void InsertionSort(int [] nums, int n){
        for (int i = 1; i < n; i++) {
            int temp_high = nums[i];
            int a = i - 1;
            while(a >= 0 && temp_high < nums[a]){
                nums[a + 1] = nums[a];
                a--;
            }
            nums[a + 1] = temp_high;
        }
    }

    public static void MergeSort(int []arr,int length)
    {
        if( length <= 1)
            return;
        int mid = length / 2;
        int [] left_arr = new int[mid];
        int [] right_arr = new int[length - mid];

        int i = 0;
        for (; i < mid; i++) {
            left_arr[i] = arr[i];
        }
        for (int j = 0; j < length - mid; j++) {
            right_arr[j] = arr[i++];
        }
        MergeSort(left_arr, mid);
        MergeSort(right_arr, length - mid);
        Merge(arr, left_arr, right_arr);
    }
    public static void Merge(int [] arr, int [] left_a, int [] right_a)
    {
        int left_l = left_a.length;
        int right_l = right_a.length;
        int i = 0, j =0, k = 0;
        while(i < left_l && j < right_l) {
            if(left_a[i] < right_a[j])
                arr[k++] = left_a[i++];
            else
                arr[k++] = right_a[j++];
        }

        while(i < left_l){
            arr[k++] = left_a[i++];
        }

        while (j < right_l){
            arr[k++] = right_a[j++];
        }
    }

    public static void QuickSort(int [] arr, int start, int end){
        if(start >= end) return;

        int pivot = partition(arr, start, end);

        QuickSort(arr, start, pivot - 1);
        QuickSort(arr, pivot + 1, end);
    }

    public static int partition(int [] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
}
