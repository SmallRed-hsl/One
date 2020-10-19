package text;

import java.io.FileOutputStream;
import java.io.IOException;

public class _IO流text {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\NewFile/text.txt");

        fos.write(97);
        fos.close();
    }
}
