import javax.xml.transform.stream.StreamSource;
import java.util.*;

public class StackExample {

    int stack[], MaxSize, tos;

    void createStack(int size) {
        tos = -1;
        MaxSize = size;
        stack = new int[MaxSize];
    }

    void push(int element) {
        tos++;
        stack[tos] = element;
    }

    int pop() {

        int temp = stack[tos];
        tos--;
        return (temp);
    }

    boolean is_Empty() {
        if (tos == -1)
            return true;
        else
            return false;
    }

    int peek() {
        return (stack[tos]);
    }

    boolean is_Full() {
        if (tos == MaxSize - 1)
            return true;
        else
            return false;
    }

    void print_stack() {
        for (int i = tos; i > -1; i--)
            System.out.println(stack[i]);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        StackExample obj = new StackExample();
        System.out.println("Enter size of stack:");
        int size = in.nextInt();
        int ch;
        obj.createStack(size); //user given size:stack

        do {
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit\n:");
             ch = in.nextInt();
            switch (ch) {
                case 1:
                    if (!obj.is_Full())//if not full then take data
                    {
                        System.out.println("Enter data to push:");
                        int e = in.nextInt();
                        obj.push(e);
                        System.out.println("Data to pushed");
                    } else {
                        System.out.println("Stack Full");
                    }
                    break;


                case 2:
                    if (!obj.is_Empty())//if not full then take data
                    {
                        System.out.println("Enter data to Pop:");
                        int p = obj.pop();
                        System.out.println("Data poped :" + p);
                    } else {
                        System.out.println("Stack Full");
                    }
                    break;

                case 3:
                    if (!obj.is_Empty()) {
                        int p = obj.peek();
                        System.out.println("Data @ peek is  :" + p);
                    } else {
                        System.out.println("Stack empty");
                    }
                    break;

                case 4:
                    if (!obj.is_Empty()) {
                        System.out.println("Data in stack:");
                        obj.print_stack();
                    } else {
                        System.out.println("Stack empty");
                    }
                    break;
                case 0:
                    System.out.println("Exiting....");
                    break;
                default:

            }


        }while( ch != 0);


    }
}
