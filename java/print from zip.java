// Java program to read and print all files
// from a zip file

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class printzip {


	public void printFileContent(String filePath)
	{

		FileInputStream fs = null;
		ZipInputStream Zs = null;
		ZipEntry ze = null;

		try {

			System.out.println(
				"Files in the zip are as follows: ");

			fs = new FileInputStream(filePath);
			Zs = new ZipInputStream(
				new BufferedInputStream(fs));
                
			while ((ze = Zs.getNextEntry()) != null) {
				System.out.println(ze.getName());
			}

			Zs.close();
		}
		catch (FileNotFoundException fe) {
			fe.printStackTrace();
		}
		catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		GFG zf = new GFG();
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter the location of the zip file: ");
		String str = sc.nextLine();
		zf.printFileContent(str);
	}
}
