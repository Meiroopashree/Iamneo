package repository;

import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Integer>
{
    Optional<Task> findById(Integer id);
}