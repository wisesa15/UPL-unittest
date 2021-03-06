package app.simple.thermometer;

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

class ThermometerTest {

	
	private int suhuCelcius;
	private Thermometer Thremo;
	@BeforeEach
	public void setUp()
	{
		Thremo  = new Thermometer();
	}
	@Test
	@DisplayName("Tes Mengubah suhu thermometer")
	void testUbahSuhu()
	{
		Thremo.setSuhu(31);
		
		assertEquals(31, Thremo.getSuhu());
	}
	@Test
	@DisplayName("Tes Mengambil suhu thermometer")
	void testAmbilSuhu()
	{	
		assertEquals(0, Thremo.getSuhu()); // default value dari konstruktor = 0
	}
	
}
	