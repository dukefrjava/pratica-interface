
public class EmailNotificador extends Notificador {
	private final Notificador notificacao;
	
	public EmailNotificador(Notificador notificacao) {
		super("");
		this.notificacao = notificacao;
	}
}
