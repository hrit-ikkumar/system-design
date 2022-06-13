package creational.factory_method.after.factory;

import creational.factory_method.after.message.Message;
import creational.factory_method.after.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
