package bot;

import domain.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;

import java.io.File;

public class Parsing {
    public static String  parsingSection(Message message, SendMessage sendMessage){
        int l = 1;
        try(XSSFWorkbook myExcelBook = new XSSFWorkbook(new File("./src/bot/project.xlsx"))) {
            XSSFSheet myExcelSheet = myExcelBook.getSheet("Лист1");
            if (message.getText().equals("Биографии российских знаменитостей") || message.getText().equals("1")) {
                for (int i = 1; i < myExcelSheet.getLastRowNum(); i++) {
                    Row row = myExcelSheet.getRow(i);
                    if (row.getCell(2).getStringCellValue() != null && row.getCell(2).getStringCellValue().equals(Section.BiographiesofRussiancelebrities)) {
                        String title = row.getCell(0).getStringCellValue();
                        String author = row.getCell(1).getStringCellValue();
                        sendMessage.setText(sendMessage.getText() + l + "." + title + " " + author + "\n");
                        l++;
                    }
                }
            }
        }catch (Throwable t) {
            System.out.println(t);
        }
        return sendMessage.getText();
    }
}
