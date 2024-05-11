import java.util.Scanner;

class Node
{
    int data;//information
    Node next;//ref to next node
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
public class Linear_Linked_list {
    Node root;

    void createList() {
        root = null;
    }

    void insert_Left(int e) {
        //create a node
        Node n = new Node(e);
        if (root == null)//not created but assigned
            root = n;
        else {
            n.next = root;//1 1000
            root = n;//2 800
        }

    }

    void delete_Left() {
        if (root == null)//linked list not created
            System.out.println("List empty");
        else {
            Node t = root;//1 temp
            root = root.next;//2 1800
            System.out.println(t.data + "Deleted");
        }

    }

    void insert_right(int e) {
        Node n = new Node(e);
        if (root == null)//not created but assigned
            root = n;
        else {
            Node t = root;//1
            while (t.next != null)//2
            {
                t = t.next;
            }
            t.next = n;//3
        }
    }

    void delete_Right() {
        if (root == null)//linked list not created
            System.out.println("List empty");
        else {
            Node t, t2;
            t = t2 = root;//1 temp
            while (t.next != null)//2
            {
                t2 = t;
                t = t.next;
            }
            if (t == root)//only if 1 node exists
                root = null;
            else//if more than 1
                t2.next = null;//3
            System.out.println(t.data + "Deleted");
        }

    }

    void print_List() {
        if (root == null)//linked list not created
            System.out.println("List empty");
        else {
            Node t = root;
            while (t != null) {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
        }
    }
    boolean search(int key)
    {
        if (root == null)//linked list not created
        {   System.out.println("List empty");
            return false;}
        else {
            Node t = root;
            while (t != null && t.data!=key)
                t = t.next;
            if(t==null)
                return false;
            else
                return true;
        }
    }
    void delete(int key)
    {
        if (root == null)//linked list not created
            System.out.println("List empty");
        else
        {
            Node t ,t2,t3;
            t=t2= root;
            while (t != null && t.data!=key)
            {t2=t; t = t.next;}
            if(t==null)
                System.out.println(key+" not found");
            else//found
            {
                if (t == root)//case 1 leftmost
                    root = root.next;
                else if (t.next == null)//case 2 rightmost
                    t2.next = null;
                else//case 3
                    t2.next = t.next;
                System.out.println(t.data + " Deleted");
            }
        }
    }
    void insertAt(int index,int key)
    {
        if (index==0)
        {
            if (root == null)//linked list not created
            {
                Node n = new Node(key);
                root = n;
            } else {
                Node n = new Node(key);
                n.next = root;
                root = n;
            }
        }
        else {
            Node t2,t;
            t =t2= root;
            while (index>0 && t!=null)
            {t2=t;t = t.next;index--;}
            if(t==null)
                System.out.println("index out of bound");
            else
            {
                Node n = new Node(key);
                t2.next=n;
                n.next=t;
            }

        }
    }

    public static void main(String args[]) {
        int ch,e;
        Scanner in = new Scanner(System.in);
        Linear_Linked_list obj = new Linear_Linked_list();
        obj.createList();//user given size :stack
        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n6.Search\n7.Delete On Data\n8.Insert at\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    obj.insert_Left(e);
                    System.out.println("Data to inserted");
                    break;
                case 2:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    obj.insert_right(e);
                    System.out.println("Data to inserted");
                    break;
                case 3:
                    obj.delete_Left();
                    break;
                case 4:
                    obj.delete_Right();
                    break;
                case 5:
                    obj.print_List();
                    break;
                case 6:
                    System.out.println("Enter data to search:");
                    e = in.nextInt();
                    System.out.println(e+"available in List:"+obj.search(e));
                    break;
                case 7:
                    System.out.println("Enter data to delete:");
                    e = in.nextInt();
                    obj.delete(e);
                    break;
                case 8:
                    System.out.println("Enter index and data\n");
                    int index=in.nextInt();
                    e = in.nextInt();
                    obj.insertAt(index,e);
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