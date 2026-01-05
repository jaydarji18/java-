//static memeber class : outer class is stack and static inner class in stackmanager which performs various operation like push,pop,display.
class stack {
    private static int max = 50;

    static class stackmanager {
        private int top;
        private int[] elements;

        stackmanager() {
            this.top = -1;
            this.elements = new int[max];
        }

        public void push(int item) {
            if (top > max - 1) {
                System.out.println("stack is overflow.");
            } else {
                elements[++top] = item;
                System.out.println(item + " is pushed");
            }
        }

        public void pop() {
            if (top == - 1) {
                System.out.println("stack is underflow.");
            } else {
                int popped = elements[top--];
                System.out.println(popped + " is popped");
            }
        }


        public void display(){
            for(int i=0 ; i<=top ; i++){
                System.out.println("Stack["+i+"]:"+elements[i]);
            }
        }
    }
}

public class StaticNestedClass {
    public static void main(String args[]) {
        stack.stackmanager sm = new stack.stackmanager();
        sm.push(10);
        sm.push(20);
        sm.push(30);
        sm.display();
        sm.pop();
        sm.pop();
        sm.display();
    }
}