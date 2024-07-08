package az.perfect.session5;

public class StringBuilderAndBuffer {

    public static void main(String[] args) {
        StringBuffer st=new StringBuffer("Hello ");
        st.append(" World");

        System.out.println(st.delete(2,5));
        System.out.println(st.capacity());
        System.out.println(st.charAt(2));
        st.trimToSize();

        StringBuilder sb=new StringBuilder();
        sb.append("This is a session 5.");

        System.out.println(sb.toString());
        System.out.println(sb.append(" Good session!"));

    }
}
