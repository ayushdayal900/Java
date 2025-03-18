import java.util.ArrayList;

public class ShortestCommonPrefix {

    static class Node {
        Node[] childs = new Node[26];
        boolean eow = false;
        int freq = 1;
        
        public Node(){
            for(int i=0; i<26; i++){
                childs[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // insert function
    public static void insert(String s){
        Node curr = root;
        for(int level = 0; level<s.length(); level++){
            int i = s.charAt(level) - 'a';
            if(curr.childs[i] == null){
                curr.childs[i] = new Node();
            }else{
                curr.childs[i].freq++;
            }
            curr = curr.childs[i];
        }
        curr.eow = true;
    }



    // search function
    public static String search(String s){
        Node curr = root;
        StringBuilder sb = new StringBuilder();

        for(int level = 0; level<s.length(); level++){

            char ch = s.charAt(level);
            int i = ch - 'a';
            curr = curr.childs[i];

            sb.append(ch);

            if(curr.freq == 1){
                return sb.toString();
            }
        }
        return s;
    }



    public static void main(String[] args) {

        String[] arr = {"zebra", "dog", "duck", "dove"};
        for(String s : arr){
            insert(s);
        }

        ArrayList<String> al = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            al.add(search(arr[i]));
            System.out.println(al.get(i));
        }
    }
}
