package _module3.les_28_170119._io;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest {
    public static void main(String[] args) throws IOException {
        File file = new File("les_28_1.txt");
        System.out.println("exist = " + file.exists());
        if (file.createNewFile()) System.out.println("created! " + "file name = " + file.getName());
        System.out.println("file.getParent() = " + file.getParent());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getAbsoluteFile() = " + file.getAbsoluteFile());
        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.renameTo(file.getAbsoluteFile()) = " + file.renameTo(file.getAbsoluteFile()));
        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        InputStream in = null;
        OutputStream out = null;
        try {
            out = new BufferedOutputStream(new FileOutputStream(file));
            out.write("list of files current dir:\n".getBytes());
            File currentDir = new File(".");
            String[] fl = currentDir.list();
            for (String s : fl) {
                out.write(("file in current dir: " + s + "\n").getBytes());
            }
        } finally {
            if (out != null) {
                out.close();
            }
        }
        try {
            in = new BufferedInputStream(new FileInputStream(file));
            while (in.available() != 0) {
                System.out.print((char) in.read());
            }
        } finally {
            if (in != null) {
                in.close();
            }
        }
        File newFile = new File("les_28_2.txt");
        if (newFile.exists()) newFile.delete();
        boolean renamed = file.renameTo(newFile);
        System.out.println("renamed, file.renameTo \"les_28_2.txt\" = " + renamed);
        System.out.println("file.getName() = " + file.getName());
        System.out.println("newFile.getName() = " + newFile.getName());
        System.out.println("file.getAbsoluteFile() = " + file.getAbsoluteFile());
        System.out.println("newFile.getAbsoluteFile() = " + newFile.getAbsoluteFile());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("newFile.getAbsolutePath() = " + newFile.getAbsolutePath());
        //nio: (new IO) new input, output
        // ctrl+alt+t обертки, try/catch
        Path mf = Paths.get(newFile.getAbsoluteFile().toString());
        File nioFile = new File("les_28_nio.txt");
        if (nioFile.exists()) nioFile.delete();
        try {
            Files.move(mf, mf.resolveSibling(nioFile.getAbsoluteFile().toString()));
        } catch (FileAlreadyExistsException e) {
            System.out.println("Cannot rename! File already exists! (" + e.getMessage() + ")");
            System.out.println();
        }
        // для разных ОС и файловых систем
        //"C:/javatest/test"
        File newDir = new File("C:" + File.separator + "javatest" + File.separator + "test");//new dirs
        boolean dirCreated = newDir.mkdirs();
        System.out.println("dirCreated = " + dirCreated);

    }
}
