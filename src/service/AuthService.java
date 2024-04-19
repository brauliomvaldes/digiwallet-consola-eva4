package service;

import java.util.List;

import entities.Role;
import entities.User;
import entities.UserAuth;

public class AuthService {
	
	public UserAuth login(List<UserAuth> auths, String user, String pass) {
		for (int i = 0; i < auths.size(); i++) {
			if (auths.get(i).getUsername().equals(user) && auths.get(i).getPassword().equals(pass)) {
				if(auths.get(i).getUser().isUser_state()) {
					return auths.get(i);						
				}else {
					System.out.println(" ".repeat(6)+"Usuario no esta habilitado para iniciar session");
				}
			}
		}
		return null;
	}
	
	public List<UserAuth> register(List<UserAuth> auths, User user, Role role){
		UserAuth userAuth = new UserAuth();
		userAuth.setUser(user);
		userAuth.setPassword(user.getUser_password_hash());
		userAuth.setUsername(user.getUser_username());
		userAuth.setRole(role);
		auths.add(userAuth);
		return auths;
	}
}
