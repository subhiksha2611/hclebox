package com.ebox;
import java.util.Scanner;
public class MainAbstract {
	    public static void main(String[] args) {
			Scanner sc =new Scanner(System.in).useDelimiter("\n");
			System.out.println("Enter your choice\n1.Exhibition\n2.StageEvent");
			String eventType=sc.next();
			
			EventAbstract event=null;
			if(Integer.parseInt(eventType.trim())==1){
				System.out.println("Enter the details in CSV format");
				String input=sc.next();
				String[] inputs=input.split(",");
				
				event=new ExhibitionAbstract(inputs[0].trim(), inputs[1].trim(), inputs[2].trim(), inputs[3].trim(), Integer.parseInt(inputs[4].trim()), Double.parseDouble(inputs[5].trim()));
	            System.out.println("Exhibition Details");
	            System.out.println("Event Name:"+event.name);
	    	    System.out.println("Detail:"+event.detail);
			    System.out.println("Type:"+event.type);
			    System.out.println("Organiser Name:"+event.organiser);
			    System.out.println("Total Cost:"+String.format("%.1f", event.calculateAmount()));
			}
			else if(Integer.parseInt(eventType.trim())==2){
				System.out.println("Enter the details in CSV format");
				String input=sc.next();
				String[] inputs=input.split(",");
				event=new StageEventAbstract(inputs[0].trim(), inputs[1].trim(), inputs[2].trim(), inputs[3].trim(), Integer.parseInt(inputs[4].trim()), Double.parseDouble(inputs[5].trim()));
	            System.out.println("Stage Event Details");
	            System.out.println("Event Name:"+event.name);
	            System.out.println("Detail:"+event.detail);
			    System.out.println("Type:"+event.type);
			    System.out.println("Organiser Name:"+event.organiser);
			    System.out.println("Total Cost:"+String.format("%.1f", event.calculateAmount()));
			}
			else{
				System.out.println("Invalid choice");
			}
				
			}
		}
		
/*
 * Sample Input and output 1:
Enter your choice
1.Exhibition
2.StageEvent
1
Enter the details in CSV format
Book expo,Special sale,Academics,Martin,100,1000
Exhibition Details
Event Name:Book expo
Detail:Special sale
Type:Academics
Organiser Name:Martin
Total Cost:100000.0
*/
