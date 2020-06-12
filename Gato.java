package refactorizacion;
/**
 * @author Jaime Rabasco Ronda
 */
/*Refactorizacion
Haz las refactorizaciones que necesites para que "Miau"
sea un campo de la clase Gato llamado "maulla"*/

public class Gato {

		private String maullido;

		protected Gato() {
				
	}

	void maullar() {
		maullido = "miau";
		System.out.println(maullido);
	}

}
