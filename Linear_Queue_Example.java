import java.util.Queue;
import java.util.Scanner;

public class Linear_Queue_Example {

        int queue[], MaxSize, front,rear;

        void createQueue(int size) {
            rear=-1;
            front=0;
            MaxSize = size;
            queue = new int[MaxSize];
        }

        void enqueue(int element) {
            rear++;
            queue[rear] = element;
        }

        int dequeue() {

            int temp = queue[front];
            front++;
            return (temp);
        }

        boolean is_Empty() {
            if (front>rear)
                return true;
            else
                return false;
        }

        boolean is_Full() {
            if (rear == MaxSize - 1)
                return true;
            else
                return false;
        }

        void print_queue() {
            for (int i = front; i <= rear; i++)
                System.out.print(queue[i]+"--");
        }

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            Linear_Queue_Example obj = new Linear_Queue_Example();
            System.out.println("Enter size of QUEUE:");
            int size = in.nextInt();
            int ch;
            obj.createQueue(size); //user given size:stack

            do {
                System.out.println("1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
                ch = in.nextInt();
                switch (ch) {
                    case 1:
                        if (!obj.is_Full())//if not full then take data
                        {
                            System.out.println("Enter data to insert:");
                            int e = in.nextInt();
                            obj.enqueue(e);
                            System.out.println("Data to enqueued");
                        } else {
                            System.out.println("queue Full");
                        }
                        break;


                    case 2:
                        if (!obj.is_Empty())//if not full then dequeue data
                        {
                            System.out.println("Enter data to Pop:");
                            int p = obj.dequeue();
                            System.out.println("Data dequeue :" + p);
                        } else {
                            System.out.println("Queue Full");
                        }
                        break;

                    case 3:
                        if (!obj.is_Empty()) {
                            System.out.println("Data in Queue:");
                            obj.print_queue();
                        } else {
                            System.out.println("Queue empty");
                        }
                        break;
                    case 0:
                        System.out.println("Exiting....");
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;

                }


            }while( ch != 0);


        }
    }


