package lambdasinaction.chap3;

import java.io.*;
import java.net.URL;

public class ExecuteAround {

	public static void main(String ...args) throws IOException{

        // method we want to refactor to make more flexible
        String result = processFileLimited();
        System.out.println(result);

        System.out.println("---");

		String oneLine = processFile((BufferedReader b) -> b.readLine());
		System.out.println(oneLine);

		String twoLines = processFile((BufferedReader b) -> b.readLine() + b.readLine());
		System.out.println(twoLines);

	}

    public static String processFileLimited() throws IOException {
		URL url = ExecuteAround.class.getResource("data.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(url.getFile()))) {
            return br.readLine();
        }
    }


	public static String processFile(BufferedReaderProcessor p) throws IOException {
        URL url = ExecuteAround.class.getResource("data.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(url.getFile()))){
			return p.process(br);
		}

	}

	public interface BufferedReaderProcessor{
		public String process(BufferedReader b) throws IOException;

	}
}
