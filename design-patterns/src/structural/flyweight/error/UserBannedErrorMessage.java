package structural.flyweight.error;

import java.time.Duration;

// Unshared concrete flyweight
// Exrinsic state
public class UserBannedErrorMessage implements ErrorMessage{

    // All state is defined here
    private String caseId;

    private String remarks;

    private Duration banDuration;

    private String msg;

    public UserBannedErrorMessage(String caseId) {
        // lad the case info from db
        this.caseId = caseId;
        remarks = "You violated terms of use";
        banDuration = Duration.ofDays(2);
        msg = "You are banned!!";
        msg += caseId + "\n";
        msg += remarks + "\n";
        msg += "Banned for: " + banDuration.toHours() + " Hours";
    }

    // We ignore the extrinsic state argument
    @Override
    public String getText(String code) {
        return msg;
    }

    public String getCaseNo() {
        return caseId;
    }
}
