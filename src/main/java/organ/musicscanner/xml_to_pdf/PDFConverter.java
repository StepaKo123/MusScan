package organ.musicscanner.xml_to_pdf;
import java.io.File;

public class PDFConverter {
    public static File convert(File file){
        return new File("example.pdf");
    }
    public static boolean isPDF(File file) {
        return file != null && file.getName().toLowerCase().endsWith(".pdf");

    }
}