package com.lib.controller;

public class Library_Controller 
{
		int b_id;
		String b_title;
		String b_author;
		String b_genre;
		int b_year;
		int b_qty;
		public Library_Controller(int b_id, String b_title, String b_author, String b_genre, int b_year, int b_qty) {
			super();
			this.b_id = b_id;
			this.b_title = b_title;
			this.b_author = b_author;
			this.b_genre = b_genre;
			this.b_year = b_year;
			this.b_qty = b_qty;
		}
		
		
		
		public int getB_id() {
			return b_id;
		}
		public void setB_id(int b_id) {
			this.b_id = b_id;
		}
		public String getB_title() {
			return b_title;
		}
		public void setB_title(String b_title) {
			this.b_title = b_title;
		}
		public String getB_author() {
			return b_author;
		}
		public void setB_author(String b_author) {
			this.b_author = b_author;
		}
		public String getB_genre() {
			return b_genre;
		}
		public void setB_genre(String b_genre) {
			this.b_genre = b_genre;
		}
		public int getB_year() {
			return b_year;
		}
		public void setB_year(int b_year) {
			this.b_year = b_year;
		}
		public int getB_qty() {
			return b_qty;
		}
		public void setB_qty(int b_qty) {
			this.b_qty = b_qty;
		}
		
		
		@Override
		public String toString() {
			return "Library_Controller [Book ID=" + b_id + ", Title=" + b_title + ", Author=" + b_author + ", Gener="
					+ b_genre + ", Year=" + b_year + ", Quantity=" + b_qty + "]";
		}
		
		
		
}
