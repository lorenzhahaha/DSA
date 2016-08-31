package queue;
import java.util.Scanner;

public class Queue {
    private int QSIZE;
    private int[] queue;
    private int nItems=0;
    
    public Queue(int size){
        QSIZE = size;
        queue = new int[QSIZE];
    }

    public void showQueue(){
        for(int i=QSIZE-1; i>=0; i--){
            System.out.print("\n queue[" + i + "] = " + queue[i] );
        }   
    }

    private boolean isEmpty(){
        if(nItems == 0){
            System.out.println("ERROR 101 (the queue is empty now)\n");
            return true;
        }   
            return false;
    }

    private boolean isFull(){
        if(nItems == QSIZE){
            System.out.print("ERROR 202 (the queue is full already)\n");
            return true;
        }
            return false;    
    }

    public boolean enqueue(int num){
        System.out.println();
        System.out.print("Trying to enqueue ...\n");
        if(!isFull()){
            System.out.println("'" + num + "' was succesfully added.");
            queue[nItems] = num;
            nItems++;
            System.out.println();
            return true;
            
        } else {
            System.out.println("Failed to enqueue " + num);
            System.out.println();
            return false;
        }
    }
    
    public void dequeue(){
            System.out.println();
            System.out.print("Trying to dequeue ...\n");
            
        if(! isEmpty()){
            int num = queue[0];
            System.out.println("'" + num + "' was succesfully removed.");
            rearrangeQueue();
            System.out.println();
        } else {
            System.out.println("Failed to dequeue");
        }
    }

    private void rearrangeQueue(){
    
        System.out.println("\n... Rearranging Queue ....");
        int[] temp = new int[nItems];
        int i;
        for(i = 0; i < (nItems - 1); i++){
            temp[i] = queue[i + 1];
        }
        nItems--;
        for(i = 0; i < QSIZE; i++){
            if(i <= nItems){
            queue[i] = temp[i];
        } else {
            queue[i] = 0;
            }
        }
    }
    
    public int peekFront() {
            System.out.print("PEEK FRONT (top value): " + queue[(nItems-1)]);
        return 0;
	}
		
    public int peekRear() {
            System.out.print("PEEK REAR (bottom value): " + queue[0]);
        return 0;
	}
    
    public static void main(String[] args) {
       int limit=0;
       int i;
       int val;
       Scanner input = new Scanner (System.in);
       
       System.out.print("*----------------* ARRAY QUEUE *----------------*\n\n");
       System.out.print("What is the capacity of storage: ");
       limit = input.nextInt();
       Queue queue = new Queue(limit);
       
       System.out.print("STORAGE CAPACITY: " + limit + "\n\n");
       
       for(i=0 ; i<=(limit-1) ; i++){
              System.out.print("Please input your value [" + i + "]: ");
              val = input.nextInt();
              queue.enqueue(val);
              System.out.println();
        }
       
       while (limit>0){
            System.out.print("\n*---------------------------------------------*\n");
            System.out.print("Choose what you want to do (1-6):\n");
            System.out.print("(1) Show the inputted values. \n");
            System.out.print("(2) Add another value.\n");
            System.out.print("(3) Remove a value in your queue.\n");
            System.out.print("(4) Peek rear (bottom) value.\n");
            System.out.print("(5) Peek front (top) value.\n");
            System.out.print("(6) Close the program.");
            System.out.print("\n*---------------------------------------------*\n");
            System.out.print("Choice: ");
            String user = input.next();
       
        switch(user){
                case "1":
                    System.out.print("\n\n");                    
                    queue.showQueue();
                    break;
                
                case "2":
                   System.out.print("\n\n");  
                   if (queue.isFull()){
                   }
                   else {
                       System.out.print("\nPlease input your value: ");
                       val = input.nextInt();
                       queue.enqueue(val);
                       System.out.println();
                   }
                    break;
                    
                case "3":
                    System.out.print("\n\n");  
                    queue.dequeue();
                    break;
                    
                case "4":
                    System.out.print("\n\n");
                    queue.peekRear();
                    break;
                    
                case "5":
                    System.out.print("\n\n");
                    queue.peekFront();
                    break;
                    
                case "6":
                    System.out.print("\n*------ THANK YOU FOR USING MY PROGRAM! ------*\n\n\n");
                    return;
                    
                default:
                    System.out.print("\nPlease choose only from the choices above(1-3).");
            }
            System.out.print("\n\n");
       }
       
    }
}
