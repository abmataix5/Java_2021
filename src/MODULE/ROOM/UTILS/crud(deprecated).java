//package utils;
//
//
//import javax.swing.JOptionPane;
//
//
//import tets.suite;
//
//public class crud {
//	
//	public static void create_suite() {
//		
//		String num_hab;
//		String type;
//		int preu;
//		boolean jacuzzi;
//		boolean welcome_gift;
//		String minibar;
//		String servicio_hab;
//		
//		num_hab = functions_valides.valida_string("Numero de habitación", "HABITACIÓN");
//		type = functions_valides.valida_string("Tipo de habitación", "HABITACIÓN");
//		preu = functions_valides.valida_int("PRECIO DE LA HABITACIÓN", "HABITACIÓN");
//		jacuzzi = functions_menus.valida_boolean("Tiene jacuzzi?", "JACUZZI");
//		welcome_gift = functions_menus.valida_boolean("REGALO DE BIENVENIDA", "WELCOME GIFT");
//		minibar = functions_valides.valida_string("Tiene minibar?", "MINIBAR");
//		servicio_hab = functions_valides.valida_string("Servicio de habitaciones?", "SERVICIO PROPIO");
//		
//		suite suite1 = new suite(num_hab,type,preu,jacuzzi,welcome_gift,minibar,servicio_hab);
//		
//	}
//	public static void read_suite(suite suite1) {
//		
//		
//		JOptionPane.showMessageDialog(null, suite1.toString());
//		
//		
//	}
//	
//	
//	
//	
//	
//	public static void update_suite(suite suite1) {
//		
//		String[] opcio_secondmenu = { "num_hab", "type", "preu", "jacuzzi", "welcome_gift",
//				"minibar", "servicio_hab" };
//		int op_update;
//		
//
//		String num_hab;
//		String type;
//		int preu;
//		boolean jacuzzi;
//		boolean welcome_gift;
//		String minibar;
//		String servicio_hab;
//		
//		if(suite1 != null) {
//			
//			
//			op_update = functions_menus.menu_botones(opcio_secondmenu, "Que quieres editar?", "UDPATE");
//			
//			switch(op_update) {
//			
//			case 0 : {
//				num_hab = functions_valides.valida_string("Numero habitacion", "NUMERO");
//				
//				suite1.setNum_hab(num_hab);
//			}
//			break;
//			
//			case 1 : {
//				
//				type = functions_valides.valida_string("TYPE" , "TYPE");
//				
//				suite1.setType(type);
//						
//					}
//			break;
//			
//			case 2 : {
//				preu = functions_valides.valida_int("Actualizar precio", "Precio");
//				suite1.setPreu(preu);
//			}
//			break;
//			
//			case 3 : {
//				jacuzzi = functions_menus.valida_boolean("Jacuzzi?", "JACUZZI");
//				suite1.setJacuzzi(jacuzzi);
//			}
//			break;
//			
//			case 4 : {
//				welcome_gift = functions_menus.valida_boolean("WELCOME GIFT", "WELCOME");
//				suite1.setWelcome_gift(welcome_gift);
//				
//			}
//			break;
//			
//			case 5 : {
//				minibar = functions_valides.valida_string("MINIBAR", "MINIBAR");
//				suite1.setMinibar(minibar);
//			}
//			break;
//			
//			case 6 : {
//				servicio_hab = functions_valides.valida_string("Servicio habitaciones", "HABITACIONES");
//				suite1.setServicio_hab(servicio_hab);
//				
//			}
//			break;
//	
//			}
//			
//			
//		
//		}else {
//			
//			JOptionPane.showMessageDialog(null, "No existe ninguna habitacion!");
//		}
//		
//		
//	}
//	public static void deltele_suite(suite suite1) {
//		
//		
//		suite1 = null;
//		
//	}
//
//}
