package com.ebox;

public class UserBOUserCredentials {
		public UserCredentials[] getUsersCredentials() {
			UserCredentials[] users = new UserCredentials[5];

			users[0] = new UserCredentials(1, "Louis", "rxfsuzA2345");
			users[1] = new UserCredentials(2, "Messie", "hpphmf1:");
			users[2] = new UserCredentials(3, "Steve", "opefKt");
			users[3] = new UserCredentials(4, "Kallis", "23456778");
			users[4] = new UserCredentials(5, "Wipro", "A$%");

			return users;
		}

		private String encryptPassword(String value) {
			//fill the code
			char[] temp=value.toCharArray();
			char[] newArray=new char[temp.length];
			for(int i=0;i<temp.length;i++) {
				int asc=temp[i];
				int newAsc=asc+1;
				newArray[i]=(char)newAsc;
			}
			String returnString=String.valueOf(newArray);
			return returnString;
			}
		

		public boolean validate(String username, String password) {
			//fill the code
			UserCredentials[] usersArray = getUsersCredentials();
			int flag=0;
			for(int i=0;i<usersArray.length;i++) {
				if((usersArray[i].getUsername()).compareTo(username)==0) {
					if((usersArray[i].getPassword()).compareTo(encryptPassword(password))==0) {
						flag=1;
					}
				}
			}
if(flag==1) {
	return true;
}
else {
	return false;
}
		}
	}


