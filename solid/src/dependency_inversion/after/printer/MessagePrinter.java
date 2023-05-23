package dependency_inversion.after.printer;

import dependency_inversion.after.writer.Writter;
import dependency_inversion.after.formatter.Formatter;
import dependency_inversion.after.message.Message;

import java.io.IOException;

public class MessagePrinter {
    public void writeMessageToFile(Message msg, Formatter formatter, Writter writter) throws IOException {
        writter.println(formatter.format(msg));
        writter.flush();
    }
}
/*
    Violation of Dependency Inversion Principle
    - High-level modules should not depend on the low-level module but both should depend on the abstraction.
    - the abstraction does not depend on detail but the detail depends on abstraction.
    - We have solved the problem by using abstraction of Formatter and Writter
    - We don't need to relay on method we can simply pass the dependency to method
    - It helps us to have different implementation and safety of method/class
    - Here MessagePrinter's writeMessageToFile is not tightly coupled with JSONFormatter/PrintWriter.

    - High-Level Modules: Interface/Abstraction that your client uses.
    - Low-Level Modules: Details of your interfaces/abstraction
    - High level model basically means a module that provides or that implements some business rules.
        - Write Message To File method here
    - A low level module is basically a functionality that is so basic that it can be used anywhere.
        - For example, writing to disk is something that is that can be used anywhere.
    - High Level Module should not tightly coupled with these low level module/concrete classes
    - Both High/Low Level should depend on abstraction/interface
 */
