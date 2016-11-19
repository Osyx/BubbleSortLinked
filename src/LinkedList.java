/**
 * Created by Oscar on 16-11-19.
 */
public class LinkedList {
    private Node first;
    public int length = 0;

    LinkedList() {
    }

    void addFirst(int value) {
        this.first = new Node(value);
        length = 1;
    }

    Node getFirst() {
        return first;
    }

    void addNode(int value) {
        if (first == null)
            addFirst(value);
        else {
            Node temp = first;
            while (temp.getNext() != null)
                temp = temp.getNext();

            temp.next = new Node(value);
            length++;
        }
    }

    int getValue(Node node) {
        return node.getValue();
    }

    int getValueAt(int position) {
        if (position > length)
            return -1;
        Node temp = first;
        for (int i = 0; i < position; i++) {
            temp = temp.getNext();
        }
        return getValue(temp);
    }

    void swap(Node node1, Node node2) {
        int temp = node1.getValue();
        node1.setValue(node2.getValue());
        node2.setValue(temp);
    }

    @Override
    public String toString() {
        String result = "";
        Node current = first;
        while(current.getNext() != null){
            result += current.getValue() + " -> ";
            current = current.getNext();
        }
        result += current.getValue();

        return result;
    }

    class Node {
        private int value = 0;
        private Node next;

        Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }


        public Node getNext() {
            return next;
        }
    }
}
