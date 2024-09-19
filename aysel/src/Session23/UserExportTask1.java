package aysel.src.Session23;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Callable;

public class UserExportTask1 implements Callable {
    private  final User user;

    public UserExportTask1(User user) {
        this.user = user;
    }


    @Override
    public Void call() throws Exception {
        try{
            final String fileName=user.getName()+"."+user.getSurName()+ ".txt";
            File file=new File(fileName);
            if(file.createNewFile()){
                try(BufferedWriter writer=new BufferedWriter(new FileWriter(file))){
                    writer.write(user.toString());
                }
            }
            System.out.println("File created " + fileName);
        }catch (IOException e){
            e.printStackTrace();
        }return null;
    }
}

