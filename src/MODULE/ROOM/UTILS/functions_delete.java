package MODULE.ROOM.UTILS;

import javax.swing.JOptionPane;


import CLASSES.singleton;
import MODULE.ROOM.CLASSES.doble;
import MODULE.ROOM.CLASSES.single;
import MODULE.ROOM.CLASSES.suite;
import UTILS_APP.functions_menus;
import UTILS_APP.functions_room;

public class functions_delete {

	
	
	public static void delete_suite() {
		int position = -1;
		suite suite1 = null;
        int menu_op = 0;
		
		menu_op = functions_menus.menu_delete("DELETE", "DELETE");
		
		switch(menu_op) {
		
		case 0:{
			
				if (singleton.room_suite.isEmpty()) {
					JOptionPane.showMessageDialog(null, "ERROR");
				} else {
		
					position = -1;
					suite1 = functions_room.inster_primarykey_suite();
					position = UTILS_APP.functions_find.find_suite(suite1);
					
						if (position != -1) {
							singleton.room_suite.remove(position);
							JOptionPane.showMessageDialog(null, "Eliminado con éxito");
						} else {
							JOptionPane.showMessageDialog(null, "ERROR");
						}
		
				}
		}
		
		break;
		
		case 1: {
			
			if (singleton.room_suite.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Ya no existe ningúna suite");
			}else {
				singleton.room_suite.clear();
			}
		
		}
	}
		
	}
	
	
	
	
	
	
	
	
	public static void delete_doble() {
		int position = -1;
		doble doble1 = null;
        int menu_op = 0;
		
		menu_op = functions_menus.menu_delete("Borrar todo o solo una habitación?", "DELETE");
		
		switch(menu_op) {
		
		case 0:{ //DELETE ONE
			
				if (singleton.room_doble.isEmpty()) {
					JOptionPane.showMessageDialog(null, "ERROR");
				} else {
		
					position = -1;
					doble1 = functions_room.inster_primarykey_doble();
					position = UTILS_APP.functions_find.find_doble(doble1);
					
						if (position != -1) {
							singleton.room_doble.remove(position);
							JOptionPane.showMessageDialog(null, "Eliminado con éxito");
						} else {
							JOptionPane.showMessageDialog(null, "ERROR");
						}
		
				}
		}
		
		break;
		
		case 1: { // DELETE ALL
			
			if (singleton.room_doble.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Ya no existe ningúna doble");
			}else {
				singleton.room_doble.clear();
			}
		
		}
	}
		
	}
	
	
	public static void delete_single() {
		int position = -1;
		single single1 = null;
        int menu_op = 0;
		
		menu_op = functions_menus.menu_delete("Borrar todo o solo una habitación?", "DELETE");
		
		switch(menu_op) {
		
		case 0:{ //DELETE ONE
			
				if (singleton.room_single.isEmpty()) {
					JOptionPane.showMessageDialog(null, "ERROR");
				} else {
		
					position = -1;
					single1 = functions_room.inster_primarykey_single();
					position = UTILS_APP.functions_find.find_single(single1);
					
						if (position != -1) {
							singleton.room_single.remove(position);
							JOptionPane.showMessageDialog(null, "Eliminado con éxito");
						} else {
							JOptionPane.showMessageDialog(null, "ERROR");
						}
		
				}
		}
		
		break;
		
		case 1: { // DELETE ALL
			
			if (singleton.room_single.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Ya no existe ningúna single");
			}else {
				singleton.room_single.clear();
			}
		
		}
	}
		
	}
}
