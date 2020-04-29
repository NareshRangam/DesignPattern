package com.ss.adapter;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen penAdapter=new PenAdapter();
		AssignmentWork aw=new AssignmentWork();
		aw.setPen(penAdapter);
		aw.writeAsignment("Test Assignment");
	}

}
