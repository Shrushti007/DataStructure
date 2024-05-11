
import java.util.Scanner;
public class Double_Ended_Queue {
        int doubleendedqueue[],MaxSize,front1,rear1,front2,rear2;

        void createDQueue(int size)
        {
            MaxSize=size;
            doubleendedqueue=new int[MaxSize];
            int mid=MaxSize/2;
            front1=mid;
            rear1=mid+1;
            front2=mid+1;
            rear2=mid;
        }
        void enQueueL(int element)
        {
            rear1--;
            doubleendedqueue[rear1]=element;
        }
        void enQueueR(int element)
        {
            rear2++;
            doubleendedqueue[rear2]=element;
        }
        boolean is_FullL()
        {
            if(rear1==0)
                return true;
            else
                return false;
        }
        boolean is_FullR()
        {
            if(rear2==MaxSize-1)
                return true;
            else
                return false;
        }
        int deQueueL()
        {
            int temp=doubleendedqueue[front1];
            front1++;
            return(temp);
        }
        int deQueueR()
        {
            int temp=doubleendedqueue[front2];
            front2++;
            return(temp);
        }
        boolean is_EmptyL()
        {
            if(front1<rear1)
                return true;
            else
                return false;
        }
        boolean is_EmptyR()
        {
            if(front2>rear2)
                return true;
            else
                return false;
        }

        void print_QueueL()
        {
            for(int i= front1;i>=rear1;i--)

                System.out.print(doubleendedqueue[i]+" ");
        }
        void print_QueueR()
        {
            for(int i= front2; i <=rear2;i++)

                System.out.print(doubleendedqueue[i]+" ");
        }
        public static void main(String args[])
        {
            int ch,e;
            Scanner in=new Scanner(System.in);
            Double_Ended_Queue obj =new Double_Ended_Queue();
            System.out.println("Enter size of QUEUE:");
            int size=in.nextInt();
            obj.createDQueue(size);//user given size :stack
            do
            {
                System.out.println("LR QUEUE side");
                System.out.println("1.insert\n2.delete\n3.Print0.Exit\n:");
                System.out.println("RL QUEUE side");
                System.out.println("4.insert\n5.delete\n6.Print\n:");
                ch=in.nextInt();
                switch(ch)
                {
                    case 1:
                        if(!obj.is_FullL())//if not full then take data
                        {
                            System.out.println("Enter data to insert:");
                            e=in.nextInt();
                            obj.enQueueL(e);
                            System.out.println("Data to insertead");
                        }
                        else {
                            System.out.println("Queueleft is  Full");
                        }
                        break;
                    case 2:
                        if(!obj.is_EmptyL())//if not Empty then pop
                        {
                            obj.deQueueL();
                            System.out.println("Data dequeue");
                        }
                        else
                        {
                            System.out.println("Queue left Empty");
                        }
                        break;
                    case 3:
                        if(!obj.is_EmptyL())//if not Empty then print
                        {
                            System.out.println("Data in queue");
                            obj.print_QueueL();
                        }
                        else
                        {
                            System.out.println("queue Empty");
                        }
                        break;
                    case 4:
                        if(!obj.is_FullR())//if not full then take data
                        {
                            System.out.println("Enter data to insert:");
                            e=in.nextInt();
                            obj.enQueueR(e);
                            System.out.println("Data to insertead");
                        }
                        else {
                            System.out.println("QueueRight is  Full");
                        }
                        break;
                    case 5:
                        if(!obj.is_EmptyR())//if not Empty then pop
                        {
                            obj.deQueueR();
                            System.out.println("Data dequeue");
                        }
                        else
                        {
                            System.out.println("Queue right Empty");
                        }
                        break;
                    case 6:
                        if(!obj.is_EmptyR())//if not Empty then print
                        {
                            System.out.println("Data in queue");
                            obj.print_QueueR();
                        }
                        else
                        {
                            System.out.println("queue Empty");
                        }
                        break;
                    case 0:
                        System.out.println("Exiting.....");
                        break;
                    default:
                        System.out.println("Wrong option selected");
                        break;
                }
            }while(ch!=0);
        }
    }


