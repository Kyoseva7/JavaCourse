
public class Doctor extends Employee {
	
	private int nightShifts;
	private int dayNight;
	
	public Doctor(int workHours, double salary, int nightShifts, int dayNight) {
		super(workHours, salary);
		setNightShifts(nightShifts);
		setDayNight(dayNight);
	}
	
	public void setNightShifts(int nightShifts) {
		if(nightShifts >= 0) {
			this.nightShifts = nightShifts;
		}
	}
	
	public int getNightShifts() {
		return nightShifts;
	}
	
	public void setDayNight(int dayNight) {
		if(dayNight >= 0) {
			this.dayNight = dayNight;
		}
	}
	
	public int dayNight() {
		return dayNight;
	}
}
