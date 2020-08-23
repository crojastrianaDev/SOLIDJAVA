package Logica;

abstract public class Simpson {
	private String camiseta;
	private String pantalon;
	public Simpson() {
		// TODO Auto-generated constructor stub
	}
	public Simpson(String camiseta, String pantalon) {
		this.camiseta = camiseta;
        this.pantalon = pantalon;
	}
	
	public String getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(String camiseta) {
		this.camiseta = camiseta;
	}
	public String getPantalon() {
		return pantalon;
	}
	public void setPantalon(String pantalon) {
		this.pantalon = pantalon;
	}
	
	abstract void dibujar();
	

}
