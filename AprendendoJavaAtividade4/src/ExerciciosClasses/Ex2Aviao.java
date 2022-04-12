package ExerciciosClasses;

public class Ex2Aviao {
	//Atributos
		private String tipo;
		private String companhiaAerea;
		private String autorizacao;
		
		
		
		//métodos
		
		public String getTipo() {
			return tipo;
		}



		public void setTipo(String tipo) {
			this.tipo = tipo;
		}



		public String getCompanhiaAerea() {
			return companhiaAerea;
		}



		public void setCompanhiaAerea(String companhiaAerea) {
			this.companhiaAerea = companhiaAerea;
		}



		public String getAutorizacao() {
			return autorizacao;
		}



		public void setAutorizacao(String autorizacao) {
			this.autorizacao = autorizacao;
		}



		void permitirDecolagem(String tipo,String companhiaAerea,String autorizacao){
			System.out.println("O"+tipo+" da "+companhiaAerea+" "+autorizacao+" autorizado a decolar.");
		}


}
