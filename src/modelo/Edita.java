package modelo;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Edita {
	protected String dataEdita, codigoUsuario, codigoFlashcard;
	
	public Edita(String codigoUsuario, String codigoFlashcard) {
		this.codigoUsuario = codigoUsuario;
		this.codigoFlashcard = codigoFlashcard;
		this.dataEdita = java.time.Instant.now().toString();
	}

	public String getDataEdita() {
		return dataEdita;
	}

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getCodigoFlashcard() {
		return codigoFlashcard;
	}

	public void setCodigoFlashcard(String codigoFlashcard) {
		this.codigoFlashcard = codigoFlashcard;
	}
	
}
