package com.greencross.lims.resource.collection;

import com.greencross.lims.resource.DataFormatDecider;
import com.greencross.lims.resource.ExcelCellKey;
import com.greencross.lims.style.ExcelCellStyle;
import org.apache.poi.ss.usermodel.*;

import java.util.HashMap;
import java.util.Map;

public class PreCalculatedCellStyleMap {

	private final DataFormatDecider dataFormatDecider;

	public PreCalculatedCellStyleMap(DataFormatDecider dataFormatDecider) {
		this.dataFormatDecider = dataFormatDecider;
	}

	private final Map<ExcelCellKey, CellStyle> cellStyleMap = new HashMap<>();

	public void put(Class<?> fieldType, ExcelCellKey excelCellKey, ExcelCellStyle excelCellStyle, Workbook wb) {
		CellStyle cellStyle = wb.createCellStyle();
		DataFormat dataFormat = wb.createDataFormat();
		cellStyle.setDataFormat(dataFormatDecider.getDataFormat(dataFormat, fieldType));
		excelCellStyle.apply(cellStyle,wb);
		cellStyleMap.put(excelCellKey, cellStyle);
	}

	public CellStyle get(ExcelCellKey excelCellKey) {
		return cellStyleMap.get(excelCellKey);
	}

	public boolean isEmpty() {
		return cellStyleMap.isEmpty();
	}

}
