package ExerciciosClasses;

public class Ex2TestaAviao {

	public static void main(String[] args) {
		Ex2Aviao aviao1 = new Ex2Aviao();
		Ex2Aviao aviao2 = new Ex2Aviao();
		
		aviao1.setTipo ("Airbus A330");
		aviao1.setCompanhiaAerea ("Gol");
		aviao1.setAutorizacao ("esta");
		
		aviao2.setTipo("Airbus Beluga");
		aviao2.setCompanhiaAerea ("Azul");
		aviao2.setAutorizacao ("não esta");
		
		aviao1.permitirDecolagem(aviao1.getTipo(), aviao1.getCompanhiaAerea(), aviao1.getAutorizacao());
		aviao2.permitirDecolagem(aviao2.getTipo(), aviao2.getCompanhiaAerea(), aviao2.getAutorizacao());
		
		}

}
