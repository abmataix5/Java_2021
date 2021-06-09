package MODULE.USERS.UTILS;

import javax.swing.JOptionPane;


import CLASSES.singleton;

import MODULE.USERS.CLASSES.user;

public class function_readperfil {

	public static void read_users() {
		user u1 = null;
		int local = -1;
		int menu = 0;

		
	
		if (singleton.users_app.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No existe el usuario");
		} else {
			menu = UTILS_APP.functions_menus.menu_USERS("USUARIOS", "USUARIOS");

			switch (menu) {

			case 0:{

				for (int i = 0; i < singleton.users_app.size(); i++) {
					String cad = "";
					cad = cad + (singleton.users_app.get(i).toString());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;
			}
			case 1:{
				local = -1;
				u1 = functions_users.pedir_username();
				local = find_user.find_users(u1);
				if (local != -1) {
					u1 = singleton.users_app.get(local);
					JOptionPane.showMessageDialog(null, u1.toString());
				} else {
					JOptionPane.showMessageDialog(null, "No existe el usuario");
				}
				break;
			}
			
			}
		} // else
		

	}
	
}
