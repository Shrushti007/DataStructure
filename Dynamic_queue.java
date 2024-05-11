import java.util.Scanner;

public class Dynamic_queue
{
    Node front,rear;

    void createQueue() {
        front = null;
        rear=null;
    }

    void enqueue(int e) {
        //create a node
        Node n = new Node(e);
        if (rear == null)//not created but assigned
            rear =front=  n;
        else {
            rear.next=n;
            rear=n;//2 800
        }

    }
    void dequeue() {
        if (front == null)//linked list not created
            System.out.println("Queue Empty");
        else {
            Node t = front;//1 temp
            if(front==rear) {
                front = rear = null;
            }
                else {
                front = front.next;//2 1800
                System.out.println(t.data + " Poped");
             }
        }

    }

    void print_Queue() {
        if (front == null)//linked list not created
            System.out.println("Queue Empty");
        else {
            Node t = front;
            while (t != null) {
                System.out.println(t.data );
                t = t.next;
            }
        }
    }

    public static void main(String args[]) {
        int ch,e;
        Scanner in = new Scanner(System.in);
        Dynamic_queue obj = new Dynamic_queue();
        obj.createQueue();//user given size :stack
        do {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    obj.enqueue(e);
                    System.out.println("Data to inserted");
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.print_Queue();
                    break;
                case 0:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        } while (ch != 0);
    }
}