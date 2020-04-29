package com.ss.adapter;

public class AssignmentWork {

	private Pen pen;
	
	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public void writeAsignment(String assinmentName)
	{
		pen.write(assinmentName);
	}
}
