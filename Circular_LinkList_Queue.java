import java.util.Scanner;

public class Circular_LinkList_Queue {
    Node root,last;

    void createList() {
        root =last= null;
    }

    void insert_Left(int e) {
        //create a node
        Node n = new Node(e);
        if (root == null) {//not created but assigned
            root = last = n;
            last.next=root;
        }
            else {
            n.next = root;//1 1000
            root = n;//2 800
            last.next=root;
        }

    }


    void delete_Left() {
        if (root == null)//linked list not created
            System.out.println("List empty");
        else {
            Node t = root;//1 temp
            if (root == last)//not created but assigned
            {
                root =last=  null;
            }
            else {
                root = root.next;//2 1800
                last.next = root;
            }
            System.out.println(t.data + "Deleted");
        }

    }

    void insert_right(int e) {
        Node n = new Node(e);
        if (root == null) {//not created but assigned
            root = last = n;
            last.next=root;
        }
        else {
            last.next=n;
            last=n;
            last.next=root;

        }
    }

    void delete_Right() {
        if (root == null)//linked list not created
            System.out.println("List empty");
        else {
            Node t, t2;
            t = t2 = root;//1 temp
            if (root == last)//not created but assigned
            {
                root = last = null;
            }
            else {
                while (t != last)//2
                {
                    t2 = t;
                    t = t.next;
                }
                last = t2;
                last.next = root;
                System.out.println(t.data + "Deleted");
            }

        }
    }
    void print_List() {
        if (root == null)//linked list not created
            System.out.println("List empty");
        else {
            Node t = root;
            do {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }while (t !=root);
        }
    }

    public static void main(String args[]) {
        int ch,e;
        Scanner in = new Scanner(System.in);
        Circular_LinkList_Queue obj = new Circular_LinkList_Queue();
        obj.createList();//user given size :stack
        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n0.Exit\n:");
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


