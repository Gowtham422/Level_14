package pkg_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;



public class Write_Excel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        File file = new File("D:\\PROJECT\\New folder\\Book2.xlsx");
		
		XSSFWorkbook wkbook = new XSSFWorkbook();
		XSSFSheet sheet = wkbook.createSheet("Sheet1");
		Row row;
		Cell cell;
		
		for (int i = 0; i <= 9; i++) {
			row = sheet.createRow(i);
			for (int j = 0; j <= 9; j++) {
				cell = row.createCell(j);
				cell.setCellValue((i+1) * (j+1));
			}
		}
		
		try {
			FileOutputStream excel = new FileOutputStream(file);
			wkbook.write(excel);
			excel.close();
			wkbook.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}


	}

}
