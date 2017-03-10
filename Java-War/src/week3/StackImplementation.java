package week3;

public class StackImplementation {

	public static void main(String[] args) 
	{
		    LinkedStack st = new LinkedStack();
		    st.push(3);
		    st.push(0);
		    st.push(0);
		    st.push(6);
		    st.displayStack();
		    st.pop();
		    st.displayStack();

	}
}
