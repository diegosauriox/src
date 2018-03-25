import java.util.Random;

public class juego {
	public static void main(String[]args) {
		String name;
		Random rnd= new Random();
		String[] nombres= {"Diego","Victor","Fernando","Nicolas","Mauricio","Mauro","Marcelo","Aliwen","Cristobal","Francisco","Jose","Javiera","Neshat","Niki","Fernanda","Felipe","Maria","Daniela"};
		name=nombres[rnd.nextInt(nombres.length)];
		System.out.println(name);
	}
}