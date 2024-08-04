package az.perfect.oop.todoApp.main;

import az.perfect.oop.application.bean.Todo;
import az.perfect.oop.todoApp.dao.impl.TodoServiceImpl;
import az.perfect.oop.todoApp.dao.inter.TodoService;
import az.perfect.oop.todoApp.util.InputUtil;

public class Command {

    public static void main(String[] args) {

        TodoService todoService = new TodoServiceImpl();


        while (true) {
            String command = InputUtil.getText("Command");

            if (command.equalsIgnoreCase("quit")) {
                break;
            }

            if (command.equalsIgnoreCase("add")) {
                todoService.add();

            }
            if (command.equalsIgnoreCase("list")) {
                todoService.printAll();
            }
            if(command.equalsIgnoreCase("find")){

                todoService.findCommand();
            }

            if(command.equalsIgnoreCase("change")){
                todoService.changeCommandValue();
            }
            if (command.equalsIgnoreCase("remove")) {
                todoService.remove();
            }
        }
    }
}