package MODULE.ROOM.ORDER;

import java.util.Comparator;

import MODULE.ROOM.CLASSES.room;


public class order_fechaentrada implements Comparator<room> {

	public int compare(room u1, room u2) {
		return ((room) u1).getFecha_entrada().comparar_fechas(((room) u2).getFecha_entrada());
	}
}
