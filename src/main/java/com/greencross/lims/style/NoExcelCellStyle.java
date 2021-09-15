package com.greencross.lims.style;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;

public class NoExcelCellStyle implements ExcelCellStyle {

	@Override
	public void apply(CellStyle cellStyle, Workbook wb) {
		// Do nothing
	}

}
