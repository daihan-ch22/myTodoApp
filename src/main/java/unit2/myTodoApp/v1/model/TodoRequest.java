package unit2.myTodoApp.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//DB 요청 관련 클래스

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoRequest {

    private String title;
    private Long order;
    private Boolean completed;

}
