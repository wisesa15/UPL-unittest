package app.simple.pintu;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

import app.simple.thermometer.Thermometer;

class PintuTest {

	private Pintu pintu;
	
	@BeforeEach
	public void setUp() {
		pintu = new Pintu(37);
	}
	
	@ParameterizedTest(name="(index) => suhu={0}, statusKunci={1}")
	@DisplayName("Tes Buka Kunci dengan parameter di bawah, sama dengan, dan di atas suhu maksimal")
	@CsvSource({"35,TERBUKA","37,TERBUKA","38,TERKUNCI" })
	void testBukaKunci(int suhu, Status statusKunci) {
		Thermometer thermo = mock(Thermometer.class);
		when(thermo.getSuhu()).thenReturn(suhu);
		
		pintu.bukaKunci(thermo);
		
		assertEquals(statusKunci, pintu.getStatusKunci());
	}
}
