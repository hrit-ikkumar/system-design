package creational.factory_method.after.factory;

import creational.factory_method.after.message.JSONMessage;
import creational.factory_method.after.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
