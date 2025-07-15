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
