package CLASSES.IDIOMA;

import CLASSES.config;
import UTILS_APP.functions_menus;

public class functions_config {
	

	public static String language (config config) {
		String languageS="";
		String [] menu_language = { "English", "Español" };
		int menu = 0;
		
		menu = functions_menus.menu_botones(menu_language, "Selecciona un idioma","Cambiar idioma");
		
		switch (menu) {
			case 0:
				languageS = "en";
				break;
			case 1:
				languageS = "es";
				break;
		}
		return languageS;
	}
	
	public static String date (config config) {
		String date="";
		String [] menu_date = { "dd/mm/yyyy", "dd-mm-yyyy", "yyyy/mm/dd", "yyyy-mm-dd" };
		int menu = 0;
		
		menu = functions_menus.menu_botones(menu_date, "FORMATO FECHA", "FORMATO");
		
		switch (menu) {
			case 0:
				date = "dd/mm/yyyy";
				break;
			case 1:
				date = "dd-mm-yyyy";
				break;
			case 2:
				date = "yyyy/mm/dd";
				break;
			case 3:
				date = "yyyy-mm-dd";
				break;
		}
		return date;
	}
	
	

}
