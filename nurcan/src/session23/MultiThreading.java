package session23;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.concurrent.*;

public class MultiThreading {
    public static void main(String[] args) {
        List<User> users = List.of(User.of("Nurcan", "Nafizade", "nafi", "9779"),
                User.of("Leman", "Mirzeyeva", "lmn", "3293"),
                User.of("Nadir", "Qeniyev", "qan1yev", "7727"));

        printWithFutureAndCallable(users);
        printWithCompletableFutureAndRunnable(users);
    }

    public static void printWithFutureAndCallable(List<User> users) {
        ExecutorService ex = Executors.newFixedThreadPool(users.size());
        List<Callable<String>> tasks = users.stream().map(user -> (Callable<String>) () -> {
            String fileName = user.getName() + "_" + user.getSurname() + ".txt";
            if (user.getName().startsWith("L")) {
                Thread.sleep(2000);
            }
            try (ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(fileName))) {
                ob.writeObject(user);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return null;
        }).toList();

        try {
            List<Future<String>> futures = ex.invokeAll(tasks);
            for (Future<String> future : futures) {
                future.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            ex.shutdown();
        }
    }

    public static void printWithCompletableFutureAndRunnable(List<User> users) {
        users.forEach(user -> CompletableFuture.runAsync(() -> {
            String fileName = user.getName() + "_" + user.getSurname() + ".txt";
            try (ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(fileName))) {
                ob.writeObject(user);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).join());
    }

}
