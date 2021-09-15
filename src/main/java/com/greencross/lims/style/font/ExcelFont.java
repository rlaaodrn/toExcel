package com.greencross.lims.style.font;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;

public interface ExcelFont {
	void apply(CellStyle cellStyle, Workbook wb);
}
