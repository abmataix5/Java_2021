package MODULE.ROOM.UTILS;

import javax.swing.JOptionPane;

import CLASSES.singleton;
import MODULE.ROOM.CLASSES.doble;
import MODULE.ROOM.CLASSES.single;
import MODULE.ROOM.CLASSES.suite;
import UTILS_APP.functions_find;
import UTILS_APP.functions_room;


public class functions_create {

	public static void create_suite() {
		int posi_array = -1;
		suite suite1 = null;

		suite1 = functions_room.inster_primarykey_suite();
		//
		System.out.println(suite1 + " Primary key find");
		posi_array = functions_find.find_suite(suite1);
		System.out.println(posi_array);
		//
		if (posi_array != -1) {
			///
			JOptionPane.showMessageDialog(null, "Esta habitación ya esta reservada, seleccione otra");
		} else {
			///
			suite1 = (suite) functions_room.all_data_suite();

			//
			singleton.room_suite.add(suite1);
			///
		}

	}
	
	
	public static void create_doble() {
		int posi_array = -1;
		doble doble1 = null;

		doble1 = functions_room.inster_primarykey_doble();
		//
		System.out.println(doble1);
		posi_array = functions_find.find_doble(doble1);
		System.out.println(posi_array);
		//
		if (posi_array != -1) {
			///
			JOptionPane.showMessageDialog(null, "No puedes crear-lo");
		} else {
			///
			doble1 = (doble) functions_room.all_data_doble();

			//
			singleton.room_doble.add(doble1);
			///
		}

	}
	
	public static void create_single() {
		int posi_array = -1;
		single single1 = null;

		single1 = functions_room.inster_primarykey_single();
		System.out.println(single1);
		posi_array = functions_find.find_single(single1);
		System.out.println(posi_array);
		//
		if (posi_array != -1) {
			///
			JOptionPane.showMessageDialog(null, "No puedes crear-lo");
		} else {
			///
			single1 = (single) functions_room.all_data_single();

			//
			singleton.room_single.add(single1);
			///
		}

	}
	
}
