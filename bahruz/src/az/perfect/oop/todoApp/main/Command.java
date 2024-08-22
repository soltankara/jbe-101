package az.perfect.oop.todoApp.main;

import az.perfect.oop.todoApp.dao.impl.TodoServiceImpl;
import az.perfect.oop.todoApp.dao.inter.TodoService;
import az.perfect.oop.todoApp.exception.TodoException;
import az.perfect.oop.todoApp.util.InputUtil;

public class Command {

    public static void main(String[] args) {

        TodoService todoService = new TodoServiceImpl();


        while (true) {

            try {
                String command = InputUtil.getText("Command:\n" +
                        "/add ,list ,find ,change ,remove ,quit");
                if (!(command.equalsIgnoreCase("add")) &&
                        !(command.equalsIgnoreCase("list")) &&
                        !(command.equalsIgnoreCase("find")) &&
                        !(command.equalsIgnoreCase("change")) &&
                        !(command.equalsIgnoreCase("remove")) &&
                        !(command.equalsIgnoreCase("quit"))
                ) {
                    throw new TodoException("Could not found Command!");

                }


                if (command.equalsIgnoreCase("quit")) {
                    break;
                } else if (command.equalsIgnoreCase("add")) {
                    todoService.add();

                } else if (command.equalsIgnoreCase("list")) {
                    todoService.printAll();
                } else if (command.equalsIgnoreCase("find")) {

                    todoService.findCommand();
                } else if (command.equalsIgnoreCase("change")) {
                    todoService.changeCommandValue();
                } else if (command.equalsIgnoreCase("remove")) {
                    todoService.remove();
                }

            } catch (TodoException todoException) {
                System.out.println(todoException.getLocalizedMessage());

            }

        }
    }
}