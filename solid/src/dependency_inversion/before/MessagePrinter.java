package dependency_inversion.before;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {
    public void writeMessageToFile(Message msg, String fileName) throws IOException {
        // High Level modules depend upon the low level modules --> RED flag, they should depend upon abstraction

        JSONFormatter formatter = new JSONFormatter();
        PrintWriter writer =  new PrintWriter(new FileWriter(fileName));

        writer.println(formatter.format(msg));
        writer.flush();
    }
}
/*
    Violation of Dependency Inversion Principle
    - High-level modules should not depend on the low-level module but both should depend on the abstraction.
    - the abstraction does not depend on detail but the detail depends on abstraction.

    - Here MessagePrinter's writeMessageToFile is tightly coupled with JSONFormatter/PrintWriter.

    - High-Level Modules: Interface/Abstraction that your client uses.
    - Low-Level Modules: Details of your interfaces/abstraction
    - High level model basically means a module that provides or that implements some business rules.
        - Write Message To File method here
    - A low level module is basically a functionality that is so basic that it can be used anywhere.
        - For example, writing to disk is something that is that can be used anywhere.
    - High Level Module should not tightly coupled with these low level module/concrete classes
    - Both High/Low Level should depend on abstraction/interface
 */
