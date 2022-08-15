package practiseproblem;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JunitTest {

	@Test
	public void givenFirstCharacterUpperCase_whenTested_shouldReturnTrue() {
		JunitProgram firstName = new JunitProgram();
		boolean result = firstName.checkFirstName("Kasturi");
		assertTrue(result);
	}

	@Test
	public void givenFirstCharacterUpperCase_whenTestedLastName_shouldReturnTrue() {
		JunitProgram firstName = new JunitProgram();
		boolean result = firstName.checkLastName("Pansare");
		assertTrue(result);
	}

	@Test
	public void emailCheck_shouldReturnTrue() {
		JunitProgram email = new JunitProgram();
		boolean result = email.checkEmail("abc.xyz@bl.co.in");
		assertTrue(result);
	}

	@Test
	public void numberCheck_shouldReturnTrue() {
		JunitProgram number = new JunitProgram();
		boolean result = number.checkNumber("91 9910162995");
		assertTrue(result);
	}

}
