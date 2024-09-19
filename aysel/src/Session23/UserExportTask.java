package aysel.src.Session23;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.concurrent.Callable;

public class UserExportTask implements Callable {
    private  final User user;

    public UserExportTask(User user){
        this.user=user;
    }

    @Override
    public Void call() throws Exception {
        Thread.sleep(3000);
        if(user.getName().startsWith("A")){
            Thread.sleep(2000);
        }
        final String fileName=user.getName()+"."+user.getSurName()+ ".txt";
        System.out.println("File created " +fileName);
        try(ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(fileName))){
            objectOutputStream.writeObject(user);
        }catch (IOException e){
            e.printStackTrace();
        }
        return  null;
    }
}




