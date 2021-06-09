package UTILS_APP;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class functions_regexpre {
	

	private static final String Expr_numhab = "[0-9]+[-][A-Z] *";
	private static final String Expr_preu =  "[0-9]+";
	private static final String Expr_fechas= "[0-9]{2}[/][0-9]{2}[/][0-9]{4}";
	private static final String Expr_tipo = "^[a-zA-Z\\s]*$";
	private static final String Expr_desayuno = "^[a-zA-Z\\s]*$";
	private static final String Expr_minibar = "^[a-zA-Z\\s]*$";
	private static final String Expr_email = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	
	public static boolean val_numhab(String num_hab) {

		Pattern pattern = Pattern.compile(Expr_numhab);
		Matcher matcher = pattern.matcher(num_hab);

		if (matcher.matches()) {
			return true;
		}
		return false;

	}
	
	public static boolean val_precio(String preu) {

		Pattern pattern = Pattern.compile(Expr_preu);
		Matcher matcher = pattern.matcher(preu);

		if (matcher.matches()) {
			return true;
		}
		return false;

	}
	
	public static boolean val_fecha(String fechas) {

		Pattern pattern = Pattern.compile(Expr_fechas);
		Matcher matcher = pattern.matcher(fechas);

		if (matcher.matches()) {
			return true;
		}
		return false;

	}
	
	public static boolean val_type(String type) {

		Pattern pattern = Pattern.compile(Expr_tipo);
		Matcher matcher = pattern.matcher(type);

		if (matcher.matches()) {
			return true;
		}
		return false;

	}
	
	public static boolean val_desayuno(String desayuno) {

		Pattern pattern = Pattern.compile(Expr_desayuno);
		Matcher matcher = pattern.matcher(desayuno);

		if (matcher.matches()) {
			return true;
		}
		return false;

	}
	
	
	public static boolean val_minibar(String minibar) {

		Pattern pattern = Pattern.compile(Expr_minibar);
		Matcher matcher = pattern.matcher(minibar);

		if (matcher.matches()) {
			return true;
		}
		return false;

	}
	
	public static boolean val_email(String email) {

		Pattern pattern = Pattern.compile(Expr_email);
		Matcher matcher = pattern.matcher(email);

		if (matcher.matches()) {
			return true;
		}
		return false;

	}

}
