package az.perfect.truing.session5;

public class StringBufferAndBuilder {

    public static void main(String[] args) {


        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("World");
        System.out.println(sb.toString());
        System.out.println(sb.capacity());

        StringBuilder st=new StringBuilder("This ");
        sb.append("is a session 5.");

        System.out.println(sb.toString());

    }
}