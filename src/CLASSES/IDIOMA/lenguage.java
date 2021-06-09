package CLASSES.IDIOMA;

import CLASSES.config;

public class lenguage {

	public static String message (String valor, config config, int age) {
		String message = "";
		switch (config.getIdioma()) {
			case "en":
				message = english.message(valor);
				if (message == "") {
					message = english_user.message(valor, age);
				}
				break;
			case "es":
				message = español.message(valor);
				if (message == "") {
					message = spanish_user.message(valor, age);
				}
				break;
//			case "val":
//				message = Valencia.message(valor);
//				if (message == "") {
//					message = Valencia_user.message(valor, age);
//				}
//				break;
		}
		return message;
	}

	

	public static String [] menu (String valor, config config, String s) {
		String [] menu = null;
		switch (config.getIdioma()) {
			case "en":
				menu = english.menu(valor, s);
				if (menu == null) {
					menu = english.menu(valor, s);
				}
				break;
			case "es":
				menu = español.menu(valor, s);
				if (menu == null) {
					menu = español.menu(valor, s);
				}
				break;

		}
		return menu;
	}
}
