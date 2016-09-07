package totalmax;
import java.util.Scanner;

public class TotalMax {
    private int capacity;
    private int first=0;
    private int[] storage;
 
    Scanner input = new Scanner(System.in);
    
public TotalMax(int size){
    capacity = size;
    storage = new int[capacity];
}
   
public void printall(){
    System.out.print("\nThe numbers in the array are { ");
    for (int i=0 ; i<=capacity-1 ; i++){
        System.out.print(storage[i] + " ");
    }
    System.out.print("}.\n\n");
}    

public void inputnumber(int value){
        storage[first] = value;
        first++;
}

public void sum(){
    System.out.print("The sum of the numbers in the array is: ");
    int result=0;
    
            for (int x=0 ; x<=capacity-1 ; x++){
                result += storage[x];
            }
    System.out.print(result + "\n\n");
}

public void average(){
    System.out.print("The average of the numbers in the array is: ");
    float ave=0;
    int result=0; 
    
        for (int x=0 ; x<=capacity-1 ; x++){
            result += storage[x];
        }
    ave = (result/capacity);
    
    System.out.print(ave + "\n\n");
}

public void highest(){
    System.out.print("The highest inputted number in the array is: ");
    int max=storage[0];
    
    for (int y=0 ; y<=capacity-1 ; y++){
        if (max<=storage[y]) {
           max=storage[y];
        }
    }
    System.out.print(max + "\n\n");
}

    public static void main(String[] args) {
        int limit;
        int i;
        int val;
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the capacity of storage: ");
        limit = input.nextInt();
        TotalMax storage = new TotalMax(limit);
        
        System.out.print("ARRAY CAPACITY: " + limit + "\n\n");
        
        for (int x=1 ; x<=limit ; x++){
        System.out.print("Please input number[" + x + "]: ");
        val = input.nextInt();
        storage.inputnumber(val);
        }
        
        
        storage.printall();
        storage.sum();
        storage.average();
        storage.highest();
        
    }
    
}
