public class llamar {
    public static void main(String[] args) {
        Jugador uno = new Jugador();
        Jugador dos = new Jugador("Marcelino", "Mexico",20);
        uno.patear();
        uno.correr();

        dos.patear();
        dos.correr();
        dos.acelerar(30);
        }
    }

