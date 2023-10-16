package Service;

import org.springframework.stereotype.Services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Services
@RequiredArgsConstructor
public class TaskService{

    @Autowired
    private final TaskRepository taskRepository;

    public void createTask(Task task)
    {
        taskRepository.save(task);
    }

    public Optional<Task> getTaskById(Integer id)
    {
        return taskRepository.findById(id);
    }

    public List<Task> getAllTasks()
    {
        return taskRepository.findAll();
    }

    public boolean updateTask(Integer id, Task task)
    {
        if(taskRepository.existsById(id))
        {
            task.setId(id);
            taskRepository.save(task);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean deleteTask(Integer id)
    {
        if(taskrepository.existsById(id))
        {
            taskRepository.deleteById(id);
            return true;
        }
        else
        {
            return false;
        }
    }
}
