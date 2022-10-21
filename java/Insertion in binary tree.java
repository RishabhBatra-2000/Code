import java.util.*;
class Node
{
    int value;
    Node left,right;
    Node(int value)
    {
        this.value=value;
        left=right=null;
    }
}
class Insertion
{
    Node root; 
    Insertion()
    {
        root=null;
    }

    public static void preorder(Node ptr)
    {
        if(ptr==null)
        return ;
        System.out.print(ptr.value+" ");
        preorder(ptr.left);
        preorder(ptr.right);
     }
    public void insert(int item)
    {
        root =insertNode(root,item); 
    }
    public Node insertNode(Node root,int item)
    {
        if(root==null)   
        {
            root=new Node(item);
            return root;
         }
        if(item<root.value) 
            root.left= insertNode(root.left,item);
            else if(item>root.value) 
            root.right=insertNode(root.right,item);
            return root;
    }
    public static void main(String[] args)
    {
        Insertion tree=new Insertion();
        System.out.println("\nInserting "+"30");
        tree.insert(30);
        tree.preorder(tree.root);
        System.out.println("\nInserting "+"50");
        tree.insert(50);
        tree.preorder(tree.root);
        System.out.println("\nInserting "+"55");
        tree.insert(55);
        tree.preorder(tree.root);
        System.out.println("\nInserting "+"45");
        tree.insert(45);
        tree.preorder(tree.root);
        System.out.println("\nInserting "+"10");
        tree.insert(10);
        tree.preorder(tree.root);
        System.out.println("\nInserting "+"5");
        tree.insert(5);
        tree.preorder(tree.root);
        System.out.println("\nInserting "+"15");
        tree.insert(15);
        tree.preorder(tree.root);
        System.out.println("\nInserting "+"12");
        tree.insert(12);
        tree.preorder(tree.root);
        System.out.println("\nPrinting preorder traversal of binary tree ");
        tree.preorder(tree.root);
    }
}
