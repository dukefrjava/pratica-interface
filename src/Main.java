
public class Main {
	public static void main(String[] args) {
		Notificador notif = new Notificador("Olá");
		UsuarioService ususarioService = new UsuarioService(new EmailNotificador(notif));
		ususarioService.registrar("João");
	}
	
}
