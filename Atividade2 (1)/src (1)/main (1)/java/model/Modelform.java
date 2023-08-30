package model;

public class Modelform {
	//atributos
			public String _nome;
			public String _sobrenome;
			public int _telefone;
			public String _email;
			
			//contrutores:padrão e personalizado
			public Modelform (String nome, String sobrenome, int telefone, String email) {
				super();
				this._nome = nome;
				this._sobrenome = sobrenome;
				this._telefone = telefone;
				this._email = email;
			}

			public Modelform() {
				//contrutor padrão
			}
			
			//metodos
			public String getNome() {
				return _nome;
			}
			public void setNome(String nome) {
				this._nome =nome;
			}
			public String getSobrenome() {
				return _sobrenome;
			}
			public void setSobrenome(String sobrenome) {
				this._sobrenome = sobrenome;
			}
			public int getTelefone() {
				return _telefone;
			}
			public void setTelefon(int telefone) {
				this._telefone = telefone;
			}
			public String getEmail() {
				return _email;
			}
			public void setEmail(String email) {
				this._email = email;
			}
		}