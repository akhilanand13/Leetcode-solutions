//Linear Search - Good for small to medium amount of data
//Time Complexity: O(n) Searches the entire array element by element, that's why linear time complexity
//Space Complexity: O(1)
import java.util.*;
public class Main{
    public static int findTarget(int[] arr, int target){
    for(int i = 0; i < arr.length; i++){
        if(arr[i] == target){
            return i;
        }
    }
    return -1;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        int[] arr = {2, 4, 1, 7, 8, 5, 3, 6, 9};
        if(findTarget(arr, target) != -1){
            System.out.println("Element found at index: " + findTarget(arr, target));
        }
        else{
            System.out.println("Element not found!");
        }
        sc.close();
    }
}