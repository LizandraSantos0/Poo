package classecliente;

public class TesteCliente {
		

	public static void main(String[] args) {
		
		 ClasseCliente c1 =  new ClasseCliente( "Ana" , "Santos", "Ana@gmail.com", "(11) 96167-9187", "1500.00");
		
		 c1.setNome("Ana");
		 c1.setSobrenome("Santos");
		 c1.setEmail("Ana@gmail.com");
		 c1.setTelefone("(11) 96167-9187");
		 c1.setSaldo("1500.00");
		 
		
		 c1.visualizar();
	}
		
		
	}
