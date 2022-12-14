public class CheckSumInArray {


    public static void checksum(int[] arr) {
        int sum = 0, max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }

        if (sum - max * 2 == 0) System.out.println("true");
        else System.out.println("false");

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 3, 14};
        checksum(arr);
    }
}

