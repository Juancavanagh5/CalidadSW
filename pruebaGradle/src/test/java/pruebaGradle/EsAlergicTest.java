package pruebaGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class EsAlergicTest {
	PersonalAdm pers;
	esAlergic esAl;
	
	public EsAlergicTest() {
		pers=new PersonalAdm("IDpers","qwerjk","javier");
		esAl=new esAlergic(pers);
	}

	@Test
	public void test() {
		
	}

}
