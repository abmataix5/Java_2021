package MODULE.USERS.UTILS;

import CLASSES.singleton;
import MODULE.USERS.CLASSES.user;

public class dummies_users {
	
	private static final int long_dummies = 3;

	private static String[] username_ADMIN = { "admin1", "admin2", "admin3" };
	private static String[] email_ADMIN = { "admin1@gmail.com", "admin2@gmail.com", "admin3@gmail.com" };
	private static String[] password_ADMIN = { "admin1", "admin2", "admin3" };
	private static String[] type_ADMIN = { "Administrador", "Administrador", "Administrador" };

	public static void carregarUsers() {
		int longitud = 3;

		carregarDummies_users(longitud);

	}

	public static void carregarDummies_users(int longitud) {
		user us = null;

		for (int i = 0; i < long_dummies; i++) {

			us = new user(username_ADMIN[i], password_ADMIN[i], email_ADMIN[i], type_ADMIN[i]);
			singleton.users_app.add((user) us);
		}
	}

}
