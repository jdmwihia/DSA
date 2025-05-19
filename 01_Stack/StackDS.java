 import java.util.Stack;
 
 public class StackDS {

    // method to push items into the stack
    public static void  PushToStack(Stack<String> stack, String name){
      stack.push(name);
    }

    //Method to pop top item from stack
    public static String  PopFromStack(Stack<String> stack ){
      return stack.pop();
    }

    //method to peek into stack 
    public static String  PeekIntoStack(Stack<String> stack ){
      return stack.peek();
    }

    //method to search for items in a stack
    public static int SearchStack(Stack<String> stack, String name){
      return stack.search(name);
    }


    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        //pushes items into the stack, LIFO (Skyrim)
        PushToStack(stack, "Minecraft");
        PushToStack(stack, "Fifa 25");
        PushToStack(stack, "Doom");
        PushToStack(stack, "Fortnite");
        PushToStack(stack, "Skyrim");

        System.out.println(stack);

        //Returns true if stack is empty, false otherwise
        System.out.println(stack.isEmpty());

        //returns position of an item in a stack (starts from 1)
        for (String name : stack){
          System.out.println(name + " is position no: " + SearchStack(stack, name));
        }
        //searching for an item not within the stack returns -1

        //returns index
        for (int i = stack.size() - 1; i >= 0; i--){
         System.out.println(stack.get(i) + " is index no: " + i);
        }
        
        //returns top most item in stack, removes it from the stack
        System.out.println(PopFromStack(stack));
        System.out.println(stack);
        
        //returns top most item in stack, does not remove it from the stack
        System.out.println(PeekIntoStack(stack));
        System.out.println(stack);       
    }
}