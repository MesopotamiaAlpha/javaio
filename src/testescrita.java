import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileOutputStream;

public class testescrita {
    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("src/testewriter.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Hello World!");
        bw.newLine();
        bw.newLine();
        bw.write("Teste de texto");

        bw.close();
    }
}



