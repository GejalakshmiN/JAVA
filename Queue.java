
import java.util.Scanner;
//Interface to store template of queue's details 

interface Resources {

    int MaxCapacity = 5;
    int QueueArray[] = new int[MaxCapacity];
}
//Interface to implement Enqueue operation

interface Enqueue extends Resources {

    void add(int a);
}
//Interface to implement Dequeue operation

interface Dequeue extends Resources {

    int remove();
}
//Interface to implement Display operation

interface Display extends Resources {

    void print();
}
//Main class implementing the above operational interfaces

public class Queue implements Enqueue, Dequeue, Display {

    int front = -1, rear = -1;//Queue pointers

    public void add(int a) {
        if (rear == MaxCapacity - 1)//Overflow 
        {
            System.out.println("Queue is full.");
        } else {
            if (front == -1) {
                front = 0;
            }
            QueueArray[++rear] = a;
            System.out.println(a + " added to the queue.");
        }
    }

    public int remove() {
        if (front == -1)//Underflow  
        {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            int value = QueueArray[front];
            if (front >= rear) {
                front = rear = -1;
            } else {
                front++;
            }
            return value;
        }
    }

    public void print() {
        if (front == -1)//Underflow 
        {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(QueueArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        Queue queue = new Queue();
        //Menu driven Queue Implementation
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Add element to queue");
            System.out.println("2. Remove element from queue");
            System.out.println("3. Print queue");
            System.out.println("Any other key to exit");

            int choice = myobj.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int element = myobj.nextInt();
                    queue.add(element);
                    break;
                case 2:
                    int removed = queue.remove();
                    if (removed != -1) {
                        System.out.println("Removed element: " + removed);
                    }
                    break;
                case 3:
                    queue.print();
                    break;
                default:
                    System.out.println("Exitting.......");
                    for (int i = 0; i < 1000; i++) {
                    }
                    System.out.println("Exitted");
                    System.exit(0);
            }
        }
    }
}
