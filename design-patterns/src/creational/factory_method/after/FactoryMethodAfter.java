package creational.factory_method.after;

import creational.factory_method.after.factory.JSONMessageCreator;
import creational.factory_method.after.factory.MessageCreator;
import creational.factory_method.after.factory.TextMessageCreator;
import creational.factory_method.after.message.Message;

public class FactoryMethodAfter {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		
		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message msg = creator.getMessage();
		System.out.println(msg);
	}
}
