package Arrays.Arryas;

public class SecondLargestElement {

     public static void main(String[] args) {
        int arr[] = {4, 5, 7, 9, 10};
        int n = arr.length;
        int largest = arr[n - 1];
        int second_largest = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                second_largest = arr[i];
                break;  // Now break only if a different element is found
            }
        }

        System.out.println(second_largest);  // Output: 9
    }
}