package heranca;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
	Cachorro testeCachorro = new Cachorro ("Xolinha;",5,"Latido (au au!!!!);",
	"Sim;","Caramelo.");
	Cavalo testeCavalo = new Cavalo ("Robson;",4,"Relinche;","Sim.","Pé-de-pano");
	Preguica testePreguica = new Preguica("Preguicinha",25,"Silvo agudo.","Não;","Sim.");
	
	//saídas cachorro
	
	testeCachorro.imprimaSeparador();
	testeCachorro.imprimirInfoDog();
	
	//saídas cavalo
	
	testeCavalo.imprimaSeparador();
	testeCavalo.imprimirInfoCavalo();
	
	//saídas Preguiça
	
	testePreguica.imprimaSeparador();
	testePreguica.imprimirInfoPreg();

	}

}
