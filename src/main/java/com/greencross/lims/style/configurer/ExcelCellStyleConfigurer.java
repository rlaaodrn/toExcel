package com.greencross.lims.style.configurer;

import com.greencross.lims.style.align.ExcelAlign;
import com.greencross.lims.style.align.NoExcelAlign;
import com.greencross.lims.style.border.ExcelBorders;
import com.greencross.lims.style.border.NoExcelBorders;
import com.greencross.lims.style.color.DefaultExcelColor;
import com.greencross.lims.style.color.ExcelColor;
import com.greencross.lims.style.color.NoExcelColor;
import com.greencross.lims.style.font.ExcelFont;
import com.greencross.lims.style.font.NoExcelFont;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelCellStyleConfigurer {

	private ExcelAlign excelAlign = new NoExcelAlign();
	private ExcelColor foregroundColor = new NoExcelColor();
	private ExcelBorders excelBorders = new NoExcelBorders();
	private ExcelFont excelFont = new NoExcelFont();

	public ExcelCellStyleConfigurer() {

	}

	public ExcelCellStyleConfigurer excelAlign(ExcelAlign excelAlign) {
		this.excelAlign = excelAlign;
		return this;
	}

	public ExcelCellStyleConfigurer foregroundColor(int red, int blue, int green) {
		this.foregroundColor = DefaultExcelColor.rgb(red, blue, green);
		return this;
	}

	public ExcelCellStyleConfigurer excelBorders(ExcelBorders excelBorders) {
		this.excelBorders = excelBorders;
		return this;
	}

	public ExcelCellStyleConfigurer excelFont(ExcelFont excelFont) {
		this.excelFont = excelFont;
		return this;
	}


	public void configure(CellStyle cellStyle, Workbook wb) {
		excelAlign.apply(cellStyle);
		foregroundColor.applyForeground(cellStyle);
		excelBorders.apply(cellStyle);
		excelFont.apply(cellStyle, wb);
	}

}
