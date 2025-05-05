package tree_scarach;

public class bst_delete {

    static class node{
        int data;
        node left=null;
        node right=null;

        node(int cdata){
            this.data=cdata;
            this.left=null;
            this.right=null;
        }

    }

    public static node delete(node root,int value){
        if(root == null){
            return null;
        }
        if(root.data > value){
            return root.left;
        }
        else if(root.data < value){
            return root.right;
        }
        else{
            // case 1 : no left node
            if( root.left == null && root.right == null){
                return null;
            }
            // case 2 : one child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                node insucc=inordersuccessor(root.right);
                root.data=insucc.data;
                root.right=delete(root.right,value);
            }
            
        }
        return root;

    }
    public static node inordersuccessor(node root){
        while (root.left != null){
            root=root.left;
        }
        return root;

    }

    public static void main(String[]ares){
        //  This is only Delete node program

        // first insert node then delete
        node root=null;
        delete(root, 5);



    }
    
}
