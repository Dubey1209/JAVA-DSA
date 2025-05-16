package Arrays.Arryas;

public class LargestElementInArray {
    
    public static void main(String[] args) {
        
        int arr[] = {1,5,10,4,6};
        int largest = arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>largest)
            largest=arr[i];
        }
        System.out.println(" The Largest element : "+l);
    }
    
}
