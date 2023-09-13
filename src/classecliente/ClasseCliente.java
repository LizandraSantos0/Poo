package classecliente;

public class ClasseCliente {
	
	
	private String nome;
	private String sobrenome;
	private String email;
	private String telefone;
	private double saldo;

	public ClasseCliente(String nome, String sobrenome, String email, String telefone, double saldo) {
		
	}

	public ClasseCliente(String nome2, String sobrenome2, String email2, String telefone2, String string) {
	}

	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.telefone = telefone;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public float getSaldo() {
		return (float) saldo;
	}
	public void setSaldo(String string) {
		this.saldo = saldo;
	}

	public void visualizar() {
		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
		System.out.println("Email: " + email);
		System.out.println("Telefone: " + telefone);
		System.out.println("Saldo: " + saldo);

	}

}

