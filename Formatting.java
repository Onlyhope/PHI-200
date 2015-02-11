import java.io.*;

public class Formatting 
{
	public static void main(String[] args)
	{
		File file = new File("C:/Users/Aaron/Desktop/PHI 200.txt");
		File modifiedFile = new File("C:/Users/Aaron/Desktop/PHI 200M.txt");
		BufferedReader br = null;
		BufferedWriter bw = null;
		String newLine = System.getProperty("line.separator");
		
		try
		{
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(new FileWriter(modifiedFile));
			
			String line;
			
			while( (line = br.readLine() ) != null )
			{
				if (line.contains("points"))
				{
						bw.write(newLine);
				}else if (line.contains("Selected Answer"))
				{
					bw.write(newLine);
				}else if (line.contains("Question"))
				{
					bw.write(newLine);
				}
				
				if (line.contains("Question") || 
						line.contains("Selected Answer"))
				{
					
				}else
				{
					bw.write(line);
				}
				
				if (line.contains("points"))
				{
					bw.write(newLine);
				}
			}
			bw.close();
		}catch(FileNotFoundException e)
		{
			System.out.println("File not found: " + file.toString());
		}catch (IOException e)
		{
			System.out.println("Unable to read file: " + file.toString());
		}
	}
}
