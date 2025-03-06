package com.terex.dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderWithExcel {

	@DataProvider(name = "excelData")
	public static Object[] getData() throws IOException {
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/Test Data/Driver_Data (5).xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		Object[] data = new Object[lastRowNum];
		Map<String, String> map;

		for (int i = 1; i <= lastRowNum; i++) {
			map = new HashMap<>();
			for (int j = 0; j < lastCellNum; j++) {
				String key = sheet.getRow(0).getCell(j).getStringCellValue();
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				map.put(key, value);
				data[i - 1] = map;

			}

		}

		return data;

	}

}

