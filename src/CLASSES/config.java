package CLASSES;

public class config {

	
	private String idioma;
	private String date;
	private char moneda;
	
	
	public config(String idioma, String date, char moneda) {
		super();
		this.idioma = idioma;
		this.date = date;
		this.moneda = moneda;
	}
	
	public config () {
		this.idioma = "en";
		this.date = "dd/mm/yyyy";
		this.moneda = '€';
	}



	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public char getMoneda() {
		return moneda;
	}


	public void setMoneda(char moneda) {
		this.moneda = moneda;
	}


	@Override
	public String toString() {
		return "config [idioma=" + idioma + ", date=" + date + ", moneda=" + moneda + "]";
	}
	
	
	
	
	
}
