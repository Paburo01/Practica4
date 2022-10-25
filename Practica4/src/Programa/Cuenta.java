package Programa;

import java.util.List;

public class Cuenta {
	String numero;
	String titular;
	Double saldo;
	List <Movimiento> mMovimientos; 
	
	public Cuenta(String nom, String tit, Double sal){
		
		this.titular=nom;
		this.saldo=sal;
		this.numero=tit;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public List<Movimiento> getmMovimientos() {
		return mMovimientos;
	}

	public void setmMovimientos(List<Movimiento> mMovimientos) {
		this.mMovimientos = mMovimientos;
	}
	
	public double ingreso(double cant) throws Exception {
		if(cant <= 0) {
			throw new Exception("No se puede ingresar un valor igual o menor a 0");
		}
		
		saldo+=cant;
		return saldo;
	}

	public double reintegro(double cant) throws Exception {
		if(cant <= 0) {
			throw new Exception("No se puede retirar un valor igual o menor a 0");
		}
		if(saldo>=cant) {
			saldo-=cant;
		}else {
			throw new Exception("No hay saldo suficiente");
		}
		return saldo;
	}
}
