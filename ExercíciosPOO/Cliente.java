package ExercíciosPOO;

public class Cliente {

	//Atributos
	private String nome;
	private String idade;
	private String email;
	private String cidade;
	private String estado;
	
	//Construtor
	public Cliente(String nome, String idade, String email, String cidade, String estado) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	//Métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void imprimirInfo () {
		System.out.println(nome+ " tem " +idade+ " anos de vidas, " +email+ " é o email dele, morador da cidade de " +cidade+ " e do estado de " +estado);
		}
	
}
