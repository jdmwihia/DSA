 import java.util.Stack;
 
 public class StackDS {

    // method to push items into the stack
    public static void  PushToStack(Stack<String> stack, String name){
        stack.push(name);
    }

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty());

        PushToStack(stack, "Minecraft");
        PushToStack(stack, "Fifa 25");

        System.out.println(stack.empty());
        
        System.out.println(stack);
       
    }
}