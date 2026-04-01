
public class WhatsappNotificador extends Notificador {
	private final Notificador notificacao;
	
	public WhatsappNotificador(Notificador notificacao) {
		super("");
		this.notificacao = notificacao;
	}
}
