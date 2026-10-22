import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> lista = new ArrayList<>();

    //Am creat metoda addUser care arunca exceptia si am pus cele 4 conditii user este null, numele este null, marimea string-ului username <3 sau varsta negativa. Apoi am adaugat userul in lista.
    public void addUser(User user) throws InvalidUserDataException{

        String x = user.getUsername();
        int a = user.getAge();
        if (user == null || x==null || x.length()<3 || a<0) {
            throw new InvalidUserDataException();
        }
        lista.add(user);

    }

    //am creat metoda getUsers pentru a returna lista cu useri.
    public List<User> getUsers(){
        return lista;
    }

}
