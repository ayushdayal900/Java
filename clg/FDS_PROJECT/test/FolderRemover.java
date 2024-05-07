package test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FolderRemover {
    public static void main(String[] args) throws IOException {
        Path folderPath = Paths.get("D:\\VS_code_rebuild-main\\clg\\FDS_PROJECT\\FDS_PROJECT\\AYUSH");
        Files.walkFileTree(folderPath, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.delete(file);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                Files.delete(dir);
                return FileVisitResult.CONTINUE;
            }
        });
        System.out.println("Folder removed successfully.");
    }
}
