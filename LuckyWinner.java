package com.ebox;
import java.util.*;
public class LuckyWinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%10==3 || n%10==8){
            System.out.println("Lucky Winner");
        }
        else{
            System.out.println("Not a Lucky Winner");
        }
	}

}
