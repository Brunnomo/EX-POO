import Foundation
 
 public class Usuario{
 
    public var login: Login
     
    init(login: Login) {
        self.login = login
    }
  
	get pegaLogin()
	{
		return login
	}
	
	func boasVindas( ) {
		print("Bem-vindo: \ (login)")
	}
	
}
	
