import java.util.Random;

/**
 * Created by Oscar on 16-11-19.
 */
public class Driver {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        LinkedList test = new LinkedList();
        Random rndm = new Random();
        for (int i = 0; i < 10; i++) {
            test.addNode(rndm.nextInt(10));
        }
        System.out.println("Unsorted:\n" + test.toString());
        test = bubbleSort.sort(test);
        System.out.println("Sorted:\n" + test.toString());
    }
}
