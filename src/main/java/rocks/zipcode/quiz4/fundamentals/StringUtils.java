package rocks.zipcode.quiz4.fundamentals;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {

    public static Character getMiddleCharacter(String string) {
        return string.substring(string.length()/2).toCharArray()[0];
    }

    public static String capitalizeMiddleCharacter(String str) {
        char[] temp =str.toCharArray();
        temp[temp.length/2] =Character.toUpperCase(temp[temp.length/2]);



        return String.copyValueOf(temp);
    }

    public static String lowerCaseMiddleCharacter(String str) {char[] temp =str.toCharArray();
        temp[temp.length/2] =Character.toLowerCase(temp[temp.length/2]);



        return String.copyValueOf(temp);
    }

    public static Boolean isIsogram(String str) {
        str.toLowerCase();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i <str.length()-1 ; i++) {
            if (arr[i] == arr[i+1]) {
                return false;

            }

        }


        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        if (StringUtils.isIsogram(str)){
            return false;
        }

        return true;

    }

    public static String removeConsecutiveDuplicateCharacters(String str) {



        return str.replaceAll("(.)\\1{1,}","");
    }

    public static String invertCasing(String str) {
        char[] answer = str.toCharArray();
        for (int i = 0; i <answer.length ; i++) {

            if(Character.isUpperCase(answer[i])){
                answer[i] = Character.toLowerCase(answer[i]);
            }else if((Character.isLowerCase(answer[i]))){
                answer[i] = Character.toUpperCase(answer[i]);
            }

        }

        return String.copyValueOf(answer);

    }
}