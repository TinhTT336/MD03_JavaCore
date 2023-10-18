package ra.baitap.trienkhaiqueue;

public class Node {
    private int data;
    private Node link;

    public Node() {
    }

    public int getData() {
        return data;
    }

    public Node getLink() {
        return link;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}
