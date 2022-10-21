package Ejerci.Jason;

import java.util.ArrayList;

public class Tenda {
	//atributs
	private String nomTenda = "";
	ArrayList<Expenedora> tenda = new ArrayList<Expenedora>();
	
	public Tenda (String nomTenda) {
		this.nomTenda = nomTenda;
	}
	
	//getters
	public String getNomTenda() {
		return nomTenda;
	}


	public ArrayList<Expenedora> getTenda() {
		return tenda;
	}

	//setters
	public void setNomTenda(String nomTenda) {
		this.nomTenda = nomTenda;
	}


	public void setTenda(ArrayList<Expenedora> tenda) {
		this.tenda = tenda;
	}
	
	//métodos generales
    public void insertarExpenedora(Expenedora tendas){
        this.tenda.add(tendas);
    }

    public void mostraTenda(){
        for (int i = 0; i < tenda.size(); i++){ 
           System.out.println(this.getNomTenda()); 
     }
     }
    public void mostrarProductesTenda() {
    	for (Expenedora tendas : tenda) {
			tendas.mostraProductes();
		}
    }
}
