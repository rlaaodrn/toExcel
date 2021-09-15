package com.greencross.lims.style.border;

import org.apache.poi.ss.usermodel.CellStyle;

import java.util.ArrayList;
import java.util.List;

public final class DefaultExcelBorders implements com.greencross.lims.style.border.ExcelBorders {

	private List<? extends com.greencross.lims.style.border.ExcelBorder> borders;

	public DefaultExcelBorders(List<? extends com.greencross.lims.style.border.ExcelBorder> borders) {
		validateBorders(borders);
		this.borders = borders;
	}

	public static DefaultExcelBorders newInstance(ExcelBorderStyle style) {
		List<com.greencross.lims.style.border.DefaultExcelBorder> excelBorders = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			excelBorders.add(new com.greencross.lims.style.border.DefaultExcelBorder(style));
		}
		return new DefaultExcelBorders(excelBorders);
	}

	private void validateBorders(List<? extends com.greencross.lims.style.border.ExcelBorder> borders) {
		if (borders.size() != 4) {
			throw new IllegalArgumentException("Should be initialized with TOP RIGHT LEFT BOTTOM borders");
		}
	}

	public void apply(CellStyle cellStyle) {
		borders.get(0).applyTop(cellStyle);
		borders.get(1).applyRight(cellStyle);
		borders.get(2).applyBottom(cellStyle);
		borders.get(3).applyLeft(cellStyle);
	}

}
