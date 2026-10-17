public class User
{
    public int c_id;
    public String c_nam = "Ukendt";
    public String address;

    public User(String n, int i)
    {
        c_id = i;
        setC_nam(n);
    }

    public void setC_nam(String n)
    {
        if (n == null || n.trim().length() == 0 || n.length() > 100)
        {
            return; //If string is invalid, we dont try to store it
        }
        c_nam = n;
    }

    public void setA(String a)
    {
        address = a;
    }

    public int geti(){ return c_id; }

    public String getn(){ return c_nam; }

    public String geta(){ return address; }

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return java.util.Objects.equals(u.c_nam, c_nam);
        }
        return false;
    }
}
