import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVArrayList {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long lapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }
        // For Linked List

        startTime = System.nanoTime();

//        linkedList.get(0);
//        linkedList.get(500000);
//        linkedList.get(999999);
//        linkedList.remove(0);
//        linkedList.remove(500000);
        linkedList.remove(999999);

        endTime = System.nanoTime();

        lapsedTime = endTime - startTime;

        System.out.println("Linked List :\t" + lapsedTime + "ns");

        // For ArrayList

        startTime = System.nanoTime();

//        arrayList.get(0);
//        arrayList.get(500000);
//        arrayList.get(999999);
//        arrayList.remove(0);
//        arrayList.remove(500000);
        arrayList.remove(999999);

        endTime = System.nanoTime();

        lapsedTime = endTime - startTime;

        System.out.println("Array List :\t" + lapsedTime + "ns");
    }
}
