package ds_algo_ProjectPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class signInExcelPage 
{
	
	@DataProvider(name="Signin Data")
	public String[][] excelRead() throws IOException 
	{
		String path="C:/Users/arvin/eclipse-workspace/ds_algoProject/src/test/resources/Exce/SignInData.xlsx";
		File excelSign = new File(path);
		FileInputStream fin = new FileInputStream(excelSign);
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = workbook.getSheet("Signin");
		
		//Iterator <Row> row=sheet.rowIterator();
		int rowNo=sheet.getLastRowNum();
		int colNo=sheet.getRow(1).getLastCellNum();
		String signin[][]=new String[rowNo][colNo];
		
//		while(row.hasNext())
//		{
//			Row currentRow= row.next();
//			Iterator <Cell> cell= currentRow.cellIterator();
//			while(cell.hasNext())
//			{
//				Cell currentCell=cell.next();
//				//System.out.println(currentCell.getStringCellValue());
//				return currentCell.getStringCellValue();
//			}
//		}
		
		for(int i=1;i<=rowNo;i++)
		{
			for(int j=0;j<colNo;j++)
			{
				//signin[i-1][j] = getCellValue(i,j);
				
			}
		}
		
		workbook.close();
		return signin;
	}
	

}
