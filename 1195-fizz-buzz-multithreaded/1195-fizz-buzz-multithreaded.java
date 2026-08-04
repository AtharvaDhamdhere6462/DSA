import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

class FizzBuzz {

    private int n;
    private int i;

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public FizzBuzz(int n) {
        this.n = n;
        this.i = 1;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while (true) {
            lock.lock();
            try {
                while (i <= n && !(i % 3 == 0 && i % 5 != 0)) {
                    condition.await();
                }

                if (i > n) {
                    condition.signalAll();
                    return;
                }

                printFizz.run();
                i++;
                condition.signalAll();
            } finally {
                lock.unlock();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (true) {
            lock.lock();
            try {
                while (i <= n && !(i % 5 == 0 && i % 3 != 0)) {
                    condition.await();
                }

                if (i > n) {
                    condition.signalAll();
                    return;
                }

                printBuzz.run();
                i++;
                condition.signalAll();
            } finally {
                lock.unlock();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (true) {
            lock.lock();
            try {
                while (i <= n && !(i % 3 == 0 && i % 5 == 0)) {
                    condition.await();
                }

                if (i > n) {
                    condition.signalAll();
                    return;
                }

                printFizzBuzz.run();
                i++;
                condition.signalAll();
            } finally {
                lock.unlock();
            }
        }
    }

    // printNumber.accept(x) outputs "x".
    public void number(IntConsumer printNumber) throws InterruptedException {
        while (true) {
            lock.lock();
            try {
                while (i <= n && (i % 3 == 0 || i % 5 == 0)) {
                    condition.await();
                }

                if (i > n) {
                    condition.signalAll();
                    return;
                }

                printNumber.accept(i);
                i++;
                condition.signalAll();
            } finally {
                lock.unlock();
            }
        }
    }
}