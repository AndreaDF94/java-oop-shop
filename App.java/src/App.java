/*
 * Classe principale App.java
 * Contiene il metodo main che serve per avviare l'applicazione Java
 */
public class App {
    public static void main(String[] args) {
        // Creo un nuovo prodotto con nome, descrizione, prezzo e IVA
        Prodotto p = new Prodotto("Mouse", "Mouse ottico wireless", 25.0, 22.0);

        // Stampo tutti i dettagli del prodotto a schermo
        p.stampaDettagli();
    }
}
