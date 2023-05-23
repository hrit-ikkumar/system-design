package dependency_inversion.after;

import dependency_inversion.after.formatter.JSONFormatter;
import dependency_inversion.after.message.Message;
import dependency_inversion.after.printer.MessagePrinter;
import dependency_inversion.after.writer.PrintWritter;

import java.io.IOException;

public class DependencyInversionAfter {
    public static void main(String args[]) throws IOException {
        Message message = new Message("Hello");
        MessagePrinter messagePrinter = new MessagePrinter();

        messagePrinter.writeMessageToFile(message, new JSONFormatter(),new PrintWritter(System.out));
    }
}
