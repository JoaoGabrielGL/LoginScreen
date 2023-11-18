
/**
 * Classe simples para autenticação de usuários, simulando uma base de dados de usuários.
 */

import java.util.HashMap;
import java.util.Map;


public class LoginScreen {
    private Map<String, String> userDatabase;// Usuário simulado na base de dados (usuário, senha)
    
    /**
     * Controi e Instancia a LoginScreen e inicializa o Database de usuarios
     */

    public void loginScreen() {
       userDatabase = new HashMap<>();
       userDatabase.put("John", "password123");
       userDatabase.put("Alice", "securepass");
    }
    
	/**
	 * Tentativa de autenticação de usuário e senha.
	 * 
	 * @param username O nome de usuário do usuário.
	 * @param password A senha inserida pelo usuário.
	 */
    public boolean login(String username, String password) {
       
    	if(userDatabase.containsKey(username)) {
    		String storedPassword = userDatabase.get(username);
    		if(storedPassword.equals(password));
    		return true;// @return {@code true} se a autenticação for bem sucedida,
    	}
    	return false;//{@code false} caso contrário.
    	/**
    	 * Adiciona um novo usuário à base de dados de usuários. Por favor note que esse método não é
    	 * recomendado para ser utilizado em ambiente de produção, uma vez que não dispõe de medidas
    	 * de segurança adequadas.
    	 */
    }
    public void addUser(String username,String password){
        userDatabase.put(username, password);
        /**
        * @param username O nome de usuário do novo usuário.
   	 	* @param password A senha do novo usuário.  
   	 	*/
    }
}
