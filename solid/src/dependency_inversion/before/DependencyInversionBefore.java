package dependency_inversion.before;

import java.io.IOException;

public class DependencyInversionBefore {
    public static void main(String args[]) throws IOException {
        Message message = new Message("Hello");
        MessagePrinter messagePrinter = new MessagePrinter();

        messagePrinter.writeMessageToFile(message, new JSONFormatter(),new PrintWritter(System.out));
    }
}
