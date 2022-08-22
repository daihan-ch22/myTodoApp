package unit2.myTodoApp.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/")
    public String helloWorld() {
        System.out.println("[console] To-do Application");
        return "To-do Application !";
    }
}
