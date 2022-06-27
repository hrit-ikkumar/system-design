package structural.facade.email.stationary;

public class StationaryFactory {

	public static Stationary createStationary() {
		return new com.coffeepoweredcrew.facade.email.HalloweenStationary();
	}
}
