/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilesClassMethods;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import static java.nio.file.FileVisitResult.CONTINUE;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author dhrutis
 */
public class SearchFile {

    public static void main(String[] args) throws IOException {
        Path p1;
        p1 = Paths.get("D:/Test");
        PathMatcher pm1 = FileSystems.getDefault().getPathMatcher("glob:" + "*.txt");
        FindFile f1 = new FindFile(p1, pm1);
        try {
            Files.walkFileTree(p1, f1);
            f1.finished();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}

class FindFile extends SimpleFileVisitor<Path> {

    private final PathMatcher matcher;
    private int count;

    public FindFile(Path path, PathMatcher matcher) {

        this.matcher = matcher;
    }

    private void find(Path file) {
        Path pName = file.getFileName();
        if (pName != null && matcher.matches(pName)) {
            count++;
            System.out.println(file);
        }
    }

    void finished() {
        System.out.println("Matched: " + count);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
        find(file);

        return CONTINUE;
    }

    // Pattern matching on each directory
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        find(dir);
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        System.err.println(exc);
        return CONTINUE;
    }
}
