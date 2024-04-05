package practical;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class extenreports {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("path");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet =workBook.getSheetAt(0);
		
		int totalrow = sheet.getLastRowNum();
		int totalcolumn =sheet.getRow(0).getLastCellNum();
		
		
	
		

	}

}
