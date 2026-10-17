import java.util.ArrayList;

public class UserList
{
    private final ArrayList<User> users = new ArrayList<User>();

    public void add(User u)
    {
        if (u == null)
        {
            return;
        }
        this.users.add(u);
    }

    public ArrayList<User> getUsers()
    {
        return users;
    }
}
