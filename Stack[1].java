package stack;
import java.util.Scanner;

public class Stack {
    private int capacity;
    private int top=0;
    private String[] storage;
    
    public Stack(int size){
        capacity = size;
        storage = new String[capacity];
    }
    
    public void show(){
        for (int i=capacity-1 ; i>=0 ; i--){
            System.out.print("\n storage[" + i + "] = " + storage[i] );
        }
        System.out.println();
    }
     
    private boolean isEmpty(){
     if (storage[0] == null){
         System.out.print("\n ERROR 101 (the stack is empty now)\n");
         return true;
     }   
        return false;
    }
    
    private boolean isFull(){
        if (top == capacity){
            System.out.print("\nERROR 202 (the stack is full already)\n");
            return true;
        } 
        return false;
    }
    
    public void push(String value){
        if (isFull()){
            System.out.println();
        }
        else {
            System.out.print("\n ... trying to input on stack[" + top + "] ...\n");
            System.out.print("'" + value + "' was succesfully added.\n");
            storage[top] = value;
            top++;
        }
    }
    
    public void pop(){
        if (isEmpty()){
            System.out.println();
        }
        else {
            System.out.print("\n ... trying to remove on stack[" + (top-1) + "] ...\n");
            System.out.print("'" + storage[top-1] + "' was successfully removed.\n");
            storage[top-1] = null;
            top--;
        }
    }
    
    public void peek(){
        System.out.print("\nTOP VALUE: " + storage[top-1] + "\n");
    }
    
    public static void main(String[] args) {
        int limit=0;
        int i;
        String val;
        Scanner input = new Scanner (System.in);
        
        System.out.print("*----------------* ARRAY STACK *----------------*\n\n");
        System.out.print("What is the capacity of storage: ");
        limit = input.nextInt();
        Stack storage = new Stack(limit);
       
        System.out.print("STORAGE CAPACITY: " + limit + "\n\n");
        
        for(i=0 ; i<=(limit-1) ; i++){
              System.out.print("Please input your stack [" + i + "]: ");
              val = input.next();
              storage.push(val);
              System.out.println();
        }
        
        while (limit>0){
            System.out.print("\n*---------------------------------------------*\n");
            System.out.print("Choose what you want to do (1-5):\n");
            System.out.print("(1) Show the inputted values. \n");
            System.out.print("(2) Add another value.\n");
            System.out.print("(3) Remove a value in your stack.\n");
            System.out.print("(4) Peek top value.\n");
            System.out.print("(5) Close the program.");
            System.out.print("\n*---------------------------------------------*\n");
            System.out.print("Choice: ");
            String user = input.next();
            
            switch(user){
                case "1":
                    System.out.print("\n\n");                    
                    storage.show();
                    break;
                
                case "2":
                   System.out.print("\n\n");  
                   if (storage.isFull()){
                   }
                   else {
                       System.out.print("\nPlease input your value: ");
                       val = input.next();
                       storage.push(val);
                       System.out.println();
                   }
                    break;
                    
                case "3":
                    System.out.print("\n\n");  
                    storage.pop();
                    break;
                    
                case "4":
                    System.out.print("\n\n");
                    storage.peek();
                    break;
                        
                case "5":
                    System.out.print("\n*------ THANK YOU FOR USING MY PROGRAM! ------*\n\n\n");
                    return;
                    
                default:
                    System.out.print("\nPlease choose only from the choices above(1-3).");
            }
            System.out.print("\n\n");
        }
    }
}
