package UTILS_APP;


import CLASSES.singleton;
import MODULE.ROOM.CLASSES.doble;
import MODULE.ROOM.CLASSES.single;
import MODULE.ROOM.CLASSES.suite;

public class functions_find {

	public static int find_suite(suite suite) {  // función para buscar en el array si existe una habitación suite
	

		for (int i = 0; i <= (singleton.room_suite.size() - 1); i++) {
			
			if((singleton.room_suite.get(i).equals(suite))) {
			
				return i;
			}
		}

		return -1;
			
		
	}
	
	public static int find_doble(doble doble) {  // función para buscar en el array si existe una habitación doble
		for (int i = 0; i <= (singleton.room_doble.size() - 1); i++) {
			
			if((singleton.room_doble.get(i).equals(doble)))
			
				return i;
		}
			return -1;
		
	}
	
	public static int find_single(single single) {  // función para buscar en el array si existe una habitación single
		
		for (int i = 0; i <= (singleton.room_single.size() - 1); i++) {
			
			if((singleton.room_single.get(i).equals(single)))
			
				return i;
		}
			return -1;
			
		
	}
}
