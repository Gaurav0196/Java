package Multithreading.DeadLock;


class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to use paper " + paper);
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }
}

class Paper {
    public synchronized void writeWithPaperAndPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to use pen " + pen);
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }
}
/*
Lock the Paper Object:

Since the method is synchronized, the thread acquires the intrinsic lock of the Paper object (this).
No other thread can execute a synchronized method on this Paper object until this thread releases the lock.
Tries to Lock the Pen Object:

Inside writeWithPaperAndPen(), the thread calls pen.finishWriting().
finishWriting() in the Pen class is also synchronized, so the thread now attempts to acquire the intrinsic lock
of the Pen object.
What Happens Next?

If the Pen object’s lock is available, the thread acquires it and proceeds to execute pen.finishWriting().
If the Pen object’s lock is already held by another thread, the current thread is blocked and
waits until the lock becomes available.

 */
class Task1 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper); // thread1 locks pen and tries to lock paper
    }
}

class Task2 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() { // this solves deadlock
         synchronized (pen){// For executing thread it should have lock of pen
            paper.writeWithPaperAndPen(pen);} // thread2 locks paper and tries to lock pen

    }
}


/*
 Potential Deadlock Scenario:
Thread-1 Execution:

Locks the Pen in writeWithPenAndPaper().
Waits to acquire the lock on the Paper.
Thread-2 Execution:

Locks the Paper in writeWithPaperAndPen().
Waits to acquire the lock on the Pen.
Deadlock:

Thread-1 is waiting for Thread-2 to release the lock on Paper.
Thread-2 is waiting for Thread-1 to release the lock on Pen.
Both threads are blocked, and neither can proceed, resulting in a deadlock.
 */

public class DeadLockExample {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread thread1 = new Thread(new Task1(pen, paper), "Thread-1");
        Thread thread2 = new Thread(new Task2(pen, paper), "Thread-2");

        thread1.start();
        thread2.start();
    }
}
