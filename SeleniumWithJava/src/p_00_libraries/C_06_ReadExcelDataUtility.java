package p_00_libraries;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class C_06_ReadExcelDataUtility{

	XSSFWorkbook wb;
	XSSFSheet sheet1;

	//Constructor
	public C_06_ReadExcelDataUtility(String fileSource) {

		try {

			File src = new File(fileSource);

			FileInputStream fs = new FileInputStream(src);

			wb = new XSSFWorkbook(fs);
		} 


		catch (Exception e) {

			System.out.println("Exception catched during reading file is: "+e.getMessage());
		}
	}

	//Method
	public String readData(int sheetNumber, int rowNumber, int cellNumber) {

		sheet1= wb.getSheetAt(sheetNumber);

		String row = sheet1.getRow(rowNumber).getCell(cellNumber).getStringCellValue();

		return row;


	}

}
