package Memory;
import Entities.FootballPlayer;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ManageFilePlayer {
    public static void writeObjectToFile(Object players) {
        try {
            FileOutputStream fileOut = new FileOutputStream("Players.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(players);
            objectOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Object readFromFile() {
        try {
            FileInputStream fileIn = new FileInputStream("Players.dat");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object players = objectIn.readObject();
            objectIn.close();
            return players;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
