package seldemos1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class ExcelDemo {
  @Test
  public void testExcel() throws IOException{
		  FileInputStream mk = new FileInputStream("C:\\Users\\Training_b6b.01.03\\Desktop\\Book1.xlsx");
		  XSSFWorkbook wb = new XSSFWorkbook(mk);
		  XSSFSheet sheet1 =wb.getSheetAt(0);
		  int rowCount = sheet1.getPhysicalNumberOfRows();
		  XSSFRow row1 = sheet1.getRow(0);
		  int cellcount = row1.getPhysicalNumberOfCells();
		  for(int i=0;i<rowCount;i++)
		  {
			  for(int j=0;j<cellcount;j++)
			  {
				  System.out.println(sheet1.getRow(i).getCell(j).getStringCellValue());
			  }
		  }
		  sheet1.getRow(0).createCell(2).setCellValue("Valid");
		  sheet1.getRow(1).createCell(2).setCellValue("Valid");
		  sheet1.getRow(2).createCell(2).setCellValue("InValid");
		  FileOutputStream fos = new  FileOutputStream("C:\\Users\\Training_b6b.01.03\\Desktop\\Book1.xlsx");
		  wb.write(fos);
  }
}
