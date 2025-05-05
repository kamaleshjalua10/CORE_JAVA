package tree_scarach;

public class BST_insert_search {
    static class node{
        int data;
        node left;
        node right;

        node(int cdata){
            this.data=cdata;
            this.left=null;
            this.right=null;
        }
    }

    public static node insert(node root,int value){
        if(root == null){
            root=new node(value);
        }
        else if(root.data > value){
            root.left=insert(root.left,value);
        }
        else{
            root.right=insert(root.right, value);
        }
        return root;
    }

    public static boolean search(node root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        else if(root.data > key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
       
    }

    public static void inorder(node root){
        if(root== null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    public static void main(String[]ares){
        int arr[]={4,2,7,6,1,9,20,5};
        node root=null;
        for(int i=0;i<arr.length;i++){
            root=insert(root, arr[i]);
        }
        inorder(root);
        System.out.println();
        if(search(root, 5)){
            System.out.println(" Key Exits in the tree ");
        }
        else{
            System.out.println(" Key Not Exits in the tree ");
        }

    }
}
