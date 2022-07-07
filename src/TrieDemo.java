import javax.swing.tree.TreeNode;

/**
 * Trie always contain TireNode and Trie.
 * @author jacksonchen
 */
public class TrieDemo {
    /**
     * every node should contain  postion of other 26 letter.
     */
    public class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public String word = "";
        //we could add boolean to check if there is a word or nott
        public TrieNode(){
        }
    }

    /**
     * Trie Always  has three methods, insert, search, startsWith.
     */
    public class Trie {
        /**
         * The start node.
         */
        TrieNode root;

        /**
         * Constructor initial the root node.
         */
        public Trie() {
            root = new TrieNode();
        }

        /**
         * Insert word into current trie.
         * @param word the word needs to insert
         */
        public void insert(String word) {
            TrieNode node = root;
            for(char c : word.toCharArray()) {
                //check if there is a path to the specific character
                if(root.children[c - 'a'] == null) {
                    root.children[c - 'a'] = new TrieNode();
                }
                root = root.children[c - 'a'];
            }
            //save the word into last node
            root.word = word;
        }

        /**
         * Search the word in current trie.
         * @param word the word needs to search
         * @return return true if we find the word in the trie, otherwise not
         */
        public boolean search(String word) {
            TrieNode node = root;
            for(char c : word.toCharArray()) {
                //if there is no path, which is mean we cannot find the path
                if(root.children[c - 'a'] == null) {
                    return false;
                }
                root = root.children[c - 'a'];
            }
            return root.word.equals(word);
        }

        /**
         *  Find the start with to the word.
         * @param word the word needs to check
         * @return return true if start with exist, otherwise not
         */
        public boolean startsWith(String word) {
            TrieNode node = root;
            for(char c : word.toCharArray()) {
                //if there is no path, which is mean we cannot find the path
                if(root.children[c - 'a'] == null) {
                    return false;
                }
                root = root.children[c - 'a'];
            }
            return true;
        }

    }


}
