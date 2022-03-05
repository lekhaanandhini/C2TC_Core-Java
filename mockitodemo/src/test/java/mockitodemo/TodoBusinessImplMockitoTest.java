package mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.c2tc.business.TodoBusinessImpl;
import com.c2tc.business.TodoService;

public class TodoBusinessImplMockitoTest {

	@Test
	public void usingMockito() {
          TodoService todoService = mock(TodoService.class);
          List<String> allTodos = Arrays.asList("Learn Spring MVC","Learn Spring", "Learn to Dance");

          when(todoService.retrieveTodos("Dummy")).thenReturn(allTodos);

          TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
          List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
          assertEquals(2, todos.size());
          
	}

}
