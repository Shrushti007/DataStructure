import java.util.Scanner;
public class Quick_sort {
        void quick_sort(int a[],int start, int end)
        {
            System.out.println("Quick sort called:");
            int i,j,pivot,temp;
            i=start;
            j=end;
           pivot=end;
            // pivot=start;
            while (i < j)
            {
                while(a[i]<a[pivot])
                    i++;
                while(a[j]>a[pivot])
                    j--;
                if(i<j)
                {
                    temp=a[i];a[i]=a[j];a[j]=temp;
                }
            }
            if(i<end)
                quick_sort(a,i+1,end);
            if(start<j)
                quick_sort(a,start,j-1);
        }



        void print_Array(int a[])
        {
            System.out.println("Array has:");
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+" , ");
            }
        }
        public static void main(String args[])
        {
            int a[]={12,44,22,66,77,10,89,19};
            Quick_sort obj=new Quick_sort();
            //obj.bubble_sort(a,a.length);
            //obj.selection_sort(a,a.length);
            //obj.insertion_sort(a,a.length);
            obj.quick_sort(a,0,a.length-1);
            obj.print_Array(a);
        }
    }


