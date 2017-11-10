package uebung_3_3;

public class BMI {

	public static void bmiBerechnen(int height, double gewicht, int alter) {
		// TODO Auto-generated method stub
		
		double groesse = height;
		groesse = groesse / 100;
		double bmi = gewicht / (groesse * groesse);
		boolean gender = true;
		//true = männlich
		
		
		if ( gender ) {
			if ( alter >= 0 & alter <= 24 & bmi >= 20 & bmi <= 25) {
			System.out.println("Ihr BMI ist " + bmi + ". Sie sind gesund.");
			 
			}
			else {
				if ( alter >= 0 & alter <= 24 & bmi <= 20) {
				System.out.println("Sie sind leider zu leicht für Ihren BMI. Dieser beträgt: " + bmi + ".");
			
				}
				else {
					if ( alter >= 0 & alter <= 24 & bmi >= 25) {
					System.out.println("Sie sind leider zu schwer für Ihren BMI. Dieser beträgt: " + bmi + ".");
					}
				}
			}
			if ( alter >= 25 & alter <= 34 & bmi >= 21 & bmi <= 26) {
			System.out.println("Ihr BMI ist " + bmi + ". Sie sind gesund.");
				 
			}
			else {
				if ( alter >= 25 & alter <= 34 & bmi <= 21) {
				System.out.println("Sie sind leider zu leicht für Ihren BMI. Dieser beträgt: " + bmi + ".");
			
				}
				else {
					if ( alter >= 25 & alter <= 34 & bmi >= 26) {
					System.out.println("Sie sind leider zu schwer für Ihren BMI. Dieser beträgt: " + bmi + ".");
					}
				}
			}
			if ( alter >= 35 & alter <= 44 & bmi >= 22 & bmi <= 27) {
				System.out.println("Ihr BMI ist " + bmi + ". Sie sind gesund.");
					 
				}
				else {
					if ( alter >= 35 & alter <= 44 & bmi <= 22) {
					System.out.println("Sie sind leider zu leicht für Ihren BMI. Dieser beträgt: " + bmi + ".");
				
					}
					else {
						if ( alter >= 35 & alter <= 44 & bmi >= 27) {
						System.out.println("Sie sind leider zu schwer für Ihren BMI. Dieser beträgt: " + bmi + ".");
						}
					}
				}
			if ( alter >= 45 & alter <= 54 & bmi >= 23 & bmi <= 28) {
				System.out.println("Ihr BMI ist " + bmi + ". Sie sind gesund.");
					 
				}
				else {
					if ( alter >= 45 & alter <= 54 & bmi <= 23) {
					System.out.println("Sie sind leider zu leicht für Ihren BMI. Dieser beträgt: " + bmi + ".");
				
					}
					else {
						if ( alter >= 45 & alter <= 54 & bmi >= 28) {
						System.out.println("Sie sind leider zu schwer für Ihren BMI. Dieser beträgt: " + bmi + ".");
						}
					}
				}
			if ( alter >= 55 & alter <= 64 & bmi >= 24 & bmi <= 29) {
				System.out.println("Ihr BMI ist " + bmi + ". Sie sind gesund.");
					 
				}
				else {
					if ( alter >= 55 & alter <= 64 & bmi <= 24) {
					System.out.println("Sie sind leider zu leicht für Ihren BMI. Dieser beträgt: " + bmi + ".");
				
					}
					else {
						if ( alter >= 55 & alter <= 64 & bmi >= 29) {
						System.out.println("Sie sind leider zu schwer für Ihren BMI. Dieser beträgt: " + bmi + ".");
						}
					}
				}
			if ( alter >= 65 & bmi >= 25 & bmi <= 30) {
				System.out.println("Ihr BMI ist " + bmi + ". Sie sind gesund.");
					 
				}
				else {
					if ( alter >= 65 &  bmi <= 25) {
					System.out.println("Sie sind leider zu leicht für Ihren BMI. Dieser beträgt: " + bmi + ".");
				
					}
					else {
						if ( alter >= 65 & bmi >= 30) {
						System.out.println("Sie sind leider zu schwer für Ihren BMI. Dieser beträgt: " + bmi + ".");
						}
					}
				}
		}
		else {
			if ( alter >= 0 & alter <= 24 & bmi >= 19 & bmi <= 24) {
				System.out.println("Ihr BMI ist " + bmi + ". Sie sind gesund.");
				 
				}
				else {
					if ( alter >= 0 & alter <= 24 & bmi <= 19) {
					System.out.println("Sie sind leider zu leicht für Ihren BMI. Dieser beträgt: " + bmi + ".");
				
					}
					else {
						if ( alter >= 0 & alter <= 24 & bmi >= 24) {
						System.out.println("Sie sind leider zu schwer für Ihren BMI. Dieser beträgt: " + bmi + ".");
						}
					}
				}
			if ( alter >= 25 & alter <= 34 & bmi >= 20 & bmi <= 25) {
				System.out.println("Ihr BMI ist " + bmi + ". Sie sind gesund.");
					 
				}
				else {
					if ( alter >= 25 & alter <= 34 & bmi <= 20) {
					System.out.println("Sie sind leider zu leicht für Ihren BMI. Dieser beträgt: " + bmi + ".");
				
					}
					else {
						if ( alter >= 25 & alter <= 34 & bmi >= 25) {
						System.out.println("Sie sind leider zu schwer für Ihren BMI. Dieser beträgt: " + bmi + ".");
						}
					}
				}
			if ( alter >= 35 & alter <= 44 & bmi >= 21 & bmi <= 26) {
				System.out.println("Ihr BMI ist " + bmi + ". Sie sind gesund.");
					 
				}
				else {
					if ( alter >= 35 & alter <= 44 & bmi <= 21) {
					System.out.println("Sie sind leider zu leicht für Ihren BMI. Dieser beträgt: " + bmi + ".");
				
					}
					else {
						if ( alter >= 35 & alter <= 44 & bmi >= 26) {
						System.out.println("Sie sind leider zu schwer für Ihren BMI. Dieser beträgt: " + bmi + ".");
						}
					}
				}
			if ( alter >= 45 & alter <= 54 & bmi >= 22 & bmi <= 27) {
				System.out.println("Ihr BMI ist " + bmi + ". Sie sind gesund.");
					 
				}
				else {
					if ( alter >= 45 & alter <= 54 & bmi <= 22) {
					System.out.println("Sie sind leider zu leicht für Ihren BMI. Dieser beträgt: " + bmi + ".");
				
					}
					else {
						if ( alter >= 45 & alter <= 54 & bmi >= 27) {
						System.out.println("Sie sind leider zu schwer für Ihren BMI. Dieser beträgt: " + bmi + ".");
						}
					}
				}
			if ( alter >= 55 & alter <= 64 & bmi >= 23 & bmi <= 28) {
				System.out.println("Ihr BMI ist " + bmi + ". Sie sind gesund.");
					 
				}
				else {
					if ( alter >= 55 & alter <= 64 & bmi <= 23) {
					System.out.println("Sie sind leider zu leicht für Ihren BMI. Dieser beträgt: " + bmi + ".");
				
					}
					else {
						if ( alter >= 55 & alter <= 64 & bmi >= 28) {
						System.out.println("Sie sind leider zu schwer für Ihren BMI. Dieser beträgt: " + bmi + ".");
						}
					}
				}
			if ( alter >= 65 & bmi >= 25 & bmi <= 29) {
				System.out.println("Ihr BMI ist " + bmi + ". Sie sind gesund.");
					 
				}
				else {
					if ( alter >= 65 &  bmi <= 24) {
					System.out.println("Sie sind leider zu leicht für Ihren BMI. Dieser beträgt: " + bmi + ".");
				
					}
					else {
						if ( alter >= 65 & bmi >= 29) {
						System.out.println("Sie sind leider zu schwer für Ihren BMI. Dieser beträgt: " + bmi + ".");
						}
					}
				}
			
		}
		if ( alter < 0 ){
			System.out.println("Bitte geben Sie ein gültiges Alter ein.");
		}
		

	}



public static void main (String[] args) {
	bmiBerechnen(190, 85, 60);
	
}
}
