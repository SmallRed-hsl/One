package text;

import java.io.*;

public class _IO流2 {
    public static void main(String[] args) throws FileNotFoundException {
        //   1. 可以使用字符串类型的文件名来创建一个输入流对象来读取文件：
        InputStream f =new FileInputStream("D:/text.txt");
        //也可以使用一个文件对象来创建一个输入流对象来读取文件。我们首先得使用 File() 方法来创建一个文件对象：
        File g =new File("D:/text.txt");
        InputStream out = new FileInputStream(g);

    }
}
