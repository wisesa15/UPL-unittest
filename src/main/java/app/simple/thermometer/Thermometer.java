package app.simple.thermometer;

public class Thermometer {
	private int suhuCelsius;
	
	public Thermometer() {
		this.suhuCelsius = 0;
	}
	
	public void setSuhu(int suhu) {
		this.suhuCelsius = suhu;
	}
	
	public int getSuhu() {
		return this.suhuCelsius;
	}
}
