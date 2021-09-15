package com.greencross.lims.style;

import com.greencross.lims.style.align.DefaultExcelAlign;
import com.greencross.lims.style.align.ExcelAlign;
import com.greencross.lims.style.border.DefaultExcelBorders;
import com.greencross.lims.style.border.ExcelBorderStyle;
import com.greencross.lims.style.color.DefaultExcelColor;
import com.greencross.lims.style.color.ExcelColor;
import com.greencross.lims.style.font.DefaultFont;
import com.greencross.lims.style.font.ExcelFont;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;

public enum DefaultExcelCellStyle implements ExcelCellStyle {

	GREY_HEADER(DefaultExcelColor.rgb(234, 234, 234),
			DefaultExcelBorders.newInstance(ExcelBorderStyle.DASHED), DefaultExcelAlign.CENTER_CENTER, DefaultFont.DEFAULT_HEADER_FONT),
	BLUE_HEADER(DefaultExcelColor.rgb(223, 235, 246),
			DefaultExcelBorders.newInstance(ExcelBorderStyle.DASHED), DefaultExcelAlign.CENTER_CENTER, DefaultFont.DEFAULT_HEADER_FONT),
	BODY(DefaultExcelColor.rgb(255, 255, 255),
			DefaultExcelBorders.newInstance(ExcelBorderStyle.DASHED), DefaultExcelAlign.CENTER_CENTER, DefaultFont.DEFAULT_BODY_FONT);

	private final ExcelColor backgroundColor;
	private final DefaultExcelBorders borders;
	private final ExcelAlign align;
	private final ExcelFont font;

	DefaultExcelCellStyle(ExcelColor backgroundColor, DefaultExcelBorders borders, ExcelAlign align, ExcelFont font) {
		this.backgroundColor = backgroundColor;
		this.borders = borders;
		this.align = align;
		this.font = font;
	}

	@Override
	public void apply(CellStyle cellStyle, Workbook wb) {
		backgroundColor.applyForeground(cellStyle);
		borders.apply(cellStyle);
		align.apply(cellStyle);
		font.apply(cellStyle,wb);
	}
}
