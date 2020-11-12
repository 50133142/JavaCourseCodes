
package java0.conc0302.lock;

public class ReentrantLockDemo {

    public static void main(String[] args) {
        final Count count = new Count();

        for (int i = 0; i < 5; i++) {
            new Thread() {
                public void run() {
                    count.get();
                }
            }.start();
        }

        for (int i = 0; i < 4; i++) {
            new Thread() {
                public void run() {
                    count.put();
                }
            }.start();
        }
    }
}
