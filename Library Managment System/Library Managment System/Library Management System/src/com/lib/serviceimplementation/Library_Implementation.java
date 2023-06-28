package com.lib.serviceimplementation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

import com.lib.service.Book_not_found_Exception;
import com.lib.service.Library;
import com.lib.controller.*;

public class Library_Implementation implements Library
{
	Scanner sc=new Scanner(System.in);
	HashMap<Integer, Library_Controller> hs=new HashMap<>();

	@Override
	public void addBook() {
		System.out.println("Plese Enter how many books you want to add in library");
		int recsize = sc.nextInt();
		for (int i = 0; i < recsize; i++) 
		{
			System.out.println("Enter Book ID");
			int bid=sc.nextInt();
			System.out.println("Enter Book Title");
			String btitle=sc.next();
			System.out.println("Enter Book Author Name");
			String bauthor=sc.next();
			System.out.println("Enter Book Gener Type");
			String bgener=sc.next();
			System.out.println("Enter Book Year");
			int byear=sc.nextInt();
			System.out.println("Enter Book Quantity");
			int bqty=sc.nextInt();
			
			hs.put(bid, new Library_Controller(bid,btitle,bauthor,bgener,byear,bqty));
			
		}
		
		
	}

	@Override
	public void removeBook() 
	{
		System.out.println("Enter Book ID Of Book Which You Want To Remove From Library");
		int reid=sc.nextInt();
		
		if(hs.isEmpty())
		{
			throw new Book_not_found_Exception("No Books Available For Remove");
		}
		else if(hs.containsKey(reid))
		{
			Iterator<Integer> itr = hs.keySet().iterator();
			
			while(itr.hasNext())
			{
				if(reid==itr.next())
				{
					itr.remove();
					System.out.println("Succesfully Remove");
					
				}
				
			}
		}
		else
		{
			throw new Book_not_found_Exception("No Book ID Available For Remove please chek book id");
		}
		
		
	}

	@Override
	public void searchByTitle() {
		
		if(hs.isEmpty())
		{
			throw new Book_not_found_Exception("No Books Available For Search");
		}
		else
		{
		System.out.println("Enter The Title Of The Book");
		String stitle=sc.next();
		for( Entry<Integer, Library_Controller> bk : hs.entrySet())
		{
			if(stitle.equalsIgnoreCase(bk.getValue().getB_title()))
			{
				System.out.println(bk);
			}
			else
			{
				throw new Book_not_found_Exception("Title Not Found Please Check The Title");

			}
		}
		}
	}

	@Override
	public void searchByAuthor() {
		if(hs.isEmpty())
		{
			throw new Book_not_found_Exception("No Books Available For Search");
		}
		else
		{
		System.out.println("Enter The Author Name");
		String sauthor=sc.next();
		for( Entry<Integer, Library_Controller> bk : hs.entrySet())
		{
			if(sauthor.equalsIgnoreCase(bk.getValue().getB_author()))
			{
				System.out.println(bk);
			}
			else
			{
				throw new Book_not_found_Exception("No Books Available For Searched Author Name Please Check Author Name");

			}
		}
		}
	}

	
	@Override
	public void displayBooksByGenre() {
		if(hs.isEmpty())
		{
			throw new Book_not_found_Exception("No Books Available For Search");
		}
		else
		{
		System.out.println("Enter The Gener Name");
		String sgener=sc.next();
		for( Entry<Integer, Library_Controller> bk : hs.entrySet())
		{
			if(sgener.equalsIgnoreCase(bk.getValue().getB_genre()))
			{
				System.out.println(bk);
			}
			else
			{
				throw new Book_not_found_Exception("No Books Available For Searched Gener Type Please Check The Gener Type");

			}
		}
		}
		
	}

	@Override
	public void displayAllBooks() {
		if(hs.isEmpty())
		{
			throw new Book_not_found_Exception("No Books Available In Library");
		}
		else
		{
		for(Entry<Integer, Library_Controller> bk : hs.entrySet())
		{
			System.out.println(bk);
		}
		}
	}
	
	
}
