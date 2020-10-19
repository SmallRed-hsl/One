package text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _IO流的read {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //定义缓冲区大小，决定一次取出字节大小
        byte[] buffer= new byte[19];
        //存FileInputStream.read('缓冲区')返回值，当其值为-1则说明到文件尾，不能再被读取
        int numberRead = 0;
        //定义两个文件流存储文件
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream("D:\\NewFile/text.txt");
            output = new FileOutputStream("D:\\NewFile/text2.txt");//若文件不存在会自动创建。
            //检测read(byte[] b)读取的过程，read每次读取的长度由缓冲区b的大小决定
//			do {
//				numberRead = input.read(buffer);
//				System.out.println(numberRead);
//			} while (numberRead!=-1);

            while((numberRead = input.read(buffer)) != -1) {//numberRead的目的在于防止最后一次读取的字节小于buffer长度，
                //write(byte[]b,int off,int len)要求off+len<b.length且 off*len！=0否则会抛出（IndexOutOfBoundsException） 将b中len个字节按顺序写入输出流从b[off]开始，到b[off+len]Q:off为负是什么情况

                output.write(buffer,0,numberRead);//否则会自动填充为0 write(数组,0,写入字节数)
//                write(byte[]b,int off,int len)

            }
        } catch (final IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally {//finally块是为了释放占用的资源，不论是否有异常都要执行
            try {
                //FileInputStream是有缓冲区的，所以用完之后必须关闭，否则可能导致内存占满，数据丢失。
                input.close();
                output.close();
            } catch (IOException e2) {
                // TODO: handle exception
                e2.printStackTrace();//控制台打印异常
            }
        }
    }

}
