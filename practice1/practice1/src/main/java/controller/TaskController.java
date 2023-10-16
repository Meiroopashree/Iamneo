package controller;

org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.http.HttpStatus;
import org.springframework.beans.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController
{
@Autowired
private TaskService taskService;

@PostMapping("/")
public ResponseEntity<String> createTask(@RequestBody Task task)
{
    taskService.createTask(task);
    return new ResponseEntity<>("Task added successfully",HttpStatus.CREATED);
}

@GetMapping("/{id}")
public ResponseEntity<?> getTask(@PathVariable Integer taskId)
{
    Optional<Task> task=taskService.getTaskById(id);
    if(task.isPresent())
    {
        return ResponseEntity.ok().body(task.get());
    }
    else
    {
        return ResponseEntity.ok().body("Task not found");
    }
}

@PutMapping("/{id}")
public ResponseEntity<String> updateTask(@PathVariable Integer id, @RequestBody Task task)
{
    if(taskService.updateTask(id, task))
    {
        return ResponseEntity.ok().body("Task Updated Successfully");
    }
    else
    {
        return ResponseEntity.ok().body("Task not found");
    }
}

@DeleteMapping("/{id}")
public ResponseEntity<String> deleteTask(@PathVariable Integer id)
{
if(taskService.deleteTask(id))
{
    return ResponseEntity.ok().body("Task deleted Successfully");
}
else
{
    return ResponseEntity.ok().body("Task not found");
}
}
}