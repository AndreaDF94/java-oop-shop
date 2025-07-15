import java.util.Random;

/*
 * Classe Prodotto che rappresenta un prodotto dello shop
 * Contiene attributi, costruttore e metodi di utilità
 */
public class Prodotto {
    // Attributi privati del prodotto
    private int codice;              // Codice identificativo generato random
    private String nome;             // Nome del prodotto
    private String descrizione;      // Descrizione testuale
    private double prezzo;           // Prezzo base senza IVA
    private double iva;              // Percentuale IVA da applicare

    // Costruttore che inizializza il prodotto con nome, descrizione, prezzo e iva
    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        // Genero un codice casuale tra 1000 e 9999
        Random rand = new Random();
        this.codice = rand.nextInt(9000) + 1000;

        // Assegno i parametri agli attributi della classe
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

