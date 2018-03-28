import java.util.Random;

public class luchador_DiegoVega {
 private String nombre;
 private int atk;
 private int hp;
 private int def;
 private int spd;
 private int estrellas;
 private String faccion;
 public String getFaccion() {
	 return this.faccion;
	 
 }
 public int getEstrellas() {
	 return this.estrellas;
 }
 public String getNombre() {
 return this.nombre;
 }
 public int getAtk() {
	 return this.atk;
			 }
public int getHp() {
	return this.hp;
} 
public int getDef() {
	return this.def;
}
public int getSpd() {
	return this.spd;
}
public void setFaccion(String faccion) {
	this.faccion=faccion;
}
public void setEstrellas(int estrellas) {
	this.estrellas=estrellas;
}
public void setNombre(String nom ) {
		this.nombre=nom;
}
public void setAtk(int atk) {
	this.atk=atk;
}
public void setHp(int hp) {
	this.hp=hp;
}
public void setDef(int def){
  this.def=def;
}
public void setSpd(int spd) {
	this.spd=spd;
}
public luchador_DiegoVega() {
	this.estrellas=estrellas();
	this.nombre=nombres();
	this.atk=valorAtk(estrellas);
	this.hp=valorHp(estrellas);
	this.def=valorDef(estrellas);
	this.spd=valorSpd(estrellas);
	this.faccion=faccion();
}	

public static int estrellas() {
	int[] stars= {1,1,1,1,1,1,1,1,2,2,2,2,2,2,3,3,3,4,4,5};
	Random rnd= new Random() 	;
	int estrellas;
	estrellas=stars[rnd.nextInt(stars.length)];
	return estrellas;
}
public static int valorAtk(int estrellas) {
	int valor;
	valor=estrellas*(20+(int)(Math.random()*50+1));
	return valor;
}
public static int valorDef(int estrellas) {
	int valor;
	valor=estrellas*(5+(int)(Math.random()*20+1));
	return valor;
}
public static int valorHp(int estrellas) {
	int valor;
	valor=estrellas*(200+(int)(Math.random()*300+1));
	return valor;
}
public static int valorSpd(int estrellas) {
	int valor;
	valor=estrellas*(10+(int)(Math.random()*90+1));
	return valor;
}
public static String nombres() {
	String name;
	Random rnd= new Random();
	String[] nombres= {"Diego","Victor","Fernando","Nicolas","Mauricio","Mauro","Marcelo","Aliwen","Cristobal","Francisco","Jose","Javiera","Neshat","Niki","Fernanda","Felipe","Maria","Daniela"};
	name=nombres[rnd.nextInt(nombres.length)];
	return name;
}
public static String faccion() {
	Random rnd=new Random();
	String faccion;
	String[] elementos= {"Fuego","Agua","Tierra"};
	faccion= elementos[rnd.nextInt(elementos.length)];
	return faccion;
	
}
public void mostrar() {
	System.out.println("el nombre es "+ getNombre());
	System.out.println("el ataque es "+ getAtk());
	System.out.println("la defensa es "+ getDef());
	System.out.println("el velocidad es "+ getSpd());
	System.out.println("la vida es "+ getHp());
	System.out.println("el rango es "+ getEstrellas());
	System.out.println("el nombre es "+ getNombre());
	System.out.println("su faccion es "+ getFaccion());
}

}




