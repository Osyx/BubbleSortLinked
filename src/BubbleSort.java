import java.util.Random;

/**
 * Created by Oscar on 16-11-19.
 */
public class BubbleSort {
    public static void main(String[] args) {
        Random rndm = new Random();
        LinkedList test = new LinkedList();
        for (int i = 0; i < 10; i++) {
            test.addNode(rndm.nextInt(10));
        }
        System.out.println(test.toString());
        test = sort(test);
        System.out.println(test.toString());

        LinkedList testComp = new LinkedList();

        testComp.addNode(1);
        testComp.addNode(2);
        testComp.addNode(3);

        LinkedList.Node previous = testComp.getFirst();
        LinkedList.Node current = testComp.getFirst().getNext();
        LinkedList.Node next = testComp.getFirst().getNext().getNext();

        System.out.println(testComp.toString());
        testComp.swapComp(previous, current, next);
        System.out.println(testComp.toString());

    }

    static LinkedList sort(LinkedList list) {
        int R = list.length - 2;
        boolean swapped = true;
        while(R >= 0 && swapped) {
            LinkedList.Node temp = list.getFirst();
            swapped = false;
            for (int i = 0; i <= R; i++) {
                if (temp.getValue() > temp.getNext().getValue()) {
                    list.swap(temp,temp.getNext());
                    swapped = true;
                }
                temp = temp.getNext();
            }
            R = R - 1;
        }
        return list;
    }



}
