package Unit_03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class P15_FileHandling_In_Java_Task_01 {

	public static void main(String[] args) {
		Input_File obj=new Input_File();
		System.out.println(obj.input_from_file());
		

	}

}

class Input_File
{
	int input_from_file(){
		int count =0;
		String path = "C:\\Users\\Anusha\\git\\JavaLearn\\LearningJava\\src\\Unit_03\\input.txt";
		File file = new File(path);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			int ch=br.read();
			if(ch==-1)
				return count;
			else
			{	
				while(ch!=-1)
				{
						if((char)ch==' '||(char)ch=='\n')
							count++;
						ch=br.read();
				}
			}
		}
		catch(Exception e){
			e.getMessage();
		}
		
		return count+1;
	}
}
