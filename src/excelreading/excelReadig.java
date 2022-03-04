package excelreading;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class excelReadig {

	@Test(priority=1)
	public void f1() throws BiffException, IOException{
		Workbook  book=  Workbook.getWorkbook(new File("D:\\Book1.xls"));
		Sheet sheet = book.getSheet(0);
		System.out.println(sheet.getCell(1,0).getContents());
	}
	@Test(priority=0)
	public void f2() throws BiffException, IOException{
		Workbook  book=  Workbook.getWorkbook(new File("D:\\Book1.xls"));
		Sheet sheet = book.getSheet(0);
		
		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				System.out.println(sheet.getCell(j,i).getContents());		
			}
		}
		
	}
}
