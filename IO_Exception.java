import java.io.*;
public class IO_Exception {
    public static void main(String[] args) throws Exception{
        File ob = new File("/Arizeet/home");
        FileInputStream t1 = new FileInputStream(ob);
        System.out.println(t1.read());
    }
}
