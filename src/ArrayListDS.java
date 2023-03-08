public class ArrayListDS {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.insert(0, "X");

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.size);
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray.capacity);

    }
}
