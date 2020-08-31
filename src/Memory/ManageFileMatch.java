package Memory;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManageFileMatch {
    public static void writeObjectToFile(Object Match) {
        try {
            FileOutputStream fileOut = new FileOutputStream("Match.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(Match);
            objectOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Object readFromFile() {
        try {
            FileInputStream fileIn = new FileInputStream("Match.dat");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object Match = objectIn.readObject();
            objectIn.close();
            return Match;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
