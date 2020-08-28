package ReadWirte;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteFile {

    FlieSave filepath = new FlieSave();

    public void WriteFile(Object serObj) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath.getNameFlie());
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
