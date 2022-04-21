public class CharacterRunnable implements Runnable {

   // public static boolean Thread;

    @Override
    public void run() {
        for( char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }
        //Thread = true;
        System.out.println("Goodbye from character thread");
    }
}
