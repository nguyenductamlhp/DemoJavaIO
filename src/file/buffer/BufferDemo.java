package file.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDemo {

	public static void main(String[] args) throws IOException {
	
		BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nguyenductamlhp/demo/in.txt"));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nguyenductamlhp/demo/out.txt"));
		
		
		String string;
		while (true) {
			string = bufferedReader.readLine();
			if (string == null) {
				break;
			}
			System.out.println(string);
			bufferedWriter.write(string + "\n");
		}
		bufferedReader.close();
		bufferedWriter.close();
	}

}
