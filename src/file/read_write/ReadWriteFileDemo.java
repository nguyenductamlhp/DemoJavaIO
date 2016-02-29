package file.read_write;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFileDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fin;
		FileOutputStream fout;
		try {
			fin = new FileInputStream("/home/nguyenductamlhp/demo/in.txt");
			fout = new FileOutputStream("/home/nguyenductamlhp/demo/out.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Error in read or write file");
			e.printStackTrace();
			return;
		} 
		
		int i;
		do {
			i = fin.read();
			if (i != -1) {
				System.out.println(i);
			}
			fout.write(i);
		} while (i != -1);

		fin.close();
		fout.close();
	}

}
