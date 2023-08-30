package control;
import model.Modelform;
import javax.faces.bean.ManagedBean;
@ManagedBean
public class Controlform {

	private Modelform n_contato = new Modelform();
	public Controlform() {
		// Construtor da Classe Controlform	
	}
	public String getNome() {
		return n_contato.getNome();
	}
	public void setNome (String nome) {
		n_contato.setNome(nome);
	}
	public String getSobrenome() {
		return n_contato.getSobrenome();
	}
	public void setSobrenome (String sobrenome) {
		n_contato.setSobrenome(sobrenome);
	}
	public int getTelefone() {
		return n_contato.getTelefone();
	}
	public void setTelefone (int telefone) {
		return;
	}
	public String getEmail() {
		return n_contato.getEmail();
	}
	public void setEmail (String email) {
		n_contato.setEmail(email);
	}
}
