package file.read_write;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String args[]) throws IOException {
		FileReader fr = new FileReader("/home/nguyenductamlhp/demo/in.txt");
		FileWriter fw = new FileWriter("/home/nguyenductamlhp/demo/out.txt");
		
		while (true) {
			int i = fr.read();
			if (i == -1) {
				break;
			}
			fw.write(i);
		}
		fr.close();
		fw.close();
	}

}
