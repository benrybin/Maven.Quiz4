package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    ArrayUtils test = new ArrayUtils();

    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] answer = new String[values.length-1];

        for (int i = 0,k=0; i <values.length ; i++) {
           if(i==values.length/2){
               continue;
           }
           answer[k++] = values[i];
           System.out.println(answer.toString());

        }

        return answer;

    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] answer = new String[values.length-1];

        for (int i = 0,k=0; i <values.length-1 ; i++) {
            if(i==values.length){
                continue;
            }
            answer[k++] = values[i];


        }

        return answer;


    }
}