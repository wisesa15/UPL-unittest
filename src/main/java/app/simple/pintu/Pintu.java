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

	public boolean bukaKunci(Thermometer thermo) {
		if(thermo.getSuhu() > suhuMaksimal) {
			this.statusKunci = Status.TERBUKA;
		} else {
			this.statusKunci = Status.TERKUNCI;
		}
		if (this.statusKunci == Status.TERBUKA) {
			bunyiAlarm(false); // Alarm tidak berbunyi
			return true; // True berarti kunci pintu berhasil terbuka
		} else {
			bunyiAlarm(true); // Alarm tidak berbunyi
			return false; // False berarti kunci pintu tidak bisa terbuka
		}
	}
	
	private void bunyiAlarm(boolean alert) {
		if(alert) {
			this.alarm = Alarm.BUNYI;
		} else {
			this.alarm = Alarm.MATI;
		}
	}
}
