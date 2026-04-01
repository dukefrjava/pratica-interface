
public class SmsNotificador extends Notificador {
	private final Notificador notificacao;
	
	public SmsNotificador(Notificador notificacao) {
		super("");
		this.notificacao = notificacao;
	}
}
