package app.simple.thermometer;

public class Thermometer {
	private int suhuCelsius;
	
	public Thermometer(int suhu) {
		this.suhuCelsius = suhu;
	}
	
	public void setSuhu(int suhu) {
		this.suhuCelsius = suhu;
	}
	
	public int getSuhu() {
		return suhuCelsius;
	}
}
