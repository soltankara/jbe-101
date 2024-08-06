package Session13;
public class Exceptions {
    public static void main(String[] args) {
        //1
        try {
            int result = divideNumber(12, 0);
            System.out.println("Result:" + result);
        } catch (ArithmeticException ex) {
            System.out.println("Exception:" + ex.getClass().getName() + ex.getMessage());
        } finally {
            System.out.println("The try catch is finished");
        }
        //2
        try {
            int[] numbers = {22, 33, 44, 55};
            System.out.println(numbers[5]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException ex) {
            System.out.println("Exception: " + ex.getClass().getName() + ex.getMessage());
        } finally {
            System.out.println("The try catch is finished");
        }
        //3
        try {
            String a = null;
            System.out.println(a.toString());
        } catch (ArithmeticException ex) {
            System.out.println("Exception:" + ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Exception:" + ex.getClass().getName() + ex.getMessage());
        } finally {
            System.out.println("The try catch is finished");
        }
        //4
        try {
            String a = null;
            System.out.println(a.length());
        } catch (NullPointerException ex) {
            System.out.println("Exception:" + ex.getClass().getName() + ex.getMessage());
        } finally {
            System.out.println("The try catch is finished");
        }
        //5
        try {
            String t = "abcdef";
            System.out.println(t.charAt(7));
        }catch(StringIndexOutOfBoundsException ex){
            System.out.println("Oops something went wrong");
        }finally {
            System.out.println("The try catch is finished");
        }
        //6
        String [] texts={"one","two","three"};
        try{
            System.out.println(texts[3]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.toString());
        }finally {
            System.out.println("The process is done");
        }
    }
    public static int divideNumber(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide the given number by zero!");
        }
        return dividend / divisor;
    }
}



