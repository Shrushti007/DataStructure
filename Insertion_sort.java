import java.util.Scanner;
public class Insertion_sort {
        void insertion_sort(int a[],int size)
        {
            System.out.println("Insertion sort called:");
            int i,j,new_element;
            for (i=0;i<size-1;i++)
            {
                new_element=a[i+1];
                j=i+1;
                while( j>0 && a[ j-1]>new_element)
                {
                    a[ j ]= a[j-1];
                    j--;
                }
                a[j]=new_element;
            }
        }


        void print_Array(int a[])
        {
            System.out.println("Array has:");
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
        public static void main(String args[])
        {
            int a[]={11,22,1,3,7,55,45};
            Insertion_sort obj=new Insertion_sort();
            obj.insertion_sort(a,a.length);
            obj.print_Array(a);
        }
    }


