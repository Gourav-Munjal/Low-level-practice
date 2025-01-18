package composite.fileManagement;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> objects;

    public Directory(String directoryName) {
        this.objects = new ArrayList<>();
        this.directoryName = directoryName;
    }

    public void add(FileSystem object) {
        objects.add(object);
    }

    public void ls() {
        System.out.println("DirectoryName: " + directoryName);
        for (FileSystem fileSystem : objects) {
            fileSystem.ls();
        }
    }
}
