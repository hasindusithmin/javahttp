public class Com {

    public int id;
    public String name;
    public String email;
    public String body;
    public Com(int id, String name, String email, String body) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }
    @Override
    public String toString() {
        return "Com [body=" + body + ", email=" + email + ", id=" + id + ", name=" + name + "]";
    }
    
    
    


}
