package aysel.src.Session23;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task  {
    public static void main(String[] args)  throws  InterruptedException, ExecutionException {
        List<User> users=List.of(
                User.of("Aysel","Abdulzade","AyselA","123321"),
                User.of("Leyla","Eliyeva","LeylaE","777777"),
                User.of("Nurcan","Nafizade","NurcanN","222333"),
                User.of("Semmed","Kosayev","SemmedK","333222"),
                User.of("Sebuhi","Huseynov","SebuhiH","543321"));

        //  print(users);
        printWithFutureAndCallable(users);

    }


    static void print(List<User> users)throws InterruptedException{
        for( User user:users){
            Thread.sleep(3000);
            String fileName=user.getName()+ "."+user.getSurName()+ ".txt";
            try(ObjectOutputStream objectOutputStream =new ObjectOutputStream(new FileOutputStream(fileName))){
                objectOutputStream.writeObject(user);
            }catch (IOException e){
                e.printStackTrace();
            }


        }
    }

    static  void printWithFutureAndCallable(List<User> users) throws ExecutionException{
        ExecutorService executor= Executors.newFixedThreadPool(users.size());
        try{List<Future> futures=users.stream()
                .map(user -> new UserExportTask(user))
                .map(executor::submit)
                .toList();

            futures.forEach(future->{
                try{
                    future.get();
                }catch (Exception e){
                    throw new RuntimeException(e);
                }});

        }finally {
            executor.shutdown();
        }


    }

}
