import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class LoginScreenTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
    @Test
    public void TestSuccessfulLogin(){
        LoginScreen loginScreen = new LoginScreen();
        assertTrue(loginScreen.login("John","password123"));
    }
    @Test
    public void testFailLogin(){
        LoginScreen loginScreen = new LoginScreen();
        assertFalse(loginScreen.login("John","Wrongpassword123"));
    }
    @Test
    public void testAddLogin(){
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.addUser("testuser","testpassword");
        assertFalse(loginScreen.login("testuser","testpassword"));
        
    }
            
}