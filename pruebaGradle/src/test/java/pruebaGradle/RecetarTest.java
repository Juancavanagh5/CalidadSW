package pruebaGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecetarTest {
	PersonalAdm pa;
	Recetar instan;
	
	public RecetarTest() {
		pa=new PersonalAdm("paID","qwerty","carlos");
		instan = new Recetar(pa);
	}

	@Test
	public void test() {
		
	}

}
