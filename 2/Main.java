public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker(
            msg -> System.out.println(msg),
            err -> System.err.println(err)
        );
        worker.start();
    }
}