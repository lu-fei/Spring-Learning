package testJUC;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.ws.api.model.MEP;
import javafx.concurrent.Task;
import org.junit.Test;

import java.lang.reflect.Proxy;
import java.util.Date;
import java.util.concurrent.*;

public class TestSchedule {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        method1();
//        method2();
        method3();
    }

    private static void method1() {
        ScheduledExecutorService service = new ScheduledThreadPoolExecutor(3);
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            Thread.sleep(1000);
            String s = Thread.currentThread().getName() + ":\t" + new Date();
            System.out.println(s);
            return s;
        });

        System.out.println(new Date());
//        for (int i = 0; i < 10; i++) {
//            service.schedule(futureTask, 1, TimeUnit.SECONDS);
//            System.out.println(futureTask.get());
//        }

        for (int i = 0; i < 10; i++) {
            service.scheduleWithFixedDelay(futureTask, 2, 1, TimeUnit.SECONDS);
        }

        service.shutdown();
    }

    private static void method2() {
        ScheduledExecutorService service = new ScheduledThreadPoolExecutor(3);
        Runnable task = () -> {
            String s = Thread.currentThread().getName() + ":\t" + new Date();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(s);
        };

        System.out.println(Thread.currentThread().getName() + "\t" + new Date());
        ScheduledFuture<?> scheduledFuture = service.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS);
    }

    private static void method3(){
        ScheduledExecutorService service = new ScheduledThreadPoolExecutor(3);
        System.out.println(Thread.currentThread().getName() + ":\t" + new Date());
        Runnable runnable = () ->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String s = Thread.currentThread().getName() + ":\t" + new Date();
            System.out.println(s);
        };
        service.scheduleWithFixedDelay(runnable, 0, 1, TimeUnit.SECONDS);
    }

    private static void method4(){
    }

}
