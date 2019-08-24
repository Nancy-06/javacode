package Test0824;

public class Node {
    char value;
    Node left=null;
    Node right=null;
    Node(char value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
