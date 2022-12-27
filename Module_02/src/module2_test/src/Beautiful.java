package module2_test.src;

import java.util.ArrayList;
import java.util.List;

public class Beautiful {
    public static boolean isBeautifulArray(int[] arr) {
        List<Integer> test = new ArrayList<>();
        int sum=0;
        if(arr.length<2) {
            return false;}
        if(arr.length==2) {
            return (arr[0]==arr[1]) ? true : false;
        }
        int n = arr.length;
        for(int i=0; i<n; i++) {
            sum+=arr[i];test.add(sum);
        }
        for(int i=1; i<n-1; i++) {
            if(test.get(i-1)==(test.get(n-1)-test.get(i))) {
                return true;
            }
        }       return false;
    }

    public static void main(String[] args) {

        int[] arr={1,4};
        if(isBeautifulArray(arr))
            System.out.println("Beautifull");
        else System.out.println("No");
    }
}
