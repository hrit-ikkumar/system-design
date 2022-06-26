package structural.decorator;

import structural.decorator.decorator_object.HtmlEncodedMessage;
import structural.decorator.existing_object.Message;
import structural.decorator.existing_object.TextMessage;

public class DecoratorClient {
    public static void main(String args[]) {
        Message message = new TextMessage("Hey there, MAN!!!");
        System.out.println(message.getContent());

        message = new HtmlEncodedMessage(message);
        System.out.println(message.getContent());
    }
}
