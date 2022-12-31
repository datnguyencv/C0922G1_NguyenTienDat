package exercise3;

import java.util.*;

public class DuplicateElement {
    public static void removeDuplicateElement(Integer arr[],int n){
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(Arrays.asList(arr));
        arr = hashSet.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
    }

//        Set<Integer> hashSet = new TreeSet<>(Arrays.asList(arr));
//        arr = hashSet.toArray(new Integer[0]);
//        System.out.println(Arrays.toString(arr));
//    }

//        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr));
//        arr = hashSet.toArray(new Integer[0]);
//        System.out.println(Arrays.toString(arr));
//    }


    public static void main(String[] args) {
        Integer arr[]={7,5,3,9,5,1,10,9,4,9};
        removeDuplicateElement(arr,0);
    }
}
