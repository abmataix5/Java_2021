package MODULE.ROOM.UTILS;

import javax.swing.JOptionPane;

import CLASSES.singleton;
import MODULE.ROOM.CLASSES.doble;
import MODULE.ROOM.CLASSES.single;
import MODULE.ROOM.CLASSES.suite;
import UTILS_APP.functions_find;
import UTILS_APP.functions_room;



public class functions_update {

	
	public static void update_suite() {

		suite suite1 = null;
		int position = -1;

		if (singleton.room_suite.isEmpty()) {
			JOptionPane.showMessageDialog(null, "ERROR");
		} else {
			position = -1;
			suite1 = functions_room.inster_primarykey_suite();
			position = functions_find.find_suite(suite1);
		}
		if (position != -1) {
			suite1 = singleton.room_suite.get(position);
			functions_room.update_room(suite1);
			singleton.room_suite.set(position, suite1);

		} else {

			JOptionPane.showMessageDialog(null, "NO EXISTE");
		}

	}
	
	
	public static void update_doble() {

		doble doble1 = null;
		int position = -1;

		if (singleton.room_suite.isEmpty()) {
			JOptionPane.showMessageDialog(null, "ERROR");
		} else {
			position = -1;
			doble1 = functions_room.inster_primarykey_doble();
			position = functions_find.find_doble(doble1);
		}
		if (position != -1) {
			doble1 = singleton.room_doble.get(position);
			functions_room.update_room(doble1);
			singleton.room_doble.set(position, doble1);

		} else {

			JOptionPane.showMessageDialog(null, "NO EXISTE");
		}

	}
	
	public static void update_single() {

		single single1 = null;
		int position = -1;

		if (singleton.room_single.isEmpty()) {
			JOptionPane.showMessageDialog(null, "ERROR");
		} else {
			position = -1;
			single1 = functions_room.inster_primarykey_single();
			position = functions_find.find_single(single1);
		}
		if (position != -1) {
			single1 = singleton.room_single.get(position);
			functions_room.update_room(single1);
			singleton.room_single.set(position, single1);

		} else {

			JOptionPane.showMessageDialog(null, "NO EXISTE");
		}

	}
	
}
