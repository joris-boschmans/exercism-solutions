public class CarsAssemble {
	
	private static final double BASE_PRODUCTION_RATE_PER_HOUR = 221.0;
	
	public double productionRatePerHour(int speed) {
		return speed * BASE_PRODUCTION_RATE_PER_HOUR * getWorkingMultiplier(speed);
	}
	
	public int workingItemsPerMinute(int speed) {
		return (int) (productionRatePerHour(speed) / 60);
	}
	
	private double getWorkingMultiplier(int speed) {
		if (speed <= 4) return 1.0;
		if (speed <= 8) return 0.9;
		if (speed == 9) return 0.8;
		return 0.77;
	}
}
