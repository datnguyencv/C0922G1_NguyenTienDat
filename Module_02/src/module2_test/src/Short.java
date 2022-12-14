import java.util.Arrays;

public class Short {
    public static String sortString(String inputString)
    {
        char[] array = inputString.toCharArray();

        Arrays.sort(array);

        return new String(array);
    }

    public static void main(String[] args)
    {
        String inputString = "absdsasd";
        String outputString = sortString(inputString);

        System.out.println("Input String : " + inputString);

        System.out.println("Output String : " + outputString);
    }
}
