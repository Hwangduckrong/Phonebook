package com.javaex.phonebook;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookDB {

	public static void main(String[]args)throws IOException{
		//읽기 스트림
		InputStream in = new FileInputStream("/Users/hwangdeoglyong/eclipse-workspace/PhoneDB.txt");
		InputStreamReader isr =new InputStreamReader(in,"UTF-8");
		BufferedReader br = new BufferedReader(isr);

		//쓰기 스트림
		List<PhoneBook>PhoneBookList = new ArrayList<PhoneBook>();
		Scanner sc= new Scanner(System.in);

		boolean run =true;

		while(true) {
			String str=br.readLine();

			if(str==null) {

				break;
			}

			String[]ph=str.split(",");
			PhoneBook phone = new PhoneBook(ph[0],ph[1],ph[2]);	
			PhoneBookList.add(phone);
		}
		while(run) {
			System.out.println("*******************************");
			System.out.println("*      전화번호 관리 프로그램      *");
			System.out.println("*******************************");
			System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			System.out.println("--------------------------------");
			System.out.println("메뉴번호>");
			int menuNo = sc.nextInt();

			switch(menuNo) {


			case 1:

				System.out.println("<1.리스트>");

				

				for(int i =0; i<PhoneBookList.size();i++) {
					PhoneBookList.get(i).showInfo();
				}

				break;

			case 2:

				System.out.println("<2.등록>");
				System.out.println("정보를 입력하세요");
				sc.nextLine();
				String info=sc.nextLine();
				String[]regi=info.split(",");
				PhoneBookList.add(new PhoneBook(regi[0],regi[1],regi[2]));
				break;

			case 3:
				System.out.println("<3.삭제>");
				System.out.println("정보를 입력하세요");
				
				int ins = sc.nextInt();
				PhoneBookList.remove(ins-1);
				System.out.println("정보가 삭제되었습니다.");


				break;

			case 4:
			
				sc.nextLine();
				System.out.println("<4.검색>");
				System.out.println(">이름: ");
				String word=sc.nextLine();
				for(int i =0; i<PhoneBookList.size();i++) {
					PhoneBook p = PhoneBookList.get(i);
					if(p.getName().contains(word)) {
						System.out.println("이름: " +p.getName());
						System.out.println("연락처: "+p.getHp());
						System.out.println("회사: "+p.getCompany());
					}
				}
				break;
				
			case 5:
	

				System.out.println("----------------");
				System.out.println("시스템을 종료합니다");

				run=false;
				break;
				
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;

			}

		}
		br.close();
		sc.close();


	}
}