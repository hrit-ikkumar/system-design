package structural.flyweight.error;

// A concrete Flyweight. Instance is shared
// Intrinsic state contains and takes extrinsic as argument
public class SystemErrorMessage implements ErrorMessage{
    // some error message $errorCode
    private String messageTemplate;

    // http://somedomain.com/help?erro=
    private String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    @Override
    public String getText(String code) {
        return messageTemplate.replace("$errorCode", code) + helpUrlBase + code;
    }
}
