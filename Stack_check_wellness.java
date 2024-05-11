import java.util.Scanner;

public class Stack_check_wellness
{
    char stack[];
    int MaxSize,tos;
    void createStack(int size)
    {
        tos=-1;
        MaxSize=size;
        stack=new char[MaxSize];

    }
    void push(char element)
    {
        tos++;
        stack[tos]=element;
    }
    boolean is_Full()
    {
        if(tos==MaxSize-1)
            return true;
        else
            return false;
    }
    char pop()
    {
        char temp=stack[tos];
        tos--;
        return(temp);
    }
    boolean is_Empty()
    {
        if(tos==-1)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        boolean flag=true;
        Stack_check_wellness obj=new Stack_check_wellness();
        //read {}{}{}{} from user
        System.out.println("Enter word:");
        String word=in.next();
        obj.createStack(word.length());//length of word=size of stack
        //read character if { push if } pop till all char not over
        for(int i=0;i<word.length();i++) {
            char c = word.charAt(i);
            if (c == '{')
                obj.push(word.charAt(i));
            else if (c == '}') {
                if (obj.is_Empty() == true) {
                    System.out.println("Error: '}' unexpected");
                    flag=false;

                    break;
                } else {
                    char g = obj.pop();
                }
            }
        }
        if(!obj.is_Empty())//not empty
        {
            System.out.println("Error: '}' expected");
        }
        else if(flag==true){
            System.out.println("balanced:");
        }
    }
}
