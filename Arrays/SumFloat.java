// Create an array of 5 floats and calculate their sum
package Arrays;
import java.util.*;
public class SumFloat {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        float []arr = new float[5];
        float sum = 0;
        System.out.println("Enter the elements");
        for(int i = 0; i<5; i++){
            arr[i] = gb.nextFloat();
            sum+=arr[i];
        }
        System.out.println("The sum of the elemets is: "+sum);
        gb.close();
    }
}
