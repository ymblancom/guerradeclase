package Com.curso.java.ejercicioGuerra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class VehiculoDeGuerra implements Tripulable {
	// implementar interfaces
	
	private int puntosV;
	private int ataque;
	private int defensa;
	private String nombre;
	private List<Guerrero> guerros =new ArrayList();;
	public VehiculoDeGuerra(int puntosV, int ataque, int defensa, String nombre, List<Guerrero> guerros) {
		super();
		this.puntosV = puntosV;
		this.ataque = ataque;
		this.defensa = defensa;
		this.nombre = nombre;
		this.guerros = guerros;
	}
	public int getPuntosV() {
		return puntosV;
	}
//	public void setPuntosV(int puntosV) {
	//	this.puntosV = puntosV;
	//}
	public int getAtaque() {
		return ataque;
	//}
	//public void setAtaque(int ataque) {
	//	this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	//}
	//public void setDefensa(int defensa) {
	//	this.defensa = defensa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Guerrero> getGuerros() {
		return guerros;
	}
	public void setGuerros(List<Guerrero> guerros) {
		this.guerros = guerros;
	}

	
	public void subirGuerrero() {
	
		
		
		
		
	//	if (guerros.size()<10) {
	//		System.out.println("no se pueden subir  los guerreros a la naveguerrera");

	
	}
	@Override
	public int atacar() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int defender() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
