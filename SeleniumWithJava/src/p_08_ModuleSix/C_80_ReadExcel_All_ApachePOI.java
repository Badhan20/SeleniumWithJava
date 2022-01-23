package p_08_ModuleSix;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class C_80_ReadExcel_All_ApachePOI {

	public static void main(String[] args) throws IOException{

		File src = new File("C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Test Data\\TestData1.xlsx");

		FileInputStream fs = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		
		//HSSFWorkbook -->> Will be used when file extension is .xls
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowNumber = sheet1.getLastRowNum();
		
		for(int i=0; i<rowNumber+1; i++) {
			
			String values = sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("Data from row "+ i+ " is: "+values);
		}
		
		wb.close();
		
		System.out.println("Congratulations! Test case passed.");

	}

}
