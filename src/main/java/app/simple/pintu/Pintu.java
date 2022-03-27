package app.simple.pintu;

import app.simple.thermometer.Thermometer;

enum Status {
	TERBUKA,
	TERKUNCI
}

enum Alarm {
	BUNYI,
	MATI
}

public class Pintu {
	private Status statusKunci;
	private int suhuMaksimal;
	private Alarm alarm;
	
	public Pintu(Status status, int suhu) {
		this.alarm = Alarm.MATI; // secara default alarm akan mati
		this.statusKunci = Status.TERKUNCI; // secara default pintu akan terkunci 
		this.suhuMaksimal = suhu;
	}

	public void bukaKunci(Thermometer thermo) {
		if(thermo.getSuhu() <= suhuMaksimal) {
			this.statusKunci = Status.TERBUKA;
			bunyiAlarm(false); // Alarm tidak berbunyi
		} else {
			this.statusKunci = Status.TERKUNCI;
			bunyiAlarm(true); // Alarm berbunyi
		}
	}
	
	public void kunciPintu() {
		this.statusKunci = Status.TERKUNCI;
	}
	
	private void bunyiAlarm(boolean alert) {
		if(alert) {
			this.alarm = Alarm.BUNYI;
		} else {
			this.alarm = Alarm.MATI;
		}
	}
}
