import java.util.Scanner;

public class SelectionShort {
	public static
	void ImplementationOfSelectionShort(int arr[],int size) {
		for(int i = 0; i<size-1; i++) {   //i=0
			int index = i;
			for(int j =i+1; j<size; j++) {  //j=2
				if(arr[j]<arr[index]) {
					index = j;
				}				
			}int smallestValue = arr[index]; //
			arr[index] = arr[i];
			arr[i] = smallestValue;
			for(int k =0; k<size; k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
			
		}
		
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("How many values do you want to insert");
		
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i = 0; i<size; i++) {
			System.out.printf("Please enter the %dth value: ",i+1);
			int value = sc.nextInt();
			arr[i] = value;}
		
		ImplementationOfSelectionShort(arr,size);
    	
    	
    }
}
