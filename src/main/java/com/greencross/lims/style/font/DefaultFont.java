package com.greencross.lims.style.font;

import org.apache.poi.ss.usermodel.*;


public enum DefaultFont implements ExcelFont {
	TEST_FONT("나눔 고딕",(short)10,IndexedColors.GREEN.getIndex(),false),
	TEST_FONT2("궁서",(short)10,IndexedColors.GREY_25_PERCENT.index, false),
	TEST_FONT3("돋움",(short)10,IndexedColors.GREY_80_PERCENT.getIndex(), false),
	TEST_FONT4("바탕체",(short)10,IndexedColors.BLACK1.getIndex(), false),
	TEST_FONT5("굴림체",(short)10,IndexedColors.BROWN.getIndex(),false),
	TEST_FONT6("한컴 고딕",(short)10,IndexedColors.YELLOW.getIndex(),false),

	DEFAULT_HEADER_FONT("맑은 고딕",(short)10,IndexedColors.BLACK.getIndex(), true),
	DEFAULT_BODY_FONT("맑은 고딕",(short)10,IndexedColors.BLACK.getIndex(), false);

	private final String fontName;
	private final short fontSize;
	private final short color;
	private final boolean bold;

	DefaultFont(String fontName, short fontSize, short color, boolean bold) {
		this.fontName = fontName;
		this.fontSize = fontSize;
		this.color = color;
		this.bold = bold;
	}

	@Override
	public void apply(CellStyle cellStyle, Workbook wb) {
		Font FontStyle = wb.createFont();
		FontStyle.setFontName(fontName);
		//FontStyle.setFontHeight(height);
		FontStyle.setColor(color);
		FontStyle.setBold(bold);
		FontStyle.setFontHeightInPoints(fontSize);
		cellStyle.setFont(FontStyle);
	}
}
