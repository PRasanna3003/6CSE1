package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
	String getData (String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream ("./src/test/resources");
	Workbook wb = WorkbookFactory.create(fis);
	System.out.println(wb.getSheet(sheet).getRow(0).getCell(2).toString());
	return sheet;
		

	}

}
