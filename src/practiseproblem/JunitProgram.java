package practiseproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 
 * @author kastu
 *
 */
public class JunitProgram {
/*
 * creating methofd for validation of first name
 * pattern is oner letter should be capital & other letter in small case
 * returning matcher value
 */
	public boolean checkFirstName(String firstName) {
		Pattern pattern = Pattern.compile("^([A-Z]{1}+)[A-Za-z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}
/*
 * creating methofd for validation of last name
 * pattern is oner letter should be capital & other letter in small case
 * returning matcher value
 */
	public boolean checkLastName(String lastName) {
		Pattern pattern = Pattern.compile("^([A-Z]{1}+)[A-Za-z]{2,}$");
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}
/*
 * creating method for validation of mail
 * pattern is as per rule given in assignment
 * returning matcher value 
 */
	public boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile("^([a-zA-Z\\.]+)([a-zA-Z0-9\\.]+)@([a-zA-Z0-9\\._]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
/*
 * creating number validation method
 * pattern is first two numbers for country code & then 10 numbers from 0-9
 * returning matcher value
 */
	public boolean checkNumber(String number) {
		Pattern pattern = Pattern.compile("^([0-9]{2}+)[ ]([6-9]{1,1}+)([0-9]{9,9})$");
		Matcher matcher = pattern.matcher(number);
		return matcher.matches();
	}

}
