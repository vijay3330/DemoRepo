package com.lib.main;

import java.util.Scanner;

import com.lib.service.Book_not_found_Exception;
import com.lib.serviceimplementation.*;

public class Main
{
				
				public static void main(String[] args) 
				{
					Library_Implementation li=new Library_Implementation();
					Scanner sc = new Scanner(System.in);
					System.out.println("==========Welcom To Library managment System==========");
					
					char ch;
					do
					{
						System.out.println("Enter the Choice which operation you want to perform");
						System.out.println("1. Add a book in library");
						System.out.println("2. Remove a book from library");
						System.out.println("3. Search a book by book title name");
						System.out.println("4. Search a book by author name");
						System.out.println("5. Search a book by Books By Genre");
						System.out.println("6. Display all the books");
						System.out.println("7. Exit");
						
						int choice=sc.nextInt();
						switch(choice)
						{
						case 1:
							li.addBook();
							break;
						case 2:
							try {
							li.removeBook();
							} catch (Book_not_found_Exception e) {
								
								e.printStackTrace();
							}
							break;
						case 3:
							try {
							li.searchByTitle();
							}catch(Book_not_found_Exception e) {
								
								e.printStackTrace();
							}
							break;
						case 4:
							try {
							li.searchByAuthor();
							}catch(Book_not_found_Exception e) {
								
								e.printStackTrace();
							}
							
							break;
						case 5:
							try {
							li.displayBooksByGenre();
							}catch(Book_not_found_Exception e) {
								
								e.printStackTrace();
							}
							break;
						case 6:
							li.displayAllBooks();
							break;
						case 7:
							System.out.println("System Exit");
							break;
							
						default:
							System.out.println("Invalid choice. Please try again.");
							break;
				
						}
						System.out.println("Do You Want To Continue For Yes Press Y Otherwise N");
						ch=sc.next().charAt(0);
						
					}while(ch=='y'||ch=='Y');
					

				}
				
}
