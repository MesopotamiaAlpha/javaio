import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;

public class testecopiararquivo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/teste.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        //
        OutputStream fos = new FileOutputStream("src/testewriter.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}
