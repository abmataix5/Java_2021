package MODULE.ROOM.CLASSES;

import CLASSES.fecha;

public class suite extends room {
String cad = "";
	private String spa;
	private String welcome_gift;
	private String minibar;
	private String servicio_hab;
    private fecha fechafin_spa; // 2 dias despues del ingreso en el hotel;

	
	//......Constructor.....//
	
	public suite(String num_hab, String type,  fecha fecha_entrada, fecha fecha_salida, String jacuzzi,
			String welcome_gift, String minibar, String servicio_hab,fecha fechafin_spa) {
		super(num_hab, type, fecha_entrada, fecha_salida);
		
		super.setFecha_entrada(fecha_entrada);
		super.setFecha_salida(fecha_salida);
		this.spa = jacuzzi;
		this.welcome_gift = welcome_gift;
		this.minibar = minibar;
		this.servicio_hab = servicio_hab;
		this.fechafin_spa = fechafin_spa;
	}
	
	//.....Constructor buit...//
	
	public suite() {
		
	}
	
	//....Contructor clau primaria...//
	
	public suite(String num_hab) {
		
		super(num_hab);
		
	}

	//.....Getters and setters.......//
	
	public String getSpa() {
		return spa;
	}


	public void setSpa(String spa) {
		this.spa = spa;
	}

	public String getWelcome_gift() {
		return welcome_gift;
	}

	public void setWelcome_gift(String welcome_gift) {
		this.welcome_gift = welcome_gift;
	}

	public String getMinibar() {
		return minibar;
	}

	public void setMinibar(String minibar) {
		this.minibar = minibar;
	}

	public String getServicio_hab() {
		return servicio_hab;
	}

	public void setServicio_hab(String servicio_hab) {
		this.servicio_hab = servicio_hab;
	}
	
	public fecha getFechafin_spa() {
		return fechafin_spa;
	}

	public void setFechafin_spa(fecha fechafin_spa) {
		this.fechafin_spa = fechafin_spa;
	}

	
	//.......toString.......//
	
	@Override
	public String toString() {
	 cad = ("Numero habitación : " + getNum_hab() + "\n" + "Tipo :" + getType() + "\n" + "Precio : " + getPreu() + "\n" + "Fecha entrada : "+ getFecha_entrada() + "\n" + "Fecha salida : " + getFecha_salida() + "\n" + "spa : " + getSpa() + "\n" + "Fecha fin del spa : " + getFechafin_spa()+ "\n" + "Welcome Gift : " + getWelcome_gift()+ "\n"  + " Minibar : " + getMinibar() + "\n" + "Servicio habitaciones : " + getServicio_hab());
		return cad;
	}

	@Override
	public int compareTo(room o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	

	
	
	
}
