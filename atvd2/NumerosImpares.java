public class NumerosImpares implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Ímpar: " + i);
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
