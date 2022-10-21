import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MetodaiTest {

	private static final String Arraylist = null;
Pica mazaPica, vidutinePica, didelePica;
	
	
	@BeforeEach
	void setUpBeforeClass() throws Exception {
		mazaPica=new Pica(Dydis.MAZAS, 2,2);
		vidutinePica=new Pica(Dydis.VIDUTINIS, 3,3);
		didelePica=new Pica(Dydis.DIDELIS, 1,0);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void smallestNumberTest() {
		Metodai metodai=new Metodai();
		ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(10,9,7,5,45,2,3,5));
		Integer smallestNumber=metodai.smallestNumber(numbers);
		assertEquals(2, smallestNumber);
	
	}
	@Test
	void averageTest() {
		Metodai metodai=new Metodai();
		ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(25,45,65));
		double average = metodai.average(numbers);
		assertEquals(45, average);
		
	}
	
@Test
void middleCharacterTestOddCharacter() {
Metodai metodai=new Metodai();
String word="koncertas";
assertEquals("e", metodai.middleCharacter(word));
}

@Test
void middleCharacterTestEvenCharacter() {
	Metodai metodai=new Metodai();
	String word="krabas";
	assertEquals("ab", metodai.middleCharacter(word));}
	
	
	@Test
	void numberOfVowelsTest() {
		Metodai metodai=new Metodai();
		String word="krabas";
		assertEquals(2, metodai.numberOfVowels(word));
	}
	
	@Test
	void monthTestZero(){
		Metodai metodai=new Metodai();
		String month=metodai.month(0);
		assertEquals("netinkamas skaicius", month);
	}
	@Test
	void monthTestThirten(){
		Metodai metodai=new Metodai();
		String month=metodai.month(13);
		assertEquals("netinkamas skaicius", month);
	}
	@Test
	void monthTestTwo(){
		Metodai metodai=new Metodai();
		String month=metodai.month(2);
		assertEquals("April", month);
}
	@Test
	void monthTestFive(){
		Metodai metodai=new Metodai();
		String month=metodai.month(5);
		assertEquals("May", month);	
		
	}
	@Test
	void PicaTestMaza(){
		Integer kaina=mazaPica.skaiciuotiKaina();
		assertEquals(19, kaina);
		
	}
	@Test
	void PicaTestVidutine(){
		Integer kaina=vidutinePica.skaiciuotiKaina();
		assertEquals(24, kaina);
		
	}
	
	@Test
	void PicaTestDidele(){
		Integer kaina=didelePica.skaiciuotiKaina();
		assertEquals(16, kaina);
		
	}
}
