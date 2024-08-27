package tasks;


import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task{
    public static void main(String[] args) {
        ToDo[] todos=new ToDo[2];
        Scanner scanner =new Scanner(System.in);
        while(true){
            System.out.println("Command:");
            String command=scanner.nextLine();
            if(command.equalsIgnoreCase("quit")){
                break;
            }
            if(command.equalsIgnoreCase("add")){
                for (int i = 0; i < 2; i++) {
                    Scanner toScanner=new Scanner(System.in);
                    System.out.println("Title:");
                    String title=toScanner.nextLine();
                    System.out.println("Description:");
                    String description=toScanner.nextLine();
                    //Adding new exception hw
                    System.out.println("Due Date:");
                    String dueDate=toScanner.nextLine();
                    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    try{
                        LocalDate parDate= LocalDate.parse(dueDate,formatter);
                        System.out.println("parsed local date:"+ parDate);
                    }catch (DateTimeException exception){
                        System.out.println("Error occur,fix it"+exception.getMessage());
                    }

                    System.out.println("Status :");
                    String status=toScanner.nextLine();
                    ToDo todo;
                    try {
                        todo=new ToDo(i+1,title,description, TodoStatus.fromValue(status), LocalDate.parse(dueDate));
                        todos[i]=todo;
                    } catch (IllegalArgumentException exception){
                        System.out.println("exception occur");
                    }
                    //Adding new exception hw


                }
            }
            if(command.equalsIgnoreCase("list")){
                for (ToDo todo : todos) {
                    if(todo==null) continue;;
                    String icon =todo.getStatus()==TodoStatus.DONE
                            ?"[x]":"[]";
                    System.out.printf("%s %s",icon,todo);
                }
            }
            if (command.equalsIgnoreCase("remove")){
                Scanner remscanner=new Scanner(System.in);
                System.out.println("id");
                Integer id=remscanner.nextInt();
                for (int i=0;i<todos.length;i++){
                    if(todos[i].getId().equals(id))  todos[i]=null;
                }

            }
        }
    }
}
