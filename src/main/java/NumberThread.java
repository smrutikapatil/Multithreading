public class NumberThread extends Thread {
    @Override
    public void run() {
        for( int i = 1; i <= 100; i++){
           //if (CharacterRunnable.Thread == true)
                //break;
            System.out.println(i);
        }
        System.out.println("Goodbye from Number thread");
    }
}
