/**
 * Shuffled_Array
 */

import java.util.Collections;
import java.util.Arrays;
import java.util.List;
public class Shuffled_Array {

    public static void main(String[] args) {
        Integer array[]={1,2,3,4,5,6,7};
        List<Integer> intList = Arrays.asList(array);

		Collections.shuffle(intList);

		intList.toArray(array);

		System.out.println(Arrays.toString(array));
        


    }
}