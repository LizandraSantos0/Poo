package classecliente;

public class TesteCliente {
		

	public static void main(String[] args) {
		
	    ClasseCliente c1 =  new ClasseCliente( "Ana" , "Santos", "Ana@gmail.com", "(11) 96167-9187",1500.00 );
		PessoaFisica p1 = new PessoaFisica("Ana" , "Santos", "Ana@gmail.com", "(11) 96167-9187", 1500.00,"456.927.183-00" ,"49.821.572-6");
		PessoaJuridica p2 = new PessoaJuridica("Ana" , "Santos", "Ana@gmail.com", "(11) 96167-9187", 1500.00,"Rua das margaridas","54.864.964/001-34");
		 
		 p1.setCpf("456.927.183-00");
		 p1.setRg("49.821.572-6");
		 p2.setEndereço("Rua das margaridas");
		 p2.setCnpj("54.864.964/001-34");
		 c1.setNome("Ana");
		 c1.setSobrenome("Santos");
		 c1.setEmail("Ana@gmail.com");
		 c1.setTelefone("(11) 96167-9187");
		 c1.setSaldo(1500.00);
		 
		
		 c1.visualizar();
		 p1.visualizar();
		 p2.visualizar();
	}
		
		
	}
