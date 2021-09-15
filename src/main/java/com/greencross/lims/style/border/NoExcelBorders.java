package com.greencross.lims.style.border;

import org.apache.poi.ss.usermodel.CellStyle;

public final class NoExcelBorders implements com.greencross.lims.style.border.ExcelBorders {

	@Override
	public void apply(CellStyle cellStyle) {
		// Do nothing
	}

}
