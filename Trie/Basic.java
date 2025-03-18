// public class Basic {

//     static class  Node{
//         Node[] childs = new Node[26];
//         // boolean endOfWord = false;
//         boolean eow = false;

//         public Node(){
//             for(int i=0; i<26; i++){
//                 childs[i] = null;
//             }
//         }   
        
//     }

//     public static Node root = new Node();



//     // inserting in trie
//     public static void insert(String s){    //O(L): L = length of longest word

//         Node curr = root;

//         for(int level = 0; level<s.length(); level++){
//             // check if node is present:  present-> got to it, absent-> creat
//             int i = s.charAt(level) - 'a';
//             if(curr.childs[i] == null){
//                 // create a node at that place
//                 curr.childs[i] = new Node();
//             }
//             curr = curr.childs[i];
//         }

//         curr.eow = true;
//     }


//     // search in trie : tc:O(L): L = leangthof longest word
//     // s = key
//     public static boolean search(String s){

//         Node curr = root;

//         for(int level = 0; level<s.length(); level++){
//             int i = s.charAt(level) - 'a';
//             if(curr.childs[i] == null){
//                 return false;
//             }
//             curr = curr.childs[i];

//         }

//         return curr.eow == true;
//     }



//     public static boolean wordBreak(String s){

//         if (s.length() ==0){
//             return true;
//         }
//         for(int i=1; i<=s.length(); i++){
            

            
//             String s1 = s.substring(0, i);
//             String s2 = s.substring(i, s.length());
//             // System.out.println(s1);
//             // System.out.println(s2);
//             /* recursicve */

//             // if(search(s.substring(0, i)) && wordBreak(s.substring(i))){
//             if(search(s1) && wordBreak(s2)){
//                 System.out.println("'found::::::::'"+s1);
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         // String words[] = {"the","a","there","their","any","thee"};
//         String words[] = {"i","like","sam","samsung","mobile","ice"};

//         // inserting
//         for(String w : words){
//             insert(w);
//         }   

//         // searching
//         // System.out.println(search("thee"));
//         // System.out.println(search("thor"));
//         // System.out.println(search("an"));
//         // System.out.println(search("any"));


//         // word break problem
//         String k = "ilikesam";

//         System.out.println(wordBreak(k));
//     }
// }



// class Solution {

//     public static class Node {

//         Node[] childs = new Node[26];
//         boolean eow = false;

//         public Node() {
//             for (int i = 0; i < 26; i++) {
//                 childs[i] = null;
//             }
//         }
//     }

    
//     public static Node root;

//     public static void insert(String s) {
//         Node curr = root;
//         for (int level = 0; level < s.length(); level++) {
//             int i = s.charAt(level) - 'a';
//             if (curr.childs[i] == null) {
//                 curr.childs[i] = new Node();
//             } 
//             curr = curr.childs[i];
//         }
//         curr.eow = true;
//     }

//     public static boolean search(String s) {
//         Node curr = root;

//         for (int level = 0; level < s.length(); level++) {
//             int i = s.charAt(level) - 'a';
//             if (curr.childs[i] == null) {
//                 return false;
//             } 
//             curr = curr.childs[i];
//         }
//         return curr.eow == true;
//     }

//     public static boolean wordBreak(String s) {

//         if (s.length() == 0) {
//             return true;
//         }

//         for (int i = 1; i <= s.length(); i++) {

//             String s1 = s.substring(0, i);
//             String s2 = s.substring(i);
//             System.out.print(s1 + " " + s2);

//             if (search(s1) && wordBreak(s2)) {
//                 return true;
//             }

//         }
//         return false;
//     }

//     public boolean wordBreak(String s, List<String> wordDict) {
//         root =  = new Node();

//         for (String w : wordDict) {
//             insert(w);
//         }

//         return wordBreak(s);
//     }
// }


// claude code

class Solution {
    
    public static class Node {
        Node[] childs = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                childs[i] = null;
            }
        }
    }
    
    private Node root;
    private Boolean[] dp;  // Memoization array

    private void insert(String s) {
        Node curr = root;
        for (int level = 0; level < s.length(); level++) {
            int i = s.charAt(level) - 'a';
            if (curr.childs[i] == null) {
                curr.childs[i] = new Node();
            } 
            curr = curr.childs[i];
        }
        curr.eow = true;
    }

    private boolean search(String s) {
        Node curr = root;
        for (int level = 0; level < s.length(); level++) {
            int i = s.charAt(level) - 'a';
            if (curr.childs[i] == null) {
                return false;
            } 
            curr = curr.childs[i];
        }
        return curr.eow;
    }

    private boolean wordBreakHelper(String s, int start) {
        if (start == s.length()) {
            return true;
        }
        
        if (dp[start] != null) {
            return dp[start];
        }

        for (int i = start + 1; i <= s.length(); i++) {
            String prefix = s.substring(start, i);
            if (search(prefix) && wordBreakHelper(s, i)) {
                dp[start] = true;
                return true;
            }
        }
        
        dp[start] = false;
        return false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        root = new Node();
        dp = new Boolean[s.length()];  // Initialize memoization array
        
        for (String w : wordDict) {
            insert(w);
        }

        return wordBreakHelper(s, 0);
    }
}
