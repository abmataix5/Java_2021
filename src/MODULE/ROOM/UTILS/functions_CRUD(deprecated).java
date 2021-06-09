//package MODULE.ROOM.UTILS;
//
//
//
//import javax.swing.JOptionPane;
//
//import CLASSES.fecha;
//import MODULE.ROOM.CLASSES.doble;
//import MODULE.ROOM.CLASSES.room;
//import MODULE.ROOM.CLASSES.single;
//import MODULE.ROOM.CLASSES.suite;
//import UTILS_APP.functions_menus;
//import UTILS_APP.functions_valides;
//
//public class functions_CRUD {
//
//	//.........Funcio create per a les tres filles......//
//	
//	public static room create_room(int op) {
//		
//        room room1 = null;
//		//Madre//
//		String num_hab;
//		String type;
//		String preu;
//		fecha fecha_entrada;
//		fecha fecha_salida;
//		
//		//single//
//		String cama_grande;
//		String fecha_cita_sorpresa;
//		//suite//
//		String spa;
//		String welcome_gift;
//		 String minibar;
//		 String servicio_hab;
//		 String fechafin_spa;
//		 //doble//
//		 String cama_matrimonio;
//		 String desayuno;
//		 fecha fecha_show_pareja;
//		
//		if(op == 0) { //Suite
//			
//			num_hab = functions_data.pedir_numhab();
//			type = functions_data.pedir_type();
//			fecha_entrada = functions_fecharoom.pedir_fechaini();
//			fecha_salida = functions_fecharoom.pedir_fechafin(fecha_entrada);
//			spa = functions_menus.menu_combo("Inculye SPA?", "SPA");
//			welcome_gift = functions_menus.menu_combo("Tiene regalo de bienvenida?", "WELCOME GIFT");
//			servicio_hab = functions_valides.valida_string("SERVICIO HABITACIONES", "SERVICIO");
//			minibar = functions_valides.valida_string("MINIBAR:", "MINIBAR");
//			fechafin_spa = functions_data.pedir_fecha();
//		
//			
//			 room1  = new suite(num_hab,type,fecha_entrada,fecha_salida,spa,welcome_gift,minibar,servicio_hab,fechafin_spa);
//			
//			
//		}else if(op == 1) { // Double
//			
//			num_hab = functions_data.pedir_numhab();
//			type = functions_data.pedir_type();
//			fecha_entrada = functions_fecharoom.pedir_fechaini();
//			fecha_salida = functions_fecharoom.pedir_fechafin(fecha_entrada);
//			cama_matrimonio = functions_menus.menu_combo("Cama de matrimonio?", "SPA");
//			fecha_show_pareja =  functions_fecharoom.fecha_show(fecha_entrada, fecha_salida);
//			desayuno = functions_data.pedir_desayuno();
//			
//			room1 = new doble(num_hab,type,fecha_entrada,fecha_salida,cama_matrimonio,fecha_show_pareja,desayuno);
//			
//			
//
//			
//		}else if( op == 2) { //Single
//			
//			num_hab = functions_data.pedir_numhab();
//			type = functions_data.pedir_type();
//			fecha_entrada = functions_fecharoom.pedir_fechaini();
//			fecha_salida = functions_fecharoom.pedir_fechafin(fecha_entrada);
//			cama_grande = functions_menus.menu_combo("Inculye cama grande", "SPA");
//			fecha_cita_sorpresa =  functions_data.pedir_fecha();
//			
//			room1 = new single(num_hab,type,fecha_entrada,fecha_salida,cama_grande,fecha_cita_sorpresa);
//			
//						
//		}
//		
//		
//		return room1;
//		
//		
//		
//	}
//	
//	
//	
//	public static void  read_room(room room1) {
//		
//		String habitacion = "";
//		
//		if(room1 != null) {
//			
//			if(room1 instanceof suite) {
//				
//				habitacion = ((suite)room1).toString();
//				JOptionPane.showMessageDialog(null, habitacion);
//			}
//			
//			if(room1 instanceof doble) {
//				habitacion = ((doble)room1).toString();
//				JOptionPane.showMessageDialog(null, habitacion);
//			}
//			if(room1 instanceof single) {
//				habitacion = ((single)room1).toString();
//				JOptionPane.showMessageDialog(null, habitacion);
//			}
//			
//		}else {
//			JOptionPane.showMessageDialog(null, "No existe ningún viaje en la base de datos");
//		}
//	
//		
//		
//	}
//	
//	
//	public static void update_room(room room1) {
//		
//		String [] suite_options = {"Numero habitación","Tipo","Fecha entrada","Fecha salida","SPA","Welcome Gift","Minibar","Servicio Habitaciones","Fecha fin spa"};
//		String [] doble_options = {"Numero habitación","Tipo","Fecha entrada","Fecha salida","Cama matrimonio","Fecha show para parejas"," Desyuno"};
//		String [] single_options = {"Numero habitación","Tipo","Fecha entrada","Fecha salida","Cama grande","Fecha cita sorpresa"};
//		int suite_op,doble_op,single_op = 0;
//
//	if(room1 instanceof suite) {
//		
//		suite_op = functions_menus.menu_botones(suite_options, "Que dato quiere cambiar?", "UPDATE");
//		
//		switch(suite_op) {
//		
//			case 0:{
//				((suite)room1).setNum_hab(functions_data.pedir_numhab());
//			}
//			
//			break;
//			
//			case 1:{
//				((suite)room1).setType(functions_data.pedir_type());
//			}
//			
//			break;
//			
//
//			
//			case 2:{
//				((suite)room1).setFecha_entrada(functions_fecharoom.update_fini(((suite)room1).getFecha_salida()));
//			}
//			
//			break;
//			
//			case 3:{
//				((suite)room1).setFecha_salida(functions_fecharoom.pedir_fechafin(((suite)room1).getFecha_entrada()));
//			}
//			
//			break;
//			
//			case 4:{
//				((suite)room1).setSpa(functions_menus.menu_combo("Inculye SPA?", "SPA"));
//			}
//			
//			break;
//			
//			case 5:{
//				((suite)room1).setWelcome_gift(functions_menus.menu_combo("Inculye REGALO ED BIENVENIDA?", "SPA"));
//			}
//			
//			break;
//			
//			case 6:{
//				((suite)room1).setMinibar(functions_data.pedir_minibar());
//			}
//			
//			break;
//			
//			case 7:{
//				((suite)room1).setServicio_hab(functions_menus.menu_combo("Inculye SERVICIO DE HABITACIONES?", "SPA"));
//			}
//			
//			break;
//			case 8:{
//				((suite)room1).setFechafin_spa(functions_data.pedir_fecha());
//			}
//			
//			break;
//		}
//		
//		
//		
//	}
//	
//	if(room1 instanceof doble) {
//		
//		doble_op = functions_menus.menu_botones(doble_options, "Que dato quiere actualizar?", "UPDATE");
//			
//		switch(doble_op) {
//		
//				case 0:{
//					((doble)room1).setNum_hab(functions_data.pedir_numhab());
//				}
//				
//				break;
//				
//				case 1:{
//					((doble)room1).setType(functions_data.pedir_type());
//				}
//				
//				break;
//				
//			
//			
//				
//				case 2:{
//					((doble)room1).setFecha_entrada(functions_fecharoom.pedir_fechaini());
//				}
//				
//				break;
//				
//				case 3:{
//					((doble)room1).setFecha_salida(functions_fecharoom.pedir_fechafin(((doble)room1).getFecha_entrada()));
//				}
//				
//				break;
//				
//				case 4:{
//					((doble)room1).setCama_matrimonio(functions_menus.menu_combo("Tiene cama de matrimonio?", "MATRIMONIO"));
//				}
//				
//				break;
//				
//				case 5:{
//					((doble)room1).setFecha_show_pareja(functions_fecharoom.fecha_show(((doble)room1).getFecha_entrada(), ((doble)room1).getFecha_salida()));
//				}
//				
//				break;
//				
//				case 6:{
//					((doble)room1).setDesayuno(functions_data.pedir_desayuno());
//				}
//				
//				break;
//	
//	
//	    }
//			
//		}
//	
//	if(room1 instanceof single) {
//		
//		single_op = functions_menus.menu_botones(single_options, "Que dato quiere actualizar?", "UPDATE");
//		
//		switch(single_op) {
//		
//				case 0:{
//					((single)room1).setNum_hab(functions_data.pedir_numhab());
//				}
//				
//				break;
//				
//				case 1:{
//					((single)room1).setType(functions_data.pedir_type());
//				}
//				
//				break;
//				
//		
//				
//				case 2:{
//					((single)room1).setFecha_entrada(functions_fecharoom.pedir_fechaini());
//				}
//				
//				break;
//				
//				case 3:{
//					((single)room1).setFecha_salida(functions_fecharoom.pedir_fechafin(((single)room1).getFecha_entrada()));
//				}
//				
//				break;
//				
//				case 4:{
//					((single)room1).setCama_grande(functions_menus.menu_combo("Tiene cama grande?", "SPA"));
//				}
//				
//				break;
//				
//				case 5:{
//					((single)room1).setFecha_cita_sorpresa(functions_data.pedir_fecha());
//				}
//				
//				break;
//					
//	
//	    }
//		
//	}
//		
//	}
//	
//	public static room delete_room(room room1) {
//		
//		if(room1 != null) {
//			 room1 = null;		
//		}else {
//			JOptionPane.showMessageDialog(null, "No existe ninguna habitación en la BD");				
//		}
//	
//		 
//		return room1;
//	}
//	
//	
//	
//}
