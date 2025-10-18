package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public boolean getbooleanDataFromExcel(String sheetname,int rowindex,int columnindex) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis=new FileInputStream("./src/test/resources/testdata/Testscriptdata.xlsx");
	
	Workbook wb=WorkbookFactory.create(fis);
	
	return wb.getSheet(sheetname).getRow(rowindex).getCell(columnindex).getBooleanCellValue();
	
	}	
	
	public double geetNumericDataFromExcel(String sheetname,int rowindex,int columnindex) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata/Testscriptdata.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		return wb.getSheet(sheetname).getRow(rowindex).getCell(columnindex).getNumericCellValue();
		
		}	
	
public String getStringDataFromExcel(String sheetname,int rowindex,int columnindex) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata/Testscriptdata.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		return wb.getSheet(sheetname).getRow(rowindex).getCell(columnindex).getStringCellValue();
		
		}	

public LocalDateTime getLocaldatetimrFromExcel(String sheetname,int rowindex,int columnindex) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis=new FileInputStream("./src/test/resources/testdata/Testscriptdata.xlsx");
	
	Workbook wb=WorkbookFactory.create(fis);
	
	return wb.getSheet(sheetname).getRow(rowindex).getCell(columnindex).getLocalDateTimeCellValue();
	
	}	

}
