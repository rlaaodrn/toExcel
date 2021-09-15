package com.greencross.lims.style.font;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;

public final class NoExcelFont implements com.greencross.lims.style.font.ExcelFont {
	@Override
	public void apply(CellStyle cellStyle, Workbook wb) {
		// Do nothing
	}
}
