package pruebaGradle;

import static org.junit.Assert.*;

import org.junit.Test;

@SuppressWarnings("unused")
public class NoAdeudaTEst {
	PersonalAdm pa;
	NoAdeuda na;
	
	public NoAdeudaTEst() {
		pa = new PersonalAdm("id78", "pass56", "micaela");
		na = new NoAdeuda(pa);
	}
/*
	@Test
	public void test() {
		
	}
*/
}
