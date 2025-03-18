public class insertInTrie {

    public static class Node{
        Node[] childs = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i=0; i<26; i++){
                childs[i] = null;
            }
        }
    }

    // inserting in trie
    public static void insert(String s){    //O(L): L = length of longest word
        Node curr = root;
        
        for(int level = 0; level<s.length(); level++){
            // check if node is present:  present-> got to it, absent-> create

            int i = s.charAt(level) - 'a';
            if(curr.childs[i] == null){
                // create a node at that place
                curr.childs[i] = new Node();
            }else{
                curr = curr.childs(s.charAt(i - 'a'));
            }   
        }
        curr.eow = true;
    }


    
    public static Node root = new Node();

    public static void main(String[] args) {
        String words[] = {"the","a","there","their","any","thee"};
        
        for(String w : words){
            insert(w);
        }
        

    }
}
