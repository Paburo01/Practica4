package Programa;

public class Movimiento {
	Double importe;
    static enum signo{D,H}
	String detalle;
	signo sig;
	
	public Movimiento(Double importe, signo sig) {
		this.importe=importe;
		this.sig=sig;
	}
}
