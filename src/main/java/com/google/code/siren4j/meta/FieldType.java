/*******************************************************************************************
 * The MIT License (MIT)
 * 
 * Copyright (c) 2013 Erik R Serating
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *********************************************************************************************/
package com.google.code.siren4j.meta;

public enum FieldType {

	BUTTON,
	CHECKBOX,
	COLOR,
	DATE,
	DATETIME,
	DATETIMELOCAL("datetime-local"),
	EMAIL,
	FILE,
	HIDDEN,
	IMAGE,
	MONTH,
	NUMBER,
	PASSWORD,
	RADIO,
	RANGE,
	RESET,
	SEARCH,
	SUBMIT,
	TEL,
	TEXT,
	TIME,
	URL,
	WEEK;
	
	private String value;
	
	private FieldType(String value) {
		this.value = value;
	}
	
	private FieldType() {
		
	}

	@Override
	public String toString() {
		if(value != null && value.length() > 0) {
			return value;
		}
		return super.toString().toLowerCase();
	}
	
	
	
}