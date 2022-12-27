package module2_test.src;

import java.util.*;

public class CountCharHashMap {
    static void characterCount(String str){
        HashMap <Character,Integer> charCount = new HashMap<>();

        for (int i = str.length() - 1; i >= 0; i--)
        {
            if(charCount.containsKey(str.charAt(i)))
            {
                int count = charCount.get(str.charAt(i));
                charCount.put(str.charAt(i),++count);
            }
            else
            {
                charCount.put(str.charAt(i),1);
            }
        }
        ArrayList<Character> charList = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry: charCount.entrySet()){
            charList.add(entry.getKey());
        }

        Collections.sort(charList);

        for(int i = 0; i < charList.size(); i++){
            System.out.println(charList.get(i) + " " + charCount.get(charList.get(i)));
        }

        System.out.println(charCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text check : ");
        String str = scanner.nextLine();
        characterCount(str);
    }
}

