package pruebaGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrincipalDoctorTest {

	@Test
	public void test() {
		PersonalAdm pa = new PersonalAdm("paID","qwerty","carlos");
		Doctor d1 = new Doctor("doc1","user1","1234",pa);
        Doctor d2 = new Doctor ("doc2", "user2","4321",pa);
        pa.registrarObserver(d1);
        pa.registrarObserver(d2);
        pa.SelDoctor("user2");
        PrincipalDoctor instance = new PrincipalDoctor(pa);
        instance.main(null);
	}

}
