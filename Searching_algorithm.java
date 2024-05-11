import java.util.Scanner;

public class Searching_algorithm
{
    int sequential_search(int a[],int size,int key){
        for(int i=0;i<size;i++){
            if(a[i]==key)
            {
                return i;//found at i
            }
        }
        return -1;//not found hence -1

        }

    public static void main(String args[]) {
        int a[]={12,44,22,66,77,10,89,19},size,key;
        size=a.length;
        Searching_algorithm obj=new Searching_algorithm();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a key to search:");
        key= in.nextInt();
        int response=obj.sequential_search(a,size,key);
        if(response==-1)
            System.out.println(key+ "not found in data");
        else
            System.out.println(key+ "found in data at index "+response);

    }
}