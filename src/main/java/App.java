public class App {
    Client client;
    ConsoleEventLogger log;

    public static void main(String[] args) {
        App app = new App();
        app.client = new Client("1", "Ivan");
        app.log = new ConsoleEventLogger();
        app.logEvent(app.client.getId());
    }

    private void logEvent(String msg){
        String message = msg.replaceAll(client.getId(), client.getName());
        log.logEvent(message);
    }
}
