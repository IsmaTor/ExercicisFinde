package Ejerci.Jason;

import java.util.ArrayList;

public class Productes {
	// Atributs
	private String nomProductes = "";
	private ArrayList<Expenedora> maqExp = new ArrayList<Expenedora>();
	// constructor
	public Productes(String nomProductes) {
		this.nomProductes = nomProductes;
	}

	// Getters
	public String getNomProductes() {
		return nomProductes;
	}

	// Setters
	public void setNomProductes(String nomProductes) {
		this.nomProductes = nomProductes;
	}

	// ArrayList getter
	public ArrayList<Expenedora> getExpen() {
		return this.maqExp;
	}

	// métodos generales
	public void InsertaCliente(Expenedora maqExpenedora) {
		this.maqExp.add(maqExpenedora);
		System.out.println();
	}

	public void mostraNomMaqExpenedora() {
		for (Expenedora maqExpenedora : maqExp) {
			System.out.println(maqExpenedora.getNomExpen());
		}
	}

}
