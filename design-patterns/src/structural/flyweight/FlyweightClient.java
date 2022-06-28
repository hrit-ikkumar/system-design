package structural.flyweight;

import structural.flyweight.error.ErrorMessageFactory;
import structural.flyweight.error.SystemErrorMessage;
import structural.flyweight.error.UserBannedErrorMessage;

public class FlyweightClient {
    public static void main(String args[]) {
        SystemErrorMessage msg1 = ErrorMessageFactory.getInstance()
                .getError(ErrorMessageFactory.ErrorType.GenericSystemError);
        System.out.println(msg1.getText("4056"));

        UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance()
                .getUserBannedMessage("1202");
        System.out.println(msg2
        .getText(null));
    }
}
