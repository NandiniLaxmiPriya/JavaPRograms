package javaio;
import java.io.File;
import java.util.Scanner;
public class FileInfo {

	public static void getInfo(String path)
	{
		File file = new File(path);
		if(file.exists())
		{
			System.out.printf("%s\n",file.getName());
			System.out.printf("%s\n",file.isFile()?"a file":"Not a file");
			System.out.printf("%s\n",file.isDirectory()?"directory":"Not a directory");
			System.out.printf("%s\n",file.isAbsolute()?"Absolute":"Not absolute");
			System.out.printf("%s\n",file.getPath());
			System.out.printf("%s\n",file.getAbsolutePath());
			System.out.printf("%s\n",file.length());
			System.out.printf("%s\n",file.lastModified());
			System.out.printf("%s\n",file.getParent());
			if(file.isDirectory())
			{
				String dir[] = file.list();
				for(String d: dir)
				{
					System.out.println(d);
				}
			}
		}else {
			System.out.println("Check the path");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter file path");
		Scanner sc = new Scanner(System.in);
		getInfo(sc.nextLine());
	}

}
