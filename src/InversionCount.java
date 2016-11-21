/**
 * Created by Oscar on 16-11-21.
 */
public class InversionCount {
    private int[] aux;
    public int counter = 0;

    public int sort(LinkedList list) {
        aux = new int[list.getLength()];
        int[] arr = new int[list.getLength()];
        LinkedList.Node temp = list.getFirst();

        for (int i = 0; i < list.getLength(); i++) {
            arr[i] = temp.getValue();
            temp = temp.getNext();
        }

        return sort(arr, 0, arr.length - 1);
    }
    private int sort(int[] list, int lo, int hi) {
        if (hi <= lo) return 0;
        int mid = lo + (hi - lo)/2;
        sort(list, lo, mid);
        sort(list, mid+1, hi);
        return merge(list, lo, mid, hi);
    }

    public int merge(int[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++)
            aux[k] = a[k];
        for (int k = lo; k <= hi; k++)
            if (i > mid) {
            }
            else
                if (j > hi ) {
                    a[k] = aux[i++];
                }
                else
                    if (aux[j] < aux[i]) {
                        a[k] = aux[j++];
                    }
                    else {
                        a[k] = aux[i++];
                    }
        return 0;
    }
}
