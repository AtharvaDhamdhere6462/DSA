import java.util.concurrent.Semaphore;

class DiningPhilosophers {

    // One semaphore for each fork
    private final Semaphore[] forks = new Semaphore[5];

    // Prevent deadlock
    private final Semaphore room = new Semaphore(4);

    public DiningPhilosophers() {
        for (int i = 0; i < 5; i++) {
            forks[i] = new Semaphore(1);
        }
    }

    public void wantsToEat(
            int philosopher,
            Runnable pickLeftFork,
            Runnable pickRightFork,
            Runnable eat,
            Runnable putLeftFork,
            Runnable putRightFork) throws InterruptedException {

        int left = philosopher;
        int right = (philosopher + 1) % 5;

        // Allow at most 4 philosophers to compete for forks
        room.acquire();

        forks[left].acquire();
        forks[right].acquire();

        pickLeftFork.run();
        pickRightFork.run();

        eat.run();

        putLeftFork.run();
        putRightFork.run();

        forks[right].release();
        forks[left].release();

        room.release();
    }
}