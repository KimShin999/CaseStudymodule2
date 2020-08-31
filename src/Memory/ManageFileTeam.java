package Memory;
import Entities.FootballTeam;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ManageFileTeam {
    public static void writeObjectToFile(Object team) {
        try {
            FileOutputStream fileOut = new FileOutputStream("Team.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(team);
            objectOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Object readFromFile() {
        try {
            FileInputStream fileIn = new FileInputStream("Team.dat");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object team = objectIn.readObject();
            objectIn.close();
            return team;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
