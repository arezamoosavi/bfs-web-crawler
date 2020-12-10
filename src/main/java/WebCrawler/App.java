package WebCrawler;

public class App {

    public static void main(String[] args) {

        String root = "https://stackoverflow.com";
        BFS bfs = new BFS();
        bfs.discoverWeb(root);

    }
}
