package MODULE.ROOM.UTILS;

import javax.swing.JOptionPane;


import CLASSES.singleton;
import MODULE.ROOM.CLASSES.doble;
import MODULE.ROOM.CLASSES.single;
import MODULE.ROOM.CLASSES.suite;
import UTILS_APP.functions_room;

public class functions_read {
	
	
//	public static void read_suite() {
//		
//		
//		
//		if(singleton.room_suite.isEmpty()) { // Comprobamos que exista alguna suite en el arrayList
//			
//			JOptionPane.showMessageDialog(null, "No hay ningúna suite guardada en la BBDD");
//		}else {
//			
//			for (int i = 0; i < singleton.room_suite.size(); i++) {
//				String cad = "";
//				cad = cad + (singleton.room_suite.get(i).toString());
//				JOptionPane.showMessageDialog(null, cad);
//			}
//		}
//		
//	}
	

	
	public static void read_suite() {
		suite suite1 = null;
		int position = -1;
		int menu = 0;

		if (singleton.room_suite.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No existe nigúna habitación en la BBDD");
		} else {
			menu = UTILS_APP.functions_menus.menu_read("Como quiere mostrar los datos?","READ");

			switch (menu) {

			case 0:

				for (int i = 0; i < singleton.room_suite.size(); i++) {
					String cad = "";
					cad = cad + (singleton.room_suite.get(i).toString());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;

			case 1:
				position = -1;
				suite1 = functions_room.inster_primarykey_suite();
				position = UTILS_APP.functions_find.find_suite(suite1);
				if (position != -1) {
					suite1 = singleton.room_suite.get(position);
					JOptionPane.showMessageDialog(null, suite1.toString());
				} else {
					JOptionPane.showMessageDialog(null, "No existe el viaje seleccionado");
				}
				break;

			}
		} // else

	}


	
	
	public static void read_doble() {
		doble doble1 = null;
		int position = -1;
		int menu = 0;

		if (singleton.room_doble.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No existe nigúna habitación en la BBDD");
		} else {
			menu = UTILS_APP.functions_menus.menu_read("Como quiere mostrar los datos?","READ");

			switch (menu) {

			case 0:

				for (int i = 0; i < singleton.room_doble.size(); i++) {
					String cad = "";
					cad = cad + (singleton.room_doble.get(i).toString());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;

			case 1:
				position = -1;
				doble1 = functions_room.inster_primarykey_doble();
				position = UTILS_APP.functions_find.find_doble(doble1);
				if (position != -1) {
					doble1 = singleton.room_doble.get(position);
					JOptionPane.showMessageDialog(null, doble1.toString());
				} else {
					JOptionPane.showMessageDialog(null, "No existe el viaje seleccionado");
				}
				break;

			}
		} // else

	}
	
	
	
	public static void read_single() {
		single single1 = null;
		int position = -1;
		int menu = 0;

		if (singleton.room_single.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No existe nigúna habitación en la BBDD");
		} else {
			menu = UTILS_APP.functions_menus.menu_read("Como quiere mostrar los datos?","READ");

			switch (menu) {

			case 0:

				for (int i = 0; i < singleton.room_single.size(); i++) {
					String cad = "";
					cad = cad + (singleton.room_single.get(i).toString());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;

			case 1:
				position = -1;
				single1 = functions_room.inster_primarykey_single();
				position = UTILS_APP.functions_find.find_single(single1);
				if (position != -1) {
					single1 = singleton.room_single.get(position);
					JOptionPane.showMessageDialog(null, single1.toString());
				} else {
					JOptionPane.showMessageDialog(null, "No existe el viaje seleccionado");
				}
				break;

			}
		} // else

	}
	
}
