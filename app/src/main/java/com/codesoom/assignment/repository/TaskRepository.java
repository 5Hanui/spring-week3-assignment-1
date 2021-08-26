package com.codesoom.assignment.repository;

import com.codesoom.assignment.models.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 할 일 리스트를 저장하고 조작하는 리포지토리입니다.
 */
@Repository
public class TaskRepository {

    /**
     * 할 일을 저장하는 리스트입니다.
     */
    private final List<Task> tasks = new ArrayList<>();

    /**
     * 새로 발급된 Task Id 입니다.
     */
    private Long newId = 0L;

    /**
     * 새로운 Task Id를 생성합니다.
     */
    public void createNewTaskId() {
        this.newId += 1L;
    }

    /**
     * 할 일 리스트에 새로운 할 일을 추가합니다.
     *
     * @param task 새로운 할 일
     */
    public void addTask(Task task) {
        tasks.add(task);
    }

    /**
     * 할 일 리스트에서 완료된 할 일을 제거합니다.
     *
     * @param task 완료된 할 일
     */
    public void removeTask(Task task) {
        tasks.remove(task);
    }

    /**
     * ID 식별자로 할 일을 조회합니다.
     *
     * @param id ID 식별자
     * @return Optional<Task> 조회한 할 일
     */
    public Optional<Task> findTaskById(Long id) {
        return tasks
                .stream()
                .filter(t -> t.getId().equals(id))
                .findFirst();
    }

    /**
     * 새로 발급된 Id에 대한 getter입니다.
     * @return 새로운 Id
     */
    public Long getNewId() {
        return newId;
    }

    /**
     * 할 일 리스트에 대한 getter입니다.
     * @return 전체 할 일 리스트
     */
    public List<Task> getTasks() {
        return tasks;
    }
}
