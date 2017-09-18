package com.boraji.tutorial.spring.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.boraji.tutorial.spring.model.Student;

public class StudentExcelView extends AbstractXlsxView {

   @Override
   protected void buildExcelDocument(Map<String, Object> model, Workbook wb, HttpServletRequest req,
         HttpServletResponse res) throws Exception {

      Student student = (Student) model.get("student");
      Sheet sheet;
      sheet = wb.createSheet("Students");

      int rowCount = 1;
      // SID
      Row row = sheet.createRow((short) rowCount++);
      Cell cell = row.createCell(0);
      cell.setCellValue("ID");
      cell = row.createCell(1);
      cell.setCellValue(Integer.toString(student.getId()));

      // Name
      row = sheet.createRow((short) rowCount++);
      cell = row.createCell(0);
      cell.setCellValue("Name");
      cell = row.createCell(1);
      cell.setCellValue(student.getName());

      // DOB
      row = sheet.createRow((short) rowCount++);
      cell = row.createCell(0);
      cell.setCellValue("DOB");
      cell = row.createCell(1);
      cell.setCellValue(student.getDob().toString());

      // Email
      row = sheet.createRow((short) rowCount++);
      cell = row.createCell(0);
      cell.setCellValue("Email");
      cell = row.createCell(1);
      cell.setCellValue(student.getDob().toString());
   }
}
