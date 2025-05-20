public class Main {
    public static void main(String[] args) {

        // Testing array Search
//        int [] temp_arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        int [] temp_arr1 = {8, 7, 6, 5, 4, 3, 2, 1};
//        System.out.println(ArraySearch.LinearSearch(temp_arr, 8, 4));
//        System.out.println(ArraySearch.BinarySearchA(temp_arr, 8, 4));
//        System.out.println(ArraySearch.BinarySearchD(temp_arr1, 8, 4));

        // Testing array Sort
        // Selection Sort
//        int [] temp_arr2 = {3, 5, 2, 7, 8, 2, 8, 23, 874, 23, 235, 765, 234};
//        ArraySort.printArray(temp_arr2, 13);
//        System.out.println();
//        ArraySort.SelectionSort(temp_arr2, 13);
//        System.out.println();
//        ArraySort.printArray(temp_arr2, 13);

        // Insertion Sort
//        int [] temp_arr2 = {3, 5, 2, 7, 8, 2, 8, 23, 874, 23, 235, 765, 234};
//        ArraySort.printArray(temp_arr2, 13);
//        System.out.println();
//        ArraySort.InsertionSort(temp_arr2, 13);
//        System.out.println();
//        ArraySort.printArray(temp_arr2, 13);

        // Merge Sort
//        int [] temp_arr2 = {3, 5, 2, 7, 8, 2, 8, 23, 874, 23, 235, 765, 234};
//        ArraySort.printArray(temp_arr2, 13);
//        System.out.println();
//        ArraySort.MergeSort(temp_arr2, 13);
//        System.out.println();
//        ArraySort.printArray(temp_arr2, 13);

        // Quick Sort
//        int [] temp_arr2 = {3, 5, 2, 7, 8, 2, 8, 23, 874, 23, 235, 765, 234};
//        ArraySort.printArray(temp_arr2, 13);
//        System.out.println();
//        ArraySort.QuickSort(temp_arr2,0, 12);
//        System.out.println();
//        ArraySort.printArray(temp_arr2, 13);

        LinkedList l1 = new LinkedList();
        l1.AddFirst(1);
        l1.AddFirst(2);
        l1.AddFirst(3);
        l1.AddFirst(4);
        l1.AddLast(5);
        l1.AddLast(6);
        l1.AddLast(7);
        l1.PrintList();
        l1.DeleteFirst();
        l1.DeleteLast();
        System.out.println();
        l1.PrintList();
        if(l1.Exists(4)) System.out.println("True");
    }
}