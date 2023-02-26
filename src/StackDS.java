import java.util.Stack;

public class StackDS {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("NFS");
        stack.push("Asphalt");
        stack.push("GTA 5");
        stack.push("FIFA");

//        String myFavGame = stack.pop();
//        System.out.println(myFavGame);
        System.out.println(stack);
        System.out.println(stack.search("FIFA 19"));
    }
}