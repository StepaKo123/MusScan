package organ.musicscanner.services;
import java.io.File;
import java.io.IOException;
public class FileInputService {
    public static boolean isPDF(File file) {
        return file != null && file.getName().toLowerCase().endsWith(".pdf");
    }
}