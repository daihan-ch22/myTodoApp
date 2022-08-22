package unit2.myTodoApp.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unit2.myTodoApp.v1.model.TodoEntity;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {

}
