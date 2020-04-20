package pkg_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class File_Copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file1 = new File("D:\\PROJECT\\file1.txt");
		File file2 = new File("D:\\PROJECT\\file2.txt");
		File dir = new File("D:\\PROJECT\\New folder");
		File file3 = new File("D:\\PROJECT\\file3.txt");
		
		FileUtils.copyFile(file1, file2);
		FileUtils.copyFileToDirectory(file1, dir);
		FileUtils.moveFile(file1, file3);



	}

}
