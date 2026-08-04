import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Foo {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private int turn;

    public Foo() {
        turn = 0;
    }

    public void first(Runnable printFirst) {
        lock.lock();
        try {
            // printFirst.run() outputs "first".
            printFirst.run();

            turn = 1;
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void second(Runnable printSecond) {
        lock.lock();
        try {
            while (turn != 1) {
                condition.await();
            }

            // printSecond.run() outputs "second".
            printSecond.run();

            turn = 2;
            condition.signalAll();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public void third(Runnable printThird) {
        lock.lock();
        try {
            while (turn != 2) {
                condition.await();
            }

            // printThird.run() outputs "third".
            printThird.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }
}