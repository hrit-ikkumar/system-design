package structural.flyweight.error;

import java.util.HashMap;
import java.util.Map;

// Flyweight factory, Returns shared flyweight based on key
public class ErrorMessageFactory {

    // This serves as key for getting flyweight instance
    public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    // Made Factory singleton
    public static ErrorMessageFactory getInstance() {
        return FACTORY;
    }

    private Map<ErrorType, SystemErrorMessage> errorTypeSystemErrorMessageMap = new HashMap<>();

    private ErrorMessageFactory() {
        errorTypeSystemErrorMessageMap.put(ErrorType.GenericSystemError,
                new SystemErrorMessage("A genetic error of type $errorCode occured. Please refer to:\n",
                        "http://google.com/q="));
        errorTypeSystemErrorMessageMap.put(ErrorType.PageNotFoundError,
                new SystemErrorMessage("Page not foun. An error of type $errorCode occured. Please refer to:\n",
                        "http://google.com/q="));
    }

    public SystemErrorMessage getError(ErrorType type) {
        return errorTypeSystemErrorMessageMap.get(type);
    }

    public UserBannedErrorMessage getUserBannedMessage(String caseId) {
        return new UserBannedErrorMessage(caseId);
    }
}
