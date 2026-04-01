
public class UsuarioService {
	private Notificador notificacao;
	
	public UsuarioService(Notificador notificacao) {
		this.notificacao = notificacao;
	}
	
	public void registrar(String nome) {
		System.out.println("Usuário " + nome + " registrado.");
		notificacao.enviarMensagem("Bem-vindo " + nome + "!");
	}
}
