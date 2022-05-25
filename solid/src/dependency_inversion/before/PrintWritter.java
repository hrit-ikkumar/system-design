package dependency_inversion.before;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class PrintWritter extends PrintWriter implements Writter {

    public PrintWritter(Writer out) {
        super(out);
    }

    public PrintWritter(PrintStream out) {
        super(out);
    }
}
