package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements IConstant {
	String getData (String sheet, int row, int cell) throws EncryptedDocumentException, IOException{
	FileInputStream fis = new FileInputStream (Excel_path);
	Workbook wb = WorkbookFactory.create(fis);
	return wb.getSheet(sheet).getRow(row).getCell(cell).toString();

}
}