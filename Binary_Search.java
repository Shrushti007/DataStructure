
import java.util.Scanner;

public class Binary_Search {

        int binary_serach(int a[],int start,int end,int key)
        {
            if(start<=end)//searchable
            {
                int mid=(start+end)/2;
                if(key==a[mid])
                    return mid;
                else
                {
                    if(key<a[mid])//left half
                        return binary_serach(a,start,mid-1,key);
                    else//right half
                        return binary_serach(a,mid+1,end,key);
                }

            }
            else
            {
                return -1;//not found
            }
        }

        public static void main(String args[])
        {
            int a[]={12,44,22,66,77,10,89,19},size,key;
            size=a.length;
            Binary_Search obj=new Binary_Search();
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a key to search:");
            key=in.nextInt();
            int response=obj.binary_serach(a,0,a.length-1,key);
            if(response==-1)
                System.out.println(key+" not found in data");
            else
                System.out.println(key+"found in data at index "+response);
        }
    }
