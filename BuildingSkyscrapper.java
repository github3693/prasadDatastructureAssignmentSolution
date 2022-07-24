import java.util.Scanner;
public class BuildingSkyscrapper {
	
	static int numberofdays;
	static int numberoffloors;
	int ithnumberoffloor;
	static int floorsize;

	static void construction(int numberofdays){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter the total number of floors");
		numberoffloors= sc .nextInt();
		
		System.out.println("please enter the floor size given on day 1");
		floorsize = sc.nextInt();
		
		System.out.println("please enter the floor size given on day 2");
		floorsize= sc.nextInt();
		
		System.out.println("please enter the floor size given on day 3");
		 floorsize = sc.nextInt();
		
		
	}	
	
	   
	  public static void main(String[] args) {
		 
			Scanner sc=new Scanner(System.in);
			
		  BuildingSkyscrapper ob =new BuildingSkyscrapper();
	   ob.construction(numberofdays);
	   
	   System.out.println("the order of construction is as");
	   
	System.out.println("DAY 1"+ floorsize);
	
	System.out.println("Day 2"+ floorsize);

	System.out.println("Day 3"+floorsize);
	   
	  }

	
		
			
	
	
}
