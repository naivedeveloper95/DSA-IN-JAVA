public class ArrayListDS {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

//        dynamicArray.insert(0, "X");
//        System.out.println(dynamicArray);
//        dynamicArray.delete("A");

        dynamicArray.delete("A");
        dynamicArray.delete("C");
        dynamicArray.delete("E");

//        System.out.println(dynamicArray.size);
//        System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.size);
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray.capacity);

    }
}
