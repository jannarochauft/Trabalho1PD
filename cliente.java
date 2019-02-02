import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
public class cliente {
	public static void main(String[] args) throws Exception {
		Scanner tc = new Scanner(System.in);
		System.out.println("File:");
		String fName = tc.nextLine();
		File f = new File("D:Dados/Documentos/GitHub/Trabalho1PD/Download.txt/"+fName);
		FileInputStream in = new FileInputStream(f);
		Socket socket = new Socket("127.0.0.1", 12345);
		OutputStream out = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter writer = new BufferedWriter(osw);
		writer.write(f.getName()+"\n");
		writer.flush();
		 int c;
		 while ((c = in.read()) != -1) {
		 System.out.println(c);
		 out.write(c);
		 }
	}
}