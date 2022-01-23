package p_08_ModuleSix;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class C_79_ReadExcel_Single_ApachePOI {

	public static void main(String[] args) throws IOException{

		File src = new File("C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Test Data\\TestData1.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//HSSFWorkbook -->> Will be used when file extension is .xls

		XSSFSheet sheet1 = wb.getSheetAt(0);

		String row = sheet1.getRow(0).getCell(0).getStringCellValue();

		System.out.println("Row value is: "+row);

		String column = sheet1.getRow(0).getCell(1).getStringCellValue();

		System.out.println("Column value is: "+column);

		wb.close();

		System.out.println("Congratulations! Test case passed.");

	}

}
