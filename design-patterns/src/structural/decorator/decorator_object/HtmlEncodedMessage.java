package structural.decorator.decorator_object;

import structural.decorator.existing_object.Message;

// There can be multiple decorators just by implementing Message class
public class HtmlEncodedMessage implements Message {
    private Message msg;

    // provide object to decorator
    public HtmlEncodedMessage(Message msg) {
        this.msg = msg;
    }

    // Small decoration in msg
    // Lower casing the content
    @Override
    public String getContent() {
        return msg.getContent().toLowerCase();
    }
}
