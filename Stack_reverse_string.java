import java.util.Scanner;
public class Stack_reverse_string
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
        Stack_reverse_string obj=new Stack_reverse_string();
        //read word from user
        System.out.println("Enter word:");
        String word=in.next();

        obj.createStack(word.length());//length of word=size of stack
        //read character by character and push them in stack
        for(int i=0;i<word.length();i++)
        {
            obj.push(word.charAt(i));
        }
        //pop and print reversed string
        while(!obj.is_Empty())
            System.out.print(obj.pop());

    }
}


