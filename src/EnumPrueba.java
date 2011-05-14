/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author -DN-
 */
public class EnumPrueba {
	Day day;

	public EnumPrueba(Day day) {
		this.day = day;
	}

	public void tellItLikeItIs() {
		switch (day) {
			case MONDAY: System.out.println("Mondays are bad.");
					     break;

			case FRIDAY: System.out.println("Fridays are better.");
					     break;

			case SATURDAY:
			case SUNDAY: System.out.println("Weekends are best.");
					     break;

			default:	 System.out.println("Midweek days are so-so.");
					     break;
		}
	}

	public static void main(String[] args) {
		EnumPrueba firstDay = new EnumPrueba(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumPrueba thirdDay = new EnumPrueba(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumPrueba fifthDay = new EnumPrueba(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumPrueba sixthDay = new EnumPrueba(Day.SATURDAY);
		sixthDay.tellItLikeItIs();
		EnumPrueba seventhDay = new EnumPrueba(Day.SUNDAY);
		seventhDay.tellItLikeItIs();


	}
}



