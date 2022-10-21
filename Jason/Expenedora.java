package Ejerci.Jason;

import java.util.ArrayList;

public class Expenedora {
	// atributos
	private String nomExpen;
	private ArrayList<Productes> productes = new ArrayList<Productes>();

	// constructor
	public Expenedora(String nomExpen) {
		this.nomExpen = nomExpen;
	}

	// getters
	public String getNomExpen() {
		return nomExpen;
	}

	public ArrayList<Productes> getProductes() {
		return productes;
	}

	// setters
	public void setNomCliente(String nomExpen) {
		this.nomExpen = nomExpen;
	}

	public void setProductes(ArrayList<Productes> productes) {
		this.productes = productes;
	}

	// métodos generales
	public void insertarProducte(Productes productes) {
		this.productes.add(productes);
	}

	public void mostraProductes() {
		for (Productes product : productes) {
			System.out.println("Aquesta màquina té " + product.getNomProductes());
		}
	}

}
