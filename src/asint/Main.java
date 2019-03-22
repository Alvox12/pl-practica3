package asint;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
public class Main{
   public static void main(String[] args) throws Exception {
	  Reader input = new InputStreamReader(new FileInputStream("input.txt"));
      AnalizadorSintactico asint = new AnalizadorSintactico(input);
	  asint.Sp();
   }
}