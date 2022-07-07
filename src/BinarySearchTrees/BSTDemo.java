package BinarySearchTrees;

public class BSTDemo {

    /**
     * Binary Search Tree always has get key
     */
    static class BST {
        static class TreeNode {
            public int val;
            public TreeNode left;
            public TreeNode right;
            public TreeNode(int val) {
                this.val = val;
            }
            public TreeNode() {

            }
        }

        public TreeNode root;
        public BST(){
            root = null;
        }
        public BST(int value){
            root = new TreeNode(value);
        }

        public TreeNode get(int key) {
            TreeNode node = root;
            return getHelper(key, node);

        }
        private TreeNode getHelper(int key, TreeNode curr) {
            if(curr == null || curr.val == key) {
                return curr;
            }
            if(key < curr.val) {
                return getHelper(key, curr.left);
            } else {
                return getHelper(key,curr.right);
            }
        }
        public void insert(int key) {

            root = insertHelper(key, root);

        }
        public TreeNode insertHelper(int key, TreeNode curr) {
            //base case if there is null we could make new one
            if(curr == null) {
                curr = new TreeNode(key);
                return curr;
            };
            if(key < curr.val) {
                curr.left =  insertHelper(key, curr.left);
            } else if (key > curr.val) {
                curr.right = insertHelper(key, curr.right);
            } else {
                return null;
            }
            return root;

        }

        /*
        Three situation of delete
        1. delete the leaf
        2. node to be deleted only has one child
        3. node tobe deleted has two child
         */
        public void deleteKey(int key) {
            root = deleteKeyHelper(root, key);
        }
        public TreeNode deleteKeyHelper(TreeNode curr, int key) {
            //base case if do not find the value
            if (curr == null) {
                return curr;
            }
            //recursion down to the tree
            if(key < curr.val) {
                curr.left =  deleteKeyHelper(curr.left, key);
            } else if (key > curr.val) {
                curr.right = deleteKeyHelper(curr.right, key);
            } else {
//                if we find the node that we need
                if (curr.left == null) {
                    return curr.right;
                } else if (curr.right == null) {
                    return curr.left;
                }
                curr.val = maxValue(curr.left);
                curr.left = deleteKeyHelper(curr.left, curr.val);
            }
            return curr;
        }
        private int maxValue(TreeNode node) {

            int max = node.val;
            while(node.right != null) {
                max = node.right.val;
                node = node.right;
            }
            return max;
        }

        void inorder() { inorderRec(root); }

        // A utility function to do inorder traversal of BST
        private void inorderRec(TreeNode root)
        {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.val + " ");
                inorderRec(root.right);
            }
        }


    }

    public static void main(String[] args) {
        BST tree = new BST(12);
        tree.insert(121);
        tree.insert(1);
        tree.deleteKey(121);



        tree.inorder();
//        System.out.println(tree.root.right.val);

    }
}
