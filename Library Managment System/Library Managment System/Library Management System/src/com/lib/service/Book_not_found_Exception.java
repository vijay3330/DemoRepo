package com.lib.service;

public class Book_not_found_Exception extends RuntimeException
{
		public Book_not_found_Exception(String msg)
		{
			super(msg);
		}
}
