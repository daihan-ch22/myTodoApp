package unit2.myTodoApp.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DB 응답 관련 클래스
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoResponse {

    private Long id;
    private String title;
    private Long order;
    private Boolean completed;
    private String url;

    public TodoResponse(TodoEntity todoEntity) {
        this.id = todoEntity.getId();
        this.title = todoEntity.getTitle();
        this.order = todoEntity.getId();
        this.completed = todoEntity.getCompleted();
        this.url = "http://localhost:8080/" + this.id;
    }
}
