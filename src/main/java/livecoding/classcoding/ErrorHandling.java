package livecoding.classcoding;

public class ErrorHandling {
    public static void main(String[] args) {
        try {
            int result = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println("Error is: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
