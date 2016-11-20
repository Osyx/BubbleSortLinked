/**
 * Created by Oscar on 16-11-19.
 */
public class BubbleSort {

    LinkedList sort(LinkedList list) {
        int R = list.getLength() - 2;
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
