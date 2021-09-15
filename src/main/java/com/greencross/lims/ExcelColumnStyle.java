package com.greencross.lims;


import com.greencross.lims.style.ExcelCellStyle;

public @interface ExcelColumnStyle {
	Class<? extends ExcelCellStyle> excelCellStyleClass();
	String enumName() default "";
	boolean bold() default false;
}
