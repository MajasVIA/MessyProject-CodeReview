import java.io.*;
import java.util.*;

public class Persister
{
    public static void saveUsers(ArrayList<User> users) throws IOException
    {
        File file = new File("users.txt"); // Creates file
        FileWriter fileWriter = new FileWriter(file); // Create filewriter
        BufferedWriter bw = new BufferedWriter(fileWriter); // Create BufferedWriter
        for(int x=0;x<users.size();x++) // Create a loop
        { // Nicely formatted block
            bw.write(users.get(x).getName()); // Write first thing
            bw.write("" + users.get(x).getId());
        } // Ending parenthesis
    }
}

