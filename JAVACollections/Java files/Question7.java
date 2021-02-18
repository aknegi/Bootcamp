class SpecialCollection {
    private int arr[] = new int[10];
    private int top = -1;
    private int min = 0;
    private int size = arr.length;

    // push the element at the top of the stack
    public void push(int num) {
        if (!isfull()) {
            if (top == -1 || min > num) {
                min = num;
            }
            top++;
            arr[top] = num;
        } else {
            System.out.println("sorry Special stack is full");
        }
    }

    // pops top element from the stack
    public int pop() {
        if (!isEmpty()) {
            int temp = arr[top];
            arr[top] = 0;
            top--;
            if (temp == min) {
                int i = 0;
                if (top != -1) {
                    min = arr[0];
                }
                while (i < size && arr[i] != 0) {
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                    i++;
                }
            }
            return temp;
        } else {
            System.out.println("Stack is empty");
        }
        return -1;
    }

    //checks if stack is empty or not
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    //checks if stack is full or not
    public boolean isfull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    //displays the stack
    public void displayStack() {
        if (!isEmpty()) {
            int i = 0;
            System.out.println("Displaying Special Stack");
            while (i < size && arr[i] != 0) {
                System.out.print(" " + arr[i]);
                i++;
            }
        } else {
            System.out.println("sorry Special stack is empty");
        }
        System.out.println();
    }

    // returns minimum element from the stack
    public int getMin() {
        if (!isEmpty()) {
            return min;
        } else {
            System.out.println("sorry Special stack is empty");
            return -1;
        }
    }
}


public class Question7 {
    public static void main(String[] args) {
        System.out.println("Special Stack");
        SpecialCollection stack = new SpecialCollection();
        stack.displayStack();

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(4);
        stack.push(6);
        stack.push(10);
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(1);
        stack.push(2);

        stack.displayStack();

        System.out.println("popped element is = " + stack.pop());
        System.out.println("minimum element is = " + stack.getMin());

        stack.displayStack();
    }
}
