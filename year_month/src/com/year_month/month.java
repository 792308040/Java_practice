package com.year_month;

import java.util.*;

public class month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 0;
		int month = 0;
		int days = 0;
		boolean a = true;
		boolean b = true;
		Scanner reader = new Scanner(System.in);
		while(a)
		{
			System.out.println("���������(����������):");	
			year = reader.nextInt();
			if(year < 0){
				System.out.println("�������벻���Ϲ�������������");
				continue;
			}
			a = false;
		}
		while(b)
		{
			System.out.println("���������ȷ������������·�:");
			month = reader.nextInt();
			if(month < 0 || month > 12) {
				System.out.println("�������벻���Ϲ�������������");
				continue;
			}
			b = false;
		}
		switch(month)
		{
			case 2 : 
				if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					System.out.println("�������������");
					days = 29;
				}else {
					System.out.println("���������ƽ��");
					days = 28;
				}				
				break;
			case 4 :
			case 6 :
			case 9 :
			case 11 : 
				days = 30;
				break;
			default : 
				days = 31;								
		}			
		System.out.println(month + "�·�Ϊ" + days + "��");
		reader.close();
	}
}
