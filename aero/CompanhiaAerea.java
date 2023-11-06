package aero;

public class CompanhiaAerea {
	private String codCompan;
	private String nomeCompanhia;
	
	public CompanhiaAerea(String codCompan,String nomeCompanhia) {
		this.setCodCompan(codCompan);
		this.setNomeCompanhia(nomeCompanhia);
	}

	private String getCodCompan() {
		return codCompan;
	}

	private void setCodCompan(String codCompan) {
		this.codCompan = codCompan;
	}

	private String getNomeCompanhia() {
		return nomeCompanhia;
	}

	private void setNomeCompanhia(String nomeCompanhia) {
		this.nomeCompanhia = nomeCompanhia;
	}

	@Override
	public String toString() {
		return "CompanhiaAerea [codCompan=" + codCompan + ", nomeCompanhia=" + nomeCompanhia + "]";
	}
	
	
}
