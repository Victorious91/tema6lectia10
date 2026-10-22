//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        UserRepository ur = new UserRepository();


          User us1 =  new User("testuser", 25);
          AdminUser us2 =  new AdminUser("admin", 30, "full_access");
          User us3 =  new User("ab", 22);
          User us4 =  new User("baduser", -5);

        try {
            ur.addUser(us1);
        } catch (InvalidUserDataException e){
            System.out.println("Niciun mesaj de eroare");
        }
        try {
            ur.addUser(us2);
        } catch (InvalidUserDataException e){
            System.out.println("Niciun mesaj de eroare");
        }
        try {
            ur.addUser(us3);
        } catch (InvalidUserDataException e){
            System.out.println("Username trebuie sa aibe mai mult 2 caractere");
        }
        try {
            ur.addUser(us4);
        } catch (InvalidUserDataException e){
            System.out.println("Varsta trebuie sa fie numar pozitiv");
        }

        //Am folosit un for enhanced pentru a parcurge lista de useri din repository si am afisat userii (folosesc metoda toString suprascrisa pentru afisare frumoasa)
        for (User users: ur.getUsers()){
            System.out.println(users);
        }

    }

}