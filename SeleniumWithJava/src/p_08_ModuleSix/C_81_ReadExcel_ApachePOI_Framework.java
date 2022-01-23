package p_08_ModuleSix;

import java.io.IOException;

import p_00_libraries.C_06_ReadExcelDataUtility;

public class C_81_ReadExcel_ApachePOI_Framework {

	public static void main(String[] args) throws IOException{

		C_06_ReadExcelDataUtility obj = new C_06_ReadExcelDataUtility("C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Test Data\\TestData2.xlsx");
		
		System.out.println("Value is: "+obj.readData(0, 0, 1));
		
		
		System.out.println("Congratulations! Test case passed.");

	}

}
