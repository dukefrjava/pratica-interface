
public class Notificador {
		
	String mensagem;
	
	public Notificador(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public void enviarMensagem(String mensagem) {
		System.out.println("Notificação: " + mensagem);
	}
}
