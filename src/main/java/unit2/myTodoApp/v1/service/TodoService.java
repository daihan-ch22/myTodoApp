package unit2.myTodoApp.v1.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import unit2.myTodoApp.v1.model.TodoEntity;
import unit2.myTodoApp.v1.model.TodoRequest;
import unit2.myTodoApp.v1.repository.TodoRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class TodoService {

    private final TodoRepository todoRepository;

    //CREATE::
    public TodoEntity add(TodoRequest request) {
        TodoEntity e = new TodoEntity();
        e.setTitle(request.getTitle());
        e.setOrder(request.getOrder());
        e.setCompleted(request.getCompleted());

        return this.todoRepository.save(e);
    }

    //SEARCH_BY_ID::
    public TodoEntity searchById(Long id){
        return this.todoRepository.findById(id)
                .orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
                );
    }

    //SEARCH_ALL::
    public List<TodoEntity> searchAll() {
        return this.todoRepository.findAll();
    }

    //UPDATE_BY_ID
    public TodoEntity updateById(Long id, TodoRequest request) {
        TodoEntity todoEntity = this.searchById(id);

        if(request.getTitle() != null) {
            todoEntity.setTitle(request.getTitle());
        }
        if(request.getOrder() != null)   {
            todoEntity.setOrder(request.getOrder());
        }
        if (request.getCompleted() != null) {
            todoEntity.setCompleted(request.getCompleted());
        }

        return this.todoRepository.save(todoEntity);
    }

    //DELETE_BY_ID
    public void deleteById(Long id) {
        this.todoRepository.deleteById(id);
    }

    //DELETE_ALL::
    public void deleteAll() {
        this.todoRepository.deleteAll();
    }

}
