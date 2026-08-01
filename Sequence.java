package day8;
import java.util.Arrays;
public class Sequence{
    public static void main(String[] args) {
        int [] pascal = {1,2,3,4,5,10};
        String digits ="987654321";
        System.out.println(Arrays.toString(pascal));
        System.out.println(digits);
        String newdigit = digits.substring(2,8);
        int[] extracted = Arrays.copyOfRange(pascal,2,5);
        Arrays.stream(extracted).forEach(each->System.out.println(each));
    }

}
