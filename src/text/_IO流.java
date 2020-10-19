package text;

import java.io.*;

public class _IO流 {
    public static void main(String[] args) throws IOException{
        BufferedReader rd =new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("请输入字符，按下'q'键结束");
//        do {
//            System.out.println((char) rd.read());
//        }while((char) rd.read()!='q');

//        String str;
//        System.out.println("Enter lines of text.");
//        System.out.println("Enter 'end' to quit.");
//        do {
//            str = rd.readLine();
//            System.out.println(str);
//
//        }while(!str.equals("end"));
        try {
            byte bWrite[] = { 11, 21, 3, 40, 5 };
            OutputStream os = new FileOutputStream("text.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]); // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("text.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
