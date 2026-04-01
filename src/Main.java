
public class Main {
	public static void main(String[] args) {
		Notificador notif = new Notificador("Olá");
		UsuarioService usuarioService = new UsuarioService(new EmailNotificador(notif));
		usuarioService.registrar("João");
		
		usuarioService = new UsuarioService(new WhatsappNotificador(notif));
		usuarioService.registrar("Maria");
	}
	
}
