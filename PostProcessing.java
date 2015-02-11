import java.io.*;

public class PostProcessing 
{
	public static void main(String[] args)
	{
		File modifiedFile = new File("C:/Users/Aaron/Desktop/PHI 200M.txt");
		File quizFile = new File("C:/Users/Aaron/Desktop/PHI 200Q.txt");
		BufferedReader br = null;
		BufferedWriter bw = null;
		String newLine = System.getProperty("line.separator");
		
		try 
		{
			String line;
			br = new BufferedReader(new FileReader(modifiedFile));
			bw = new BufferedWriter(new FileWriter(quizFile));
			
			for (int i = 0; (line = br.readLine()) != null; i++)
			{
				if( (i % 2) != 0)
				{
					bw.write(line + newLine);
				}else
				{
					bw.write(newLine);
				}	
			}
			bw.close();		
		} catch (FileNotFoundException e) 
		{
			System.out.println("File not found: " + modifiedFile.toString());
		}catch (IOException e) {
			System.out.println("Unable to read file: " + modifiedFile.toString());
		}
	}
}
