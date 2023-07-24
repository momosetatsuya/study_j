package check;

import constants.Constants;


public class Check {
	
	private String firstName = "百瀬";
	private String lastName = "竜也";
	
	public static void main(String[] args) {
		
		Check check = new Check();
		
		printName(check.firstName, check.lastName);
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		
		pet.introduce();
		
		Pet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		
		robotpet.introduce();	
		
	}
	
	private static void printName(String fstName,String lstName) {
		
		System.out.println("printNameメソッド → " + fstName + lstName);
		
	}

}
