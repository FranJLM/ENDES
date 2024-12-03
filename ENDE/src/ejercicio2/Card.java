package ejercicio2;
public class Card {

    public String suit;  // Palo de la carta
    public String value; // Valor de la carta

    /**
     * Constructor que establece la carta con su palo y valor. 
     * @param suit Palo de la carta.
     * @param value Valor de la carta.
     */
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    /**
     * Método que proporciona una versión en texto de la carta. .
     * @return Representación de "suit-value".
     */
    public String toString() {
        return (this.suit + "-" + this.value);
    }
}
