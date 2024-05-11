import java.util.Scanner;
import java.math.*;

class Tnode
{
    int data;
    Tnode left,right;
    Tnode(int data)
    {
        this.data=data;
        left=right=null;
    }
}


public class Tree_Example {
    Tnode root;

    void createTree() {
        root = null;
    }

    void insert(Tnode r, Tnode n) { //in BST Form
        //create a node
        if (root == null)//not created but assigned
            root = n;
        else {
            if (n.data < r.data) {
                if (r.left == null)
                    r.left = n;
                else
                    insert(r.left, n);
            } else {
                    if (r.right == null)
                        r.right = n;
                    else
                        insert(r.right, n);
                }


            }
        }

    void inorder(Tnode r) //LPR
    {
        if(r!=null)
        {
            inorder(r.left);//L
            System.out.print(r.data+",");//P
            inorder(r.right);//R
        }
    }

    void preorder(Tnode r)//PLR
    {
        if (r != null) {

            System.out.print(r.data+",");//p
            preorder(r.left);//L
            preorder(r.right);//R

        }

    }

    void postorder(Tnode r)//LRP
    {
        if (r != null) {
            postorder(r.left);//L
            postorder(r.right);//R
            System.out.print(r.data+",");//p


        }
    }

    boolean search(Tnode r, int key) {
        boolean right, left;
        if (r == null)
            return false;
        else {
            if (r.data == key)
                return true;
            else {
                left = search(r.left , key);
                right = search(r.right , key);
                return left || right;
            }
        }

    }
    int count(Tnode r)
    {
        if(r==null)
            return 0;
        else {
           int left = count(r.left);
            int right = count(r.right);
            return left+right+1;
        }
    }
    int depth(Tnode r)
    {
        if(r==null)
            return 0;
        else {
            int left = count(r.left);
            int right = count(r.right);
            return Math.max(left,right)+1;
        }
    }

    public static void main(String args[]) {
        int ch,e;
        Scanner in = new Scanner(System.in);
        Tree_Example obj = new Tree_Example();
        obj.createTree();//user given size :stack
        do {
            System.out.println("\n1.Insert \n2.Inorder\n3.Preorder\n4.Postorder\n5.Search\n6.count\n7.depth\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    Tnode n=new Tnode(e);
                    obj.insert(obj.root,n);
                    System.out.println("Data to inserted");
                    break;

                case 2:
                    System.out.println("Data ");
                    obj.inorder(obj.root);
                    break;

                case 3:
                    System.out.println("Data ");
                    obj.preorder(obj.root);
                    break;


                case 4:
                    System.out.println("Data ");
                    obj.postorder(obj.root);
                    break;

              case 5:
                  System.out.println("Enter data:");
                  e = in.nextInt();
                  System.out.println(e+"found in tree:"+obj.search(obj.root,e));
                  break;
                case 6:
                    System.out.println("Total nodes in tree:"+obj.count(obj.root));
                    break;
                case 7:
                    System.out.println("Depth of tree:"+(obj.depth(obj.root)-1));
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

