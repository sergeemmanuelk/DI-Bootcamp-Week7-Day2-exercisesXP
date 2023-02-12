public class Main {
    public static void main(String[] args) {

        //Le code imprimera "Catch" et "Finally" sur la console, puis lancera une NumberFormatException.

        try{
            throw new ArithmeticException();
        }catch(Exception e){
            System.out.println("Catch");
            throw new NullPointerException();
        }finally{
            System.out.println("Finally");
            throw new NumberFormatException();
        }
    }
}