package com.BikkadIT.SpringwebMVCfirstApp.model;

public class booking {

	private String bookname;
	private int bookid;
	private String bookcolour;
	
	public booking() {
		super();
		System.out.println("booking class constructor");
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookcolour() {
		return bookcolour;
	}

	public void setBookcolour(String bookcolour) {
		this.bookcolour = bookcolour;
	}
	

	@Override
	public String toString() {
		return "booking [bookname=" + bookname + ", bookid=" + bookid + ", bookcolour=" + bookcolour + "]";
	}

		
	}
	
	
	
	
	

