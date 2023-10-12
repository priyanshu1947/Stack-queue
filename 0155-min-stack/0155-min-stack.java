import java.util.Stack;

class MinStack {
    Stack<Long> st = new Stack<>();
    long mini;

    public MinStack() {
        mini = Long.MAX_VALUE;
    }

    public void push(int val) {
        long value = val;
        if (st.isEmpty()) {
            mini = value;
            st.push(value);
        } else {
            if (value < mini) {
                st.push(2L * value - mini);
                mini = value;
            } else {
                st.push(value);
            }
        }
    }

    public void pop() {
        if (st.isEmpty())
            return;
        long el = st.pop();
        if (el < mini) {
            mini = 2L * mini - el;
        }
    }

    public int top() {
        if (st.isEmpty())
            return -1;

        long el = st.peek();
        if (el < mini) {
            return (int) mini;
        } else {
            return (int) el;
        }
    }

    public int getMin() {
        return (int) mini;
    }
}
