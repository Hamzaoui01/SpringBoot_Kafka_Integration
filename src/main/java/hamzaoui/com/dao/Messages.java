package hamzaoui.com.dao;

import java.util.ArrayList;

public class Messages {	
	public static ArrayList<String> getMessages() {
		return messages;
	}

	public static void addMessages(String message) {
		Messages.messages.add(message);
	}

	private static ArrayList<String> messages=new ArrayList<>();
}
