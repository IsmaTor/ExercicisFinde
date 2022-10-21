package Ejerci.Jason;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;

public class Main {
	
	public static void main(String[] args) {
		//creem productes
		Productes nouProducte1 = new Productes("Coke");
		Productes nouProducte2 = new Productes("Macarrones");
		Productes nouProducte3 = new Productes("Papel");
		Productes nouProducte4 = new Productes("Agua");
		Productes nouProducte5 = new Productes("Leche");
		
		//creem màquina expenedora
		Expenedora novaExpendedora = new Expenedora("Expendedora");
		Expenedora novaExpendedora2 = new Expenedora("Expendedora2");
		
		//afegim productes a dins de la màquina expenedora
		novaExpendedora.insertarProducte(nouProducte1);
		novaExpendedora.insertarProducte(nouProducte2);
		novaExpendedora.insertarProducte(nouProducte3);
		novaExpendedora.insertarProducte(nouProducte4);
		novaExpendedora.insertarProducte(nouProducte5);
		novaExpendedora2.insertarProducte(nouProducte5);
		
		//mostrem els productes
		//novaExpendedora.mostraProductes();
		
		//creem una tenda
		Tenda novaTenda = new Tenda("Mercadona");
		
		//afegim la màquina expenedora a la tenda
		novaTenda.insertarExpenedora(novaExpendedora);
		novaTenda.insertarExpenedora(novaExpendedora2);
		
		//mostrem el nom de la tenda
		//novaTenda.mostraTenda();
		
		//mostrem els productes de la màquina a dins de la tenda
		//novaTenda.mostrarProductesTenda();
		
		Gson tendasJson = new Gson();
		//JsonObject tendasJson = new JsonObject();
		String json = tendasJson.toJson(novaTenda);
		
		
		try {

			FileWriter ArxiuJson = new FileWriter("c:\\CLASE\\prueba.json");
			ArxiuJson.write(json.toString());
			
			ArxiuJson.close();

		} catch (IOException ex) {
			System.out.println("Error d'arxiu");
		}
		// TODO Auto-generated method stub

	}
	

}
