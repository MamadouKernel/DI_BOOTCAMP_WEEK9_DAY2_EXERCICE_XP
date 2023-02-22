package exercice2;

public class TwoStacks {
    private int[] arr; // array to store elements
    private int top1; // index of the top element of stack1
    private int top2; // index of the top element of stack2
    private int n; // total size of the array

    public TwoStacks(int n) {
        this.n = n;
        this.arr = new int[n];
        this.top1 = -1;
        this.top2 = n;
    }

    // push element to stack1
    public void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // push element to stack2
    public void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // pop element from stack1
    public int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    // pop element from stack2
    public int pop2() {
        if (top2 < n) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }
}
