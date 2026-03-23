package BinaryTree;

import org.w3c.dom.ls.LSOutput;

import Loops.inverted_star1;

import java.util.*;

import java.util.LinkedList;

public class BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }
     static class binaryTree {
        static int indx = -1;
        public static Node buildTree(int[] nodes){
            indx++;
            if(nodes[indx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[indx]);
            newNode.left =  buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        
        
        
    }

    public static void preOrder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
        
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }



    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            } else{
                System.out.print(curr.data+" ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }

    }

    public static int heightTree(Node root){
        if(root == null){
            return 0;
        }
        int lh = heightTree(root.left);
        int rh = heightTree(root.right);
        int height = Math.max(lh,rh)+1;
        return height;
    }

    public static int nodesTree(Node root){
        if(root == null){
            return 0;
        }
        int lc = nodesTree(root.left);
        int rc = nodesTree(root.right);
        int tc = lc + rc + 1;
        return tc;
    }

    public static int sumNodes(Node root){
        if(root == null){
            return 0;
        }

        int lsum = sumNodes(root.left);
        int rsum = sumNodes(root.right);
        int tsum = lsum+rsum+root.data;
        return tsum;
    }

    public static int dim1(Node root){
        if(root == null){return 0;}
        int ld = dim1(root.left);
        int rd = dim1(root.right);
        int lh = heightTree(root.left);
        int rh = heightTree(root.right);
        int sd = lh+rh+1;

        int t = Math.max(ld,rd);
        int ret = Math.max(sd,t);

        return ret;
    }

    static class Info {
        int di;
        int ht;

        public Info(int di, int ht){
            this.di = di;
            this.ht = ht;  
        }
        
    }
    public static Info dim2(Node root){// more optimize

        if(root == null){
            return new Info(0, 0);
        }

        Info leftInfo = dim2(root.left);
        Info rightInfo = dim2(root.right);

        int di = Math.max(Math.max(leftInfo.di, rightInfo.di), leftInfo.ht + rightInfo.ht +1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) +1;

        return new Info(di,ht);
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = binaryTree.buildTree(nodes);

        System.out.print("\nRoot Node:"+root.data);
        System.out.print("\nPreorder : ");  preOrder(root);
        System.out.print("\nInorder : ");   inOrder(root);
        System.out.print("\nPostorder : ");   postOrder(root);
        System.out.println("\nLevelorder : ");  levelOrder(root);
        System.out.print("Height : "+heightTree(root));
        System.out.print("\nNo. of Nodes : "+nodesTree(root));
        System.out.print("\nSum of Nodes : "+sumNodes(root));
        System.out.print("\nDiam of Tree aprch1 : "+dim1(root));
        System.out.print("\nDiam of Tree aprch2 : "+dim2(root).di);



    }
}
