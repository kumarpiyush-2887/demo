// Write a program to find whether a given number is present in the array or not
package Arrays;
import java.util.*;
public class FindInArray {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = gb.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i] = gb.nextInt();
        }
        System.out.println("Enter number to search for:");
        int x = gb.nextInt();
        int loc = -1;
        for(int i=0;i<size;i++){
            if (arr[i]==x){
                loc = i;
                break;
            }
        }
        if(loc==-1){
            System.out.println(x+" not found in the array");
        }
        else{
            System.out.println(x+" found at index: "+loc);
        }
        gb.close();
    }
}
