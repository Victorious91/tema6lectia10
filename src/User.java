public class User {
    private String username;
    private int age;
    // constructor pentru clasa User, initializeaza un obiect de tip User cu username si age primiti ca parametrii.
    public User(String username, int age){
        this.username = username;
        this.age = age;
    }
    // getter pentru Username.
    public String getUsername(){
        return this.username;
    }

    // getter pentru Age.
    public int getAge(){
        return this.age;
    }


    // Am suprascris metoda toString pentru a afisa atributele obiectului in loc de User@hash.
    @Override
    public String toString() {
        return "User "+getUsername()+" are varsta: "+getAge() ;
    }
}
