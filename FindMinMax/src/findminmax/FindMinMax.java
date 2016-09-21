package findminmax;
import java.util.Scanner;

public class FindMinMax {
	private int capacity;
    private int begin=0;
    private static int[] numbers;
    
	public FindMinMax(int size){
        capacity = size;
        numbers = new int[capacity];
    }
	
	public void push(int value){
        System.out.print("'" + value + "' was succesfully added.\n\n");
        numbers[begin] = value;
        begin++;
    }
	
	public static void main(String [] args){
		int limit=0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
        Scanner input = new Scanner (System.in);
        
        System.out.print("\t*--------* Finding Minimum and Maximum *--------*\n\n");
        System.out.print("What is the capacity of storage: ");
        limit = input.nextInt();
        FindMinMax numbers = new FindMinMax(limit);
       
        System.out.print("STORAGE CAPACITY: " + limit + "\n\n");
        
        for (int i=0 ; i<limit ; i++){
        System.out.print("Input number[" + i + "]: ");
        int user = input.nextInt();
        numbers.push(user);
        }
        
        
        for (int x=0 ; x<limit ; x++){
        	if (FindMinMax.numbers[x] < min)
        		min = FindMinMax.numbers[x];
        	if (FindMinMax.numbers[x] > max)
        		max = FindMinMax.numbers[x];
        }
        
        System.out.println("Smallest number is " + min);
        System.out.println("Largest number is " + max);
	}
	
}
