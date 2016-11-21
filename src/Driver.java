import java.util.Random;

/**
 * Created by Oscar on 16-11-19.
 */
public class Driver {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        LinkedList test = new LinkedList();
        InversionCount count = new InversionCount();
        Random rndm = new Random();
        for (int i = 0; i < 10; i++) {
            test.addNode(rndm.nextInt(10));
        }
        System.out.println(test.toString());
        //test = bubbleSort.sort(test);
        System.out.println(test.toString());
        System.out.println("counter: " + CountingInversions.sort(test));
        System.out.println(bubbleSort.sort(test));

        LinkedList test2 = new LinkedList();
        test2.addNode(1);
        test2.addNode(2);
        test2.addNode(4);
        test2.addNode(3);
        test2.addNode(5);
        test2.addNode(0);
        System.out.println(count.sort(test));
        System.out.println("counter: " + CountingInversions.sort(test2));
    }
}
