package MODULE.USERS.UTILS;

import javax.swing.JOptionPane;

import CLASSES.singleton;
import MODULE.USERS.CLASSES.user;


public class create_user {
	
	public static void create_usernormal() {
		int location = -1;
		user new_user = null;

		new_user = functions_users.pedir_username();
		//
		System.out.println(new_user);
		location = find_user.find_users(new_user);
		System.out.println(location);
		//
		if (location != -1) {
			///
			JOptionPane.showMessageDialog(null, "No puedes registrarte");
		} else {
			///
			new_user = (user) functions_users.pide_normal();

			//
			singleton.users_app.add(new_user);
			///
		}

	}

	public static void create_useradmin() {
		int location = -1;
		user new_admin = null;

		new_admin = functions_users.pedir_username();
		//
//		System.out.println(new_admin);
		location = find_user.find_users(new_admin);
//		System.out.println(location);
		//
		if (location != -1) {
			///
			JOptionPane.showMessageDialog(null, "No puedes registrarte");
		} else {
			///
			new_admin = (user) functions_users.pide_admin();
      System.out.print(new_admin);
			//
			singleton.users_app.add(new_admin);
			///
		}

	}

}
