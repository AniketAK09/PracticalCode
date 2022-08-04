package oopsConcept;

public class ChatRoom {
	
	int logId;
	String password;
	static int objCount = 0;
	
	public ChatRoom() {
		
	}
	
	public ChatRoom(int id,String pass)
	{
		logId = id;
		password = pass;
		objCount++;
	}
	
	public String toString()
	{
		return "Login id is "+logId+" password is "+password;
	}

	public static void main(String[] args) {
		
		ChatRoom cr = new ChatRoom(12345,"Aniket");
		ChatRoom cr1 = new ChatRoom(45356,"Nilesh");
		
		System.out.println(cr);
		System.out.println(cr1);
		System.out.println("Total visitor in wbsite is "+ChatRoom.objCount);

	}

}
