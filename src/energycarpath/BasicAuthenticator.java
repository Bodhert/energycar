/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energycarpath;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;

/**
 *
 * @author alejo
 */
public class BasicAuthenticator extends Authenticator
{
    String user;
    String password;

    BasicAuthenticator(String user, String password)
    {
        this.user = user;
        this.password = password;
    }
    
    protected PasswordAuthentication getPasswordAuthentication() 
    {
			
			// Get information about the request
			String prompt = getRequestingPrompt();
			String hostname = getRequestingHost();
			InetAddress ipaddr = getRequestingSite();
			int port = getRequestingPort();

			String username = this.user;
			String password = this.password;

			// Return the information (a data holder that is used by Authenticator)
			return new PasswordAuthentication(username, password.toCharArray());
			
		}
}
