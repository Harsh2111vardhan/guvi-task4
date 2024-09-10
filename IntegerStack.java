import java.util.Stack;

public class IntegerStack {
    // Create a Stack to store integers
    private Stack<Integer> stack;

    public IntegerStack() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println(element + " pushed onto the stack.");
    }

    // Method to pop an element from the stack
    public void popElement() {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println(poppedElement + " popped from the stack.");
        } else {
            System.out.println("Stack is empty. No elements to pop.");
        }
    }

    // Method to check if the stack is empty
    public boolean isStackEmpty() {
        return stack.isEmpty();
    }

    // Method to display the stack contents
    public void displayStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements: " + stack);
        }
    }
    public static void main(String[] args) {
        IntegerStack integerStack = new IntegerStack();

        // Check if the stack is empty
        System.out.println("Is stack empty? " + integerStack.isStackEmpty());

        // Push some elements onto the stack
        integerStack.pushElement(10);
        integerStack.pushElement(20);
        integerStack.pushElement(30);

        // Display the stack
        integerStack.displayStack();

        // Pop an element from the stack
        integerStack.popElement();

        // Display the stack after popping
        integerStack.displayStack();

        // Check if the stack is empty
        System.out.println("Is stack empty? " + integerStack.isStackEmpty());
    }
}

//"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.1\lib\idea_rt.jar=50894:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "E:\Harsh\College\SEM-3\Java Projects\guvi-task3\out\production\guvi-task3" IntegerStack
//Is stack empty? true
//10 pushed onto the stack.
//20 pushed onto the stack.
//30 pushed onto the stack.
//Stack elements: [10, 20, 30]
//30 popped from the stack.
//Stack elements: [10, 20]
//Is stack empty? false
//
//Process finished with exit code 0