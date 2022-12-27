import java.util.*;

public class CountChart {
    static void characterCount(String inputString) {
        HashMap<Character,Integer> chaCount = new HashMap<>();

        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (chaCount.containsKey(c)) {
                chaCount.put(c ,chaCount.get(c) + 1);
            }
            else {
                chaCount.put(c,1);
            }
        }

        for (Map.Entry <Character,Integer> entry: chaCount.entrySet()) {
            for (Map.Entry<Character,Integer> entry1: chaCount.entrySet()) {

            }
        }

        Comparator<Map.Entry<Character, Integer>> comparator = new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> e1, Map.Entry<Character, Integer> e2) {
                Integer v1 = e1.getValue();
                Integer v2 = e2.getValue();
                return v1.compareTo(v2);
            }
        };

        List<Map.Entry<Character, Integer>> listEntries = new ArrayList<>((Collection) chaCount);
        Collections.sort(listEntries, comparator);


         LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>(listEntries.size());
            for (Map.Entry<Character, Integer> entry : listEntries) {
              sortedMap.put(entry.getKey(), entry.getValue());
            }

        for (Map.Entry<Character,Integer> entry :sortedMap.entrySet()
             ) {
                 System.out.println(entry.getKey() + " ==>> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chuoi: ");
        String s = scanner.nextLine();

        characterCount(s);
    }
//    public static void main(String[] args) {
//        String str = "abcbaaa" ;
//
//        String[] arr = str.split("");
//
//        Set<String> set = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
//        }
//        System.out.println(set);
//        List<String> list = new ArrayList<>();
//        list.addAll(set);
//        System.out.println(list);
//        int count ;
//        int i ;
//        Map<Integer,String> map = new TreeMap<>();
//
//        for (i = 0; i < list.size(); i++) {
//            count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (list.get(i).equals(arr[j])) {
//                    count++;
//                }
//            }
//            map.put(count, list.get(i));
//                System.out.println(count + " - " + list.get(i));
//        }
//        System.out.println(map);
//    }
}
