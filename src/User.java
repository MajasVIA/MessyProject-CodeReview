public class User
{
    private static final int MAX_NAME_LENGTH = 100;

    public int id;
    public String name = "Ukendt";
    public String address;

    public User(String n, int i)
    {
        id = i;
        setName(n);
    }

    public void setName(String n)
    {
        if (n == null || n.trim().length() == 0 || n.length() > MAX_NAME_LENGTH)
        {
            return; //If string is invalid, we dont try to store it
        }
        name = n;
    }

    public void setAddress(String a)
    {
        address = a;
    }

    public int getId(){ return id; }

    public String getName(){ return name; }

    public String geta(){ return address; }

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return java.util.Objects.equals(u.name, name);
        }
        return false;
    }
}
