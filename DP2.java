package wrappers;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP2 {

	@DataProvider(name="getData")
	public static Object[][] getData() throws IOException{
		
		Object[][] testData;
		
		/*testData[0][0]="nupur";
		testData[0][1]="mona";
		testData[0][2]="mona";
		
		testData[1][0]="teja";
		testData[1][1]="Rachit";
		testData[1][2]="Rachit";*/

		FileInputStream fis=new FileInputStream("./testData/testData.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=	wb.getSheetAt(0);
		
		int rowCount=sheet.getLastRowNum();
		
		int columnCount=sheet.getRow(0).getLastCellNum();
		
		testData=new Object[rowCount][columnCount];
	
		for (int i=1;i<rowCount+1;i++){
			XSSFRow row=sheet.getRow(i);
			for (int j=0;j<columnCount;j++){
				String cellData=	row.getCell(j).getStringCellValue();				
				testData[i-1][j]=cellData;
			}
		}
		return testData;		
	}
}
