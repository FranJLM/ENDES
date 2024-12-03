package ejercicio2;
import java.util.ArrayList;

/**
 * Crea un mazo entero.
 */
public class DeckCards {

    public static void main(String[] args) {
        // Significado de los palos y valores de la baraja
        String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
        String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

        // Inicializar el mazo como una lista flexible .
        ArrayList<Card> deck = new ArrayList<Card>();

        // Creación del mazo combinando cada palo con cada valor
        for (String suit : suits) {
            for (String value : values) {
                deck.add(new Card(suit, value));
            }
        }

        // Barajado del mazo
        for (int i = 0; i < deck.size(); i++) {
            int j = (int) Math.floor(Math.random() * i);
            Card tmp = deck.get(i);
            deck.set(i, deck.get(j));
            deck.set(j, tmp);
        }

        // Selección e impresiones de las primeras 5 cartas.
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }
}
