package MODULE.ROOM.ORDER;

import java.util.Comparator;

import MODULE.ROOM.CLASSES.room;


public class order_precio implements Comparator<room>  {

	public int compare(room u1, room u2) {
		if (((room) u1).getPreu() > (((room) u2)).getPreu())
			return 1;
		if (((room) u1).getPreu() < (((room) u2)).getPreu())
			return -1;

		return 0;
	}
}
