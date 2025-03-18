public class LongestWord {
    public static class Node {
        Node[] childs = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i=0; i<26; i++){
                childs[i] = null;
            }
        }
    }

    public static Node root = new Node();


    public static void insert(String word){
        int level = 0;
        int len = word.length();
        int idx = 0;

        Node curr = root;
        for(level=0; level<len; level++){
            idx = word.charAt(level) - 'a';
            if(curr.childs[idx] == null){
                curr.childs[idx] = new Node();
            }
            curr = curr.childs[idx];
        }
        curr.eow = true;
    }


    public static boolean search(String key){
        int level = 0;
        int len = key.length();
        int idx = 0;

        Node curr = root;
        for(level=0; level<len; level++){
            idx = key.charAt(level) - 'a';
            if(curr.childs[idx] == null){
                return false;
            }
            curr = curr.childs[idx];
        }

        return curr != null && curr.eow;
    }

    public static String ans = "";
    
    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }

        for(int i=0; i<26; i++){
            if(root.childs[i] != null && root.childs[i].eow){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.childs[i], temp);
                temp.deleteCharAt(temp.length()-1);//backtrack
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        longestWord(root, new StringBuilder());
        System.out.println(ans);

    }
}
