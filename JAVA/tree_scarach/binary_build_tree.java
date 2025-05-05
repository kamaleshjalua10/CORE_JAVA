package tree_scarach;
import java.util.Queue;
import java.util.LinkedList;

public class binary_build_tree {
    
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

    static class binarytree{
        static int index=-1;
        public static node buildtree(int arr[]){
            index++;
            if(arr[index]== -1){
                return null;
            }
            node newnode = new node(arr[index]);
            newnode.left=buildtree(arr);
            newnode.right=buildtree(arr);

            return newnode;

        }
        public static void inorder(node root){
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(" ("+root.data+") ");
            inorder(root.right);

        }

        public static void preorder(node root){
            if (root == null) {
                return;
            }
            System.out.print(" ("+root.data +") ");
            preorder(root.left);
            preorder(root.right);

        }

        public static void postorder(node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(" ("+ root.data +") ");


        }

        // level order travarsal
        public static void levelorder(node root){
            if(root == null){
                return ;
            }
            Queue<node>q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                node copy=q.remove();

                if(copy == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(copy.data+" ");
                    if(copy.left != null){
                        q.add(copy.left);
                    }
                    if(copy.right !=null){
                        q.add(copy.right);
                    }

                }


            }
            

        }
    }

    public static void main(String[]ares){
        int arr[]={5,6,7,9,-1,-1,12,-1,-1,13,-1,-1,20,10,-1,15,-1,-1,22,-1,30,-1,-1};
        binarytree tree=new binarytree();
        node root=tree.buildtree(arr);
        tree.levelorder(root);
        // System.out.println(root.data);
    

        // System.out.println(" preorder ");
        // tree.preorder(root);
        // System.out.println();
        // System.out.println(" inorder  :");
        // tree.inorder(root);
        // System.out.println();
        // System.out.println(" postorder ");
        // tree.postorder(root);

    }
    
}
