package composite.fileManagement;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("movies");
        directory.add(new File("Shutter Island"));
        Directory directory1 = new Directory("funnyMovies");
        directory1.add(new File("Hangover"));
        directory.add(directory1);
        directory.ls();
    }
}
