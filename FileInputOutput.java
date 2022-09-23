package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileInputOutput {
	static PrintWriter pw = new PrintWriter(fileWriterCreator());

	public static File fileData() throws FileNotFoundException {
		File f = new File("db.txt");
		return f;
	}

	public static void addFileEntry(String item) {
		pw.println(item);
	}

	public static void closeFileAttach() {
		pw.close();
	}

	public static FileWriter fileWriterCreator() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileData(), true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fw;
	}
}
