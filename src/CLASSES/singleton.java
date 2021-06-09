package CLASSES;

import java.util.ArrayList;

import MODULE.ROOM.CLASSES.doble;
import MODULE.ROOM.CLASSES.single;
import MODULE.ROOM.CLASSES.suite;
import MODULE.USERS.CLASSES.user;



public class singleton {
	
	//..........ArraysLists dels dos móduls....//

	public static ArrayList<suite> room_suite; //ArrayList habitaciones suite
	public static ArrayList<doble> room_doble; // ArrayList habitaciones dobles
	public static ArrayList<single> room_single; //ArrayList habitaciones individuales
	public static ArrayList<user> users_app;
	
	
	//.......Claus primaries dels dos móduls....//
	
	public static String num_hab; //Clave primaria rooms
	public static String username;//Clave primaria user
}
