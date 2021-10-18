package com.ebox;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainUserCredentials {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Username :");
String username=bf.readLine();
System.out.println("Password :");
String password=bf.readLine();
UserBOUserCredentials u=new UserBOUserCredentials();
boolean b=u.validate(username,password);
if(b) {
	System.out.println("Login Successfull");
}
else {
	System.out.println("Incorrect username/password");
}
	}

}


/*
 * Sample Input and Output 1:
Username :
Louis
Password :
qwerty@1234
Login Successfull
    
Sample Input and Output 2:
Username :    
Messie
Password :
google
Incorrect username/password
 */
 