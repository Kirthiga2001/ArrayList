package Zoho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task2_ArrayList {

	public static void main(String[] args) {
		// adding input to arrayList
		Scanner sc=new Scanner(System.in);
				List<Integer> primeno=new ArrayList<>();
				System.out.print("Enter the number of elements: ");
				int n=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the elements: ");
				for(int i=0;i<n;i++) primeno.add(sc.nextInt());
				List<Integer> fpn=new ArrayList<>();
				System.out.print("Enter the number of elements: ");
				int n2=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the elements: ");
				for(int i=0;i<n2;i++) fpn.add(sc.nextInt());
				List<Integer> tpn=new ArrayList<>(primeno); //->using constructors
				while(true) {
					System.out.println("**********MENU**********");
					System.out.println("1-> Combine lists ");
					System.out.println("2-> Add new element ");
					System.out.println("3-> get size ");
					System.out.println("4-> check if empty ");
					System.out.println("5-> access element ");
					System.out.println("6-> sort ");
					System.out.println("7-> print");
					System.out.println("8-> reverse ");
					System.out.println("9-> remove a element ");
					System.out.println("10-> remove a collection ");
					System.out.println("11-> clear all ");
					System.out.println("12-> EXIT ");
					System.out.println("*************************");
					n=sc.nextInt();
					sc.nextLine();
					switch(n) {
					case 1:
						
						tpn.addAll(fpn);
						break;
					case 2:
						System.out.print("Enter the index to add: ");
						int n4=sc.nextInt();
						sc.nextLine();
						if (tpn.size()>n4) {
							System.out.print("Enter the number to add: ");
							fpn.add(sc.nextInt(),n4);
							sc.nextLine();
							System.out.println(tpn);}
						else 
							System.out.println("Index not found");
						break;
					case 3:
						System.out.println(tpn.isEmpty());
						break;
					case 4:
						System.out.println(tpn.size());
						break;
					case 5:
						System.out.print("Enter the index: ");
						int n3=sc.nextInt();
						sc.nextLine();
						if (tpn.size()>n3)
							System.out.println(tpn.get(n3));
						else 
							System.out.println("Index not found");
						break;
					case 6:
						Collections.sort(tpn);
						System.out.println(tpn);
						
						break;
					case 7:
						System.out.println(primeno);
						System.out.println(fpn);
						System.out.println(tpn);
						break;
					case 8:
						Collections.reverse(tpn);
						System.out.println(tpn);
						break;
					case 9:
						System.out.print("Enter the index: ");
						int n5=sc.nextInt();
						sc.nextLine();
						if (tpn.size()>n5) {
							tpn.remove(n5);
							System.out.println(tpn);}
						else 
							System.out.println("Index not found");
						break;
					case 10:
						tpn.removeAll(fpn);
						System.out.println(tpn);
						tpn.addAll(fpn);
						break;
					case 11:
						tpn.clear();
						System.out.println(tpn);
						break;
					case 12:
						return;
					default:
						System.out.print("Invalid choice");
					}
				}
	}

}
