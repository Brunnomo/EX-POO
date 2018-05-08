public class Usuario {
    private login: String

    init(login: String) {
        self.login = login
    }

    func getLogin() -> String {
        return login;
    }
    
    func menu() -> int {
        var opcao = 0
        println("Menu")
        return opcao
    }
    
    func boasvindas(){
        println("Bem-vindo \(self.login)")
    }
}