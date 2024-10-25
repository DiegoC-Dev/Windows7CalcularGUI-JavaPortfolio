package utilities;

import java.awt.Color;
import java.awt.Font;

public class Utilities {
	public Utilities() {
		
	}
	public static Color mainColor() {
//		return Color.LIGHT_GRAY;
//		return  Integer.parseInt("FF7B7B",  16);
		return new Color(208, 225, 243);
//		return new Color(193, 213, 232);
	}
	public static Color whaitColor() {
		return Color.white;
	}
	public static Color blueLetter() {
		return new Color(30, 57, 91);
	}
	public static Color grayLetter() {
		return Color.gray;
	}
	public static Font veryLargeLetter() {
		return new Font("Gresa", 0, 20);
	}
	public static Font bigLetter() {
		return new Font("Gresa", 0, 15);
	}
	public static Font screenLetter() {
		return new Font("Gresa", 0, 20);
	}
	public static Font smallLetter() {
		return new Font("Gresa", 0, 10);
	}
	public static Font mediumLetter() {
		return new Font("Gresa", 0, 11);
	}
	public static int spacing() {
		return 3;
	}
	public static int spacing2() {
		return 8;
	}
}
