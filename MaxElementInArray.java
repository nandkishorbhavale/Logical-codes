import java.util.Scanner;

public class MaxElementInArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Array Elements");
        for(int i=0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum element of the given array: ");
        int max=arr[0];
        for(int i=0; i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element of the array is: "+max);
        sc.close();
    }
}
