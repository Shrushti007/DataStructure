import java.util.Scanner;

class ENode
{
    int eid;//information
    float salary;
    String name,gender;
    ENode next;//ref to next node
    ENode(int eid,String name,String gender,float salary)
    {
        this.eid=eid;
        this.name=name;
        this.gender=gender;
        this.salary=salary;
        next=null;
    }
}


public class Employee_List_Example {
    ENode root;

    void createList() {
        root = null;
    }

    void insert(int eid,String name,String gender,float salary) {
        ENode n = new ENode(eid,name,gender,salary);
        if (root == null)//not created but assigned
            root = n;
        else
        {
            ENode t = root;//1
            while (t.next != null)//2
            {
                t = t.next;
            }
            t.next = n;//3
        }
    }

    void print_List() {
        if (root == null)//linked list not created
            System.out.println("List empty");
        else {
            ENode t = root;
            System.out.print("\nID \t\t Name \t\t Gender \t\t Salary");
            while (t != null) {
                System.out.print("\n"+t.eid+"\t\t"+t.name+"\t\t"+t.gender+"\t\t"+t.salary);
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
            ENode t = root;
            while (t != null && t.eid!=key)
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
            ENode t ,t2,t3;
            t=t2= root;
            while (t != null && t.eid!=key)
            {t2=t; t = t.next;}
            if(t==null)
                System.out.println(key+" id not found");
            else//found
            {
                if (t == root)//case 1 leftmost
                    root = root.next;
                else if (t.next == null)//case 2 rightmost
                    t2.next = null;
                else//case 3
                    t2.next = t.next;
                System.out.println(t.eid + " Deleted");
            }
        }
    }


    public static void main(String args[]) {
        int ch;
        int eid;
        String name,gender;
        float salary;
        Scanner in = new Scanner(System.in);
        Employee_List_Example obj = new Employee_List_Example();
        obj.createList();//user given size :stack
        do {
            System.out.println("\n1.Register Employee\n2.Delete Employee\n3.Search Employee\n4.Print List\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter id,name,gender,salary:");
                    eid=in.nextInt();
                    name=in.next();
                    gender=in.next();
                    salary=in.nextFloat();
                    obj.insert(eid,name,gender,salary);
                    System.out.println("Data to inserted");
                    break;
                case 2:
                    System.out.println("Enter Emp id:");
                    eid = in.nextInt();
                    obj.delete(eid);
                    break;
                case 3:
                    System.out.println("Enter E_id to search:");
                    eid = in.nextInt();
                    System.out.println(eid+"available in List:"+obj.search(eid));
                    break;

                case 4:
                    obj.print_List();
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

