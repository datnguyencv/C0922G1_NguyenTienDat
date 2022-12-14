package exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = {9, 3, 5, 2, 8, 4, 15};
        double totalEven = 0;
        double totalOdd = 0;
        int demle = 0,demchan = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                totalEven = totalEven + arr[i];
            demle++;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0)
             {totalOdd = totalOdd + arr[j];
            demchan++;}
        }
        System.out.println("Trung bình công các số chẵn =" + Math.round(totalEven / demchan));
        System.out.println("Trung bình công các số lẽ =" + Math.round(totalOdd / demle));
        int ketqua = (int) (Math.round(totalEven / demchan) - Math.round(totalOdd / demle));
        System.out.println(" Kết quả  =" + ketqua);
    }
}

