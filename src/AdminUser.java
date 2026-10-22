public class AdminUser extends User{
    private String permissionLevel;

    // Am creat constructorul AdminUser pentru a initializa obiecte care primesc ca parametrii username, age si permissionLevel; am folosit super pentru a apela constructorul din clasa parinte
    public AdminUser(String username, int age, String permissionLevel){
        super(username, age);
        this.permissionLevel = permissionLevel;
    }

    // Am folosit acest getter pentru a prelua PermissionLevel
    public String getPermissionLevel(){
        return this.permissionLevel;
    }

    // Am suprascris metoda toString pentru a afisa atributele obiectului in loc de User@hash.
    public String toString() {
        return "User "+getUsername()+" are varsta: "+getAge() +" si are nivelul de permisiune: " +getPermissionLevel();
    }
}
