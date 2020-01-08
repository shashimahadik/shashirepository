package test;

import com.jbk.validation.ValidationService;

public class ValidationServiceTest {
	public static void main(String[] args) {
		ValidationService service = new ValidationService();
		//test case 1
		System.out.println(service.isBlankorEmpty(""));
		//test case 2
		System.out.println(service.isBlankorEmpty(null));
		//test case 3
		System.out.println(service.isBlankorEmpty(" "));
	
	
	System.out.println(ValidationService.isLengthMoreThanSpecified("kiran", 5));
	System.out.println(!ValidationService.isLengthMoreThanSpecified("kiran", 6));
	System.out.println(ValidationService.isLengthMoreThanSpecified("javabykiran", 11));
	System.out.println(!ValidationService.isLengthMoreThanSpecified("", 11));
	System.out.println(!ValidationService.isLengthMoreThanSpecified("  ", 11));
	System.out.println(!ValidationService.isLengthMoreThanSpecified(null, 5));
	System.out.println(!ValidationService.isLengthMoreThanSpecified("kiran", 0));
	System.out.println(ValidationService.isLengthMoreThanSpecified(" kiran ", 5));
	
	
	
	
	}

}
