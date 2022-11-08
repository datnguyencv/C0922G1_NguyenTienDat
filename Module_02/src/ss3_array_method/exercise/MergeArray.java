package ss3_array_method.exercise;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr = new int[arr1.length+arr2.length];
//        for (int i = 0; i < arr1.length; i++) {
//            arr[i]=arr1[i];
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            arr[arr1.length+i]=arr2[i];
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf(arr[i]+"\t");
        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
        for (int j : arr) {
            System.out.printf(j + "\t");
        }
    }
}
