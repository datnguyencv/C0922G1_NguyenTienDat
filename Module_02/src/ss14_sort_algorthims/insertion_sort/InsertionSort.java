package ss14_sort_algorthims.insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = new int[]{1,3,4,7,8,9,5,2};
        System.out.println("Input list : "+ Arrays.toString(list));
        insertionSort(list);
    }

    private static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp=list[i];
            int j;
            for (j = i-1 ; j >= 0 && list[j]>temp ; j--) {
                list[j+1]= list[j];
            }
            list[j+1]= temp;
        }
        System.out.println("Output InsertionSort :"+Arrays.toString(list));
    }
}
