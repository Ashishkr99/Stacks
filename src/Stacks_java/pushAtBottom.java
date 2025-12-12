package Stacks_java;
import java.util.Stack;

public class pushAtBottom {
    static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(5); //bottom
        st.push(10);
        st.push(15);//top

        System.out.println(st);

        pushAtbottom(st,20);
        System.out.println(st);
    }

    private static void pushAtbottom(Stack<Integer> st, int i) {
        if(st.size()==0)
        {
            st.push(i);
            return ;
        }
        int top=st.pop();
        pushAtbottom(st,i);
        st.push(top);
    }
}
