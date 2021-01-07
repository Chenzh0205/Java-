import java.io.*;
import java.nio.channels.FileChannel;

/**
 * @author chen
 */
public class copyFile {
    private static void copyFileUsingFileStreams(File source, File dest)
            throws IOException {
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buf)) != -1) {
                output.write(buf, 0, bytesRead);
            }
        } finally {
            input.close();
            output.close();
        }
    }
    private static void copyFileUsingFileChannels(File source, File dest) throws IOException {
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        try {
            inputChannel = new FileInputStream(source).getChannel();
            outputChannel = new FileOutputStream(dest).getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } finally {
            inputChannel.close();
            outputChannel.close();
        }
    }

    public static void main(String[] args) {
        File source = new File("E:\\文件夹\\作业\\java\\文件\\src\\1.txt");
        File dest1 = new File("E:\\文件夹\\作业\\java\\文件\\src\\2.txt");
        File dest2 = new File("E:\\文件夹\\作业\\java\\文件\\src\\3.txt");
        try {
            copyFileUsingFileStreams(source,dest1);
            copyFileUsingFileChannels(source,dest2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
