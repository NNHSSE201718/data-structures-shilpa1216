/**
A binary tree in which each node has two children.
 */
public class BinaryTree
{
    private Node root;

    /**
    Constructs an empty tree.
     */
    public BinaryTree()
    {
        this.root = null;
    } 

    /**
    Constructs a tree with one node and no children.
    @param rootData the data for the root
     */
    public BinaryTree(Object rootData) 
    {
        this.root = new Node();
        this.root.data = rootData;
        this.root.left = null;
        this.root.right = null;
    }

    /**
    Constructs a binary tree.
    @param rootData the data for the root
    @param left the left subtree
    @param right the right subtree
     */
    public BinaryTree(Object rootData, BinaryTree left, BinaryTree right)
    {
        this (rootData);
        this.root.left = left.root;
        this.root.right = right.root;
    }

    class Node
    {
        Object data;
        Node left;
        Node right;
    }

    /**
    Returns the height of the subtree whose root is the given node.
    @param n a node or null
    @return the height of the subtree, or 0 if n is null
     */
    private static int height(Node n)
    {
        if ( n == null)
        {
            return 0;
        } 
        else
        {
            return 1 + Math.max (BinaryTree.height(n.left), BinaryTree.
                height(n.right));
        }
    }

    /**
    Returns the height of this tree.
    @return the height
     */
    public int height()
    {
        return BinaryTree.height( this.root);
    }

    /**
    Checks whether this tree is empty.
    @return true if this tree is empty
     */
    public boolean isEmpty()
    {
        return (this.root == null);
    }

    /**
    Gets the data at the root of this tree.
    @return the root data
     */
    public Object data()
    {
        return this.root.data;
    }

    /**
    Gets the left subtree of this tree.
    @return the left child of the root
     */
    public BinaryTree left() 
    {
        BinaryTree subtree = new BinaryTree();
        subtree.root = this.root.left;
        return subtree;
    }

    /**
    Gets the right subtree of this tree.
    @return the right child of the root
     */
    public BinaryTree right() 
    { 
        BinaryTree subtree = new BinaryTree();
        subtree.root = this.root.right;
        return subtree;

    }

    /**
     * A visitor whos visit mehtod is called for each visited node during a tree 
     * traversal.
     */

    public interface Visitor
    {
        /**
         * This method is called for each visited node. 
         * @param   data  the data of the node
         */
        void visit(Object data);

    }
    public void preOrder(Visitor v)
    {
        BinaryTree.preOrder(this.root, v);
    }

    private static void preOrder(Node n, Visitor v)
    {
        if (n== null)
        {
            return;
        }
        
        v.visit(n.data);
    }

    
    public void postOrder(Visitor v)
    {
        BinaryTree.postOrder(this.root, v);
    }

    private static void postOrder(Node n, Visitor v)
    {
        if (n== null)
        {
            return;
        }
        
        v.visit(n.data);
    }

    public void inOrder(Visitor v)
    {
        BinaryTree.inOrder(this.root, v);
    }

    private static void inOrder(Node n, Visitor v)
    {
        if (n== null)
        {
            return;
        }
        
        inOrder(n.left,v);
        v.visit(n.data);
        inOrder(n.right, v);
        
    }
}
