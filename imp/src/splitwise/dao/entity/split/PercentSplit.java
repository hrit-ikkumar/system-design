package splitwise.dao.entity.split;

import splitwise.dao.entity.User;

public class PercentSplit extends Split{

    double percent;
    public PercentSplit(User user) {
        super(user);
    }

    public PercentSplit(User user, double percent) {
        super(user);
        this.percent = percent;
    }

    public Double getPercent() {
        return this.percent;
    }
}
