import java.util.Random;

/**
 * Created by Oscar on 16-11-19.
 */
public class BubbleSort {
    public static void main(String[] args) {
        Random rndm = new Random();
        LinkedList test = new LinkedList();
        System.out.println(test.getValueAt(1));
        for (int i = 0; i < 5; i++) {
            test.addNode(rndm.nextInt(10));
        }
        System.out.println(test.getValueAt(test.length - 1));
        System.out.println(test.toString());
        test = sort(test);
        System.out.println(test.toString());
    }

    static LinkedList sort(LinkedList list) {
        int R = list.length -2;
        LinkedList.Node temp = list.getFirst();
        boolean swapped = true;
        while(R >= 0 && swapped) {
            swapped = false;
            for (int i = 0; i < R; i++) {
                if (temp.getValue() > temp.getNext().getValue()) {
                    list.swap(temp,temp.getNext());
                }
                temp = temp.getNext();
            }
            R = R - 1;
        }
        return list;
    }



}
