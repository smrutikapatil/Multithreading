public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Multithreading Concept");

        NumberThread numberThread = new NumberThread();
        numberThread.setDaemon(true);
        CharacterRunnable characterRunnable = new CharacterRunnable();
        Thread characterThread = new Thread(characterRunnable);

        numberThread.start();
        characterThread.start();
        System.out.println("Goodbye from main thread");
    }
}
