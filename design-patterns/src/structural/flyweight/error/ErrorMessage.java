package structural.flyweight.error;

// Interface implemented by flyweights
public interface ErrorMessage {
    // Get error message
    public String getText(String code);
}
