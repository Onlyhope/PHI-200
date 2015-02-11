import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PopQuizFormatting 
{
	public static void main(String[] args) 
	{
		File file = new File("C:/Users/Aaron/Desktop/PHI 200.txt");
		File modifiedFile = new File("C:/Users/Aaron/Desktop/PHI 200M.txt");
		BufferedReader br = null;
		BufferedWriter bw = null;
		StringBuilder sb = new StringBuilder("");
		String passage;
		String newLine = System.getProperty("line.separator");

		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(new FileWriter(modifiedFile));

			String line;

			while ((line = br.readLine()) != null) 
			{
				if (line.contains("Selected Answer"))
				{
					bw.write(newLine);
				}

				if (line.contains("Question")
						|| line.contains("Selected Answer")
						|| line.contains("points")) 
				{

				} else {
					bw.write(line);
				}

				if (line.contains("points")) {
					bw.write(newLine);
				}
			}
			
			BufferedReader br2 = new BufferedReader(new FileReader(modifiedFile));
			for (int i = 0; (line = br2.readLine()) != null; i++)
			{
				bw.write(newLine);
			}
			bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}
	}

}
