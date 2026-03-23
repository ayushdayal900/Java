package BinaryTree;

import java.util.ArrayList;

public class LowestCommomAncestor {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){ 
            this.data = data;
            left = null;
            right= null;
        }        
    }
    
    public static boolean getPath(Node root, int n, ArrayList<Node> p){

        if(root == null){
            return false;
        }

        p.add(root);

        if(root.data == n){
            return true;
        }

        boolean foundLeft  = getPath(root.left,  n, p);
        boolean foundRight = getPath(root.right, n, p);

        if(foundLeft || foundRight){
            return true;
        }

        p.remove(p.size()-1);
        return false;


    }
    public static Node LCA(Node root, int n1, int n2){

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //last commom ancestor
        int i=0;
        for(;i<path1.size() && i<path2.size(); i++){
            if(path1.get(i)!= path2.get(i)){
                break;
            }
        }

        //last equal node -> i-1
        Node lca = path1.get(i-1);
        return lca;
    }

    //////////////////////////////// APPROACH 2 ///////////////////////////////////////////////////////////
    public static Node LCA2(Node root, int n1, int n2){
        if(root == null){
            return null;
        }

        if(root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLca = LCA2(root.left, n1, n2);
        Node rightLca =LCA2(root.right, n1, n2);

        //leftLc1 = valid but rightLca = null
        if(rightLca == null){
            return leftLca;
        }
        //leftLc1 = null but rightLca = valid
        if(leftLca == null){
            return rightLca;
        }
        //itself lca
        return root;
        
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 7;
        System.out.println(LCA(root, n1, n2).data);
        System.out.println(LCA2(root, n1, n2).data);

    }

}
