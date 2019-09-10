package Test0909;

import java.util.*;

public class BinarySearchTree {
    private static class Node {
        int key;
        int value;
        Node left;
        Node right;
    }

    private static Node root = null;

    /**
     * 查找
     *
     * @param key 关键字
     * @return 找到了返回赌对应的value，如果没有找到，返回-1
     */
    public static int get(int key) {
        Node cur = root;
        while (cur != null) {
            if (key ==cur.key) {
                return cur.value;
            } else if (key < cur.key) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return -1;
    }

    /**
     * 在二叉树找到合适的位置并放入key-value
     *
     * @param key   要放入的值
     * @param value key的映射
     * @return 如果有Key返回原来的key对应的value，如果没有返回-1
     */
    public static int put(int key, int value) {
        if (root == null) {
            root=new Node();
            root.key = key;
            root.value = value;
            return -1;
        }
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if (key == cur.key) {
                int oldValue = cur.value;
                cur.value = value;
                return oldValue;
            } else if (key < cur.key) {
                parent = cur;
                cur = cur.left;
            } else {
                parent = cur;
                cur = cur.right;
            }
        }
        Node node = new Node();
        node.key = key;
        node.value = value;
        if (key < parent.key) {
            parent.left = node;
        } else {
            parent.right = node;
        }
        return -1;
    }

    /**
     * 查找
     *
     * @param key          要查找的值
     * @param defaultValue 默认返回的值
     * @return 如果有key，返回key对应的value，如果没有返回默认的defaultValue
     */
    public static int getOrDefault(int key, int defaultValue) {
        Node cur = root;
        while (cur != null) {
            if (cur.key == key) {
                return cur.value;
            } else if (key < cur.key) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return defaultValue;
    }

    /**
     * 查找key,利用层序遍历
     *
     * @return 返回所有key的不重复集合
     */
    public static Set<Integer> keySet1() {
        Set<Integer> set = new HashSet<>();
        if (root == null) {
            return set;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node front = queue.poll();
            set.add(front.key);
            if (front.left != null) {
                queue.add(front.left);
            }
            if (front.right != null) {
                queue.add(front.right);
            }
        }
        return set;
    }

    //利用中序遍历
    public static Set<Integer> keySet2() {
        Set<Integer> set = new HashSet<>();
        if (root == null) {
            return set;
        }
        inorderTraver(set, root);
        return set;
    }

    private static void inorderTraver(Set<Integer> set, Node root) {
        if (root != null) {
            inorderTraver(set, root.left);
            set.add(root.value);
            inorderTraver(set, root.right);
        }
    }

    /**
     * 查找value，利用层序遍历
     *
     * @return 返回所有的value的可重复集合
     */
    public static Set<Integer> valueSet() {
        Set<Integer> set = new HashSet<>();
        if (root == null) {
            return set;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node front = queue.poll();
            set.add(front.value);
            if (front.left != null) {
                queue.add(front.left);
            }
            if (front.right != null) {
                queue.add(front.right);
            }
        }
        return set;
    }

    /**
     * 删除key
     *
     * @param key 要删除的值
     * @return 如果key存在，返回其value
     * 如果key不存在，返回-1
     */
    public static int remove(int key) {
        Node parent = null;
        Node cur = root;
        while (cur != null) {
            if (cur.key == key) {
                //要删除key
                int oldValue = cur.value;
                deleteNode(parent, cur);
                return oldValue;
            } else if (key < cur.key) {
                parent = cur;
                cur = cur.left;
            } else {
                parent = cur;
                cur = cur.right;
            }
        }
        return -1;
    }

    private static void deleteNode(Node parent, Node cur) {
        if (cur.left == null) {
            if (cur == root) {
                root = cur.right;
            }
            if (cur == parent.left) {
                parent.left = cur.right;
            }
            if (cur == parent.right) {
                parent.right = cur.right;
            }
        }
        if (cur.right == null) {
            if (root == root) {
                root = cur.left;
            }
            if (cur == parent.left) {
                parent.left = cur.left;
            }
            if (cur == parent.right) {
                parent.right = cur.left;
            }
        }
        if (cur.left != null && cur.right != null) {
            Node goat = cur.left;
            Node goatParent = cur;
            while (goat.right != null) {
                goatParent = goat;
                goat = goat.right;
            }
            //goat是比cur的值小的中的最大的一个
            cur.key = goat.key;
            cur.value = goat.value;
            if (goat == goatParent.left) {
                goatParent.left = goat.left;
            } else {
                goatParent.right = goat.left;
            }
        }
    }


    //键值对class
    public static class Entry {
        private int key;
        private int value;

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }
    }

    //返回所有的键值对
    //public Set<Map.Entry<Integer,Integer>> entrySet()
    public Set<Entry> entrySet() {
        Set<Entry> set = new HashSet<>();
        if (root == null) {
            return set;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        if (!queue.isEmpty()) {
            Node front = queue.poll();
            Entry entry = new Entry();
            entry.key = front.key;
            entry.value = front.value;
            set.add(entry);
            if (front.left != null) {
                queue.add(front.left);
            }
            if (front.right != null) {
                queue.add(front.right);
            }
        }
        return set;
    }

    public static Set<Entry> entrySet2() {
        Set<Entry> set = new HashSet<>();
        if (root == null) {
            return set;
        }
        inorderTraverEntry(set, root);
        return set;
    }

    private static void inorderTraverEntry(Set<Entry> set, Node root) {
        if (root != null) {
            inorderTraverEntry(set, root.left);
            Entry entry = new Entry();
            entry.key = root.key;
            entry.value = root.value;
            set.add(entry);
            inorderTraverEntry(set, root.right);
        }
    }

    /**
     * 通过搜索树的规则确定，平衡树的情况是O(log(n))
     * 判断是否包含key
     *
     * @param key 要找的值
     * @return 如果包含，返回true，否则返回false
     */
    public static boolean containsKey(int key) {
        if (root == null) {
            return false;
        }
        Node cur = root;
        while (cur != null) {
            if (key == cur.key) {
                return true;
            } else if (key < cur.key) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return false;
    }

    /**
     * 通过遍历的方法确定，时间复杂度为O(n)
     * 判断是否包含value
     *
     * @param value 要找的值
     * @return 如果包含，返回true，否则返回false
     */
    public static boolean containsValue(int value) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node front = queue.poll();
            if (front.value == value) {
                return true;
            } else if (front.left != null) {
                queue.add(front.left);
            } else if (front.right != null) {
                queue.add(front.right);
            }
        }
        return false;
    }

    private static void inorderPrint(Node root) {
        if(root!=null){
            inorderPrint(root.left);
            System.out.println(root.key);
            inorderPrint(root.right);
        }
    }
    private static void preorderPrint(Node root){
        if(root!=null){
            System.out.println(root.key);
            preorderPrint(root.left);
            preorderPrint(root.right);
        }
    }

    public static void main(String[] args) {
        int [] keys={6,7,4,2,1,5,9,3,8};
        for(int key:keys){
            put(key,key+100);
        }
        preorderPrint(root);
        System.out.println("============================");
        inorderPrint(root);
        System.out.println("============================");
        System.out.println(get(8));
        System.out.println(get(13));
        System.out.println(getOrDefault(13,113));
        System.out.println(keySet1());
    }











}

