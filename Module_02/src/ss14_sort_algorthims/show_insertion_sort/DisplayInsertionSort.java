package ss14_sort_algorthims.show_insertion_sort;

import java.util.Arrays;

public class DisplayInsertionSort {
    public static void main(String[] args) {
        int[] list = new int[]{7, 8, 9, 1, 2, 3, 6, 5, 4};
        System.out.println("Input list: "+Arrays.toString(list));
        System.out.println("Action InsertionSort \nStart from index 1:");
        InsertionSort(list);
    }

    public static void InsertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > key; j--) {
                list[j + 1] = list[j];
                System.out.print("Swap " + key + " with " + list[j + 1]+"\n");

            }
            list[j + 1] = key;
            System.out.print(list[j+1] + "\n");

        }
        System.out.println("Output List Sorted: "+Arrays.toString(list));

    }

}