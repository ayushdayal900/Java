public class searchInTrie {


    static class  Node{
        
        Node[] childs = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i=0; i<26; i++){
                Node[i] = null;
            }
        }        
    }

    public static Node root = new Node();

    // search in trie : tc:O(L): L = leangthof longest word
    public static boolean search(String s){

        Node curr = root;

        for(int level = 0; level<s.length(); level++){
            int i = s.charAt(level) - 'a';
            if(curr.childs[i] == null){
                return false;
            }else{
                curr = curr.childs[i];
            }
        }

        return curr.eow==true;
        
    }


    public static void main(String[] args) {
        
    }
}
