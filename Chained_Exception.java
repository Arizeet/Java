public class Chained_Exception {
    public static void main(String[] args) {
        try{
            NumberFormatException ex = new NumberFormatException("Exception");
            ex.initCause(new NullPointerException("Actual Exception"));
            throw ex;
        }
        catch(NumberFormatException ex){
            System.out.println(ex);
            System.out.println(ex.getCause());
        }
    }
}
