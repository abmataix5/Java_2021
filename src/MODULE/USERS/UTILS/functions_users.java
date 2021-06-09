package MODULE.USERS.UTILS;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


import CLASSES.singleton;
import MODULE.ROOM.UTILS.functions_data;
import MODULE.USERS.CLASSES.user;
import UTILS_APP.functions_menus;


public class functions_users {

	
	public static user pide_normal() {
		String username;
		String password;
		String email;
		String type;
		JPasswordField input_contra = new JPasswordField();
		Object[] botones = { "Registrarse" };
		Object[] inputs = { "Contraseña :", input_contra };

		username = singleton.username;
		JOptionPane.showOptionDialog(null, inputs, "CONTRASEÑA :", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, botones, botones);
		email = functions_data.pedir_email();
		type = functions_menus.menu_R("Tipo de usuario :", "REGISTER");

		password = new String(input_contra.getPassword());
		return new user(username, password, email, type);

	}
	
	
	public static user pedir_username() {

		singleton.username = UTILS_APP.functions_valides.valida_string("Username :", "NOMBRE DE USUARIO");
		return new user(singleton.username);

	}
	
	
	public static user pide_admin() {
		String username;
		String password;
		String email;
		String type;

		username = singleton.username;
		password = UTILS_APP.functions_valides.valida_string("Password :", "PASSWORD DE USUARIO");
		email = functions_data.pedir_email();
		type =  functions_menus.menu_R("Tipo de usuario", "USUARIO");
//		System.out.print(type + "tipooooooo");

		return new user(username, password, email, type);

	}
}
