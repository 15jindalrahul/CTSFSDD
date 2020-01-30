package inputandoutput;

import java.io.*;
import java.util.*;

public class BufferedReaderWriter {

	public static void main(String[] args) throws Exception {
		BufferedReader br;
		BufferedWriter bw;

		br = new BufferedReader(new FileReader("abc.txt"));
		bw = new BufferedWriter(new FileWriter("def.txt"));
		String line = br.readLine();

		int data;
		while (line != null) {
			for (int i = 0; i < line.length(); i++) {
				data = (int) line.charAt(i);
				bw.write(data);
			}
			bw.write((int) '\n');
			line = br.readLine();
		}
		br.close();
		bw.close();
	}

}
