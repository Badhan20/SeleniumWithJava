package p_08_ModuleSix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class C_82_WiteDataOnExcel_ApachePOI {

	public static void main(String[] args) throws IOException{

		File src = new File("C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Test Data\\TestData1.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//HSSFWorkbook -->> Will be used when file extension is .xls

		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("Designation");
		
		sheet1.getRow(1).createCell(2).setCellValue("PMO");
		
		sheet1.getRow(2).createCell(2).setCellValue("CTO");
		
		FileOutputStream target = new FileOutputStream(src);
		
		wb.write(target);
		
		wb.close();

		System.out.println("Congratulations! Test case passed.");

	}

}
