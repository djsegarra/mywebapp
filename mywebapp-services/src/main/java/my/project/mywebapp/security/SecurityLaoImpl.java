package my.project.mywebapp.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class SecurityLaoImpl implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("Compruebo el usuario");
		if(!username.equals("admin")) throw new UsernameNotFoundException(username + " no encontrado!");
		return new MyUserDetails();
	}

}
