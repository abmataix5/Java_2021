package MODULE.USERS.UTILS;


import CLASSES.singleton;
import MODULE.USERS.CLASSES.user;


public class find_user {

	public static int find_users(user user) {

		for (int i = 0; i <= (singleton.users_app.size() - 1); i++) {
			System.out.print(singleton.users_app.size());
			if ((singleton.users_app.get(i)).equals(user))

				return i;

		}

		return -1;

	}

	public static int find_user_name(String user) {

		for (int i = 0; i <= (singleton.users_app.size() - 1); i++) {
			if ((singleton.users_app.get(i).getUsername()).equals(user))

				return i;

		}

		return -1;

	}

	public static boolean find_user_password(int user, String passwd) {

		if ((singleton.users_app.get(user).getPassword()).equals(passwd)) {

			return true;
		}
		return false;

	}

	public static int find_user_tipo(int user) {

		if ((singleton.users_app.get(user).getType()).equals("Administrador")) {
System.out.print(singleton.users_app.get(user).getType());
			return 0;
		}
		return 1;

	}
	
	
}
