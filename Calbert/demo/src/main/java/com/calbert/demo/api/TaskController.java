package com.calbert.demo.api;

import com.calbert.demo.model.entity.Task;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @GetMapping("/test") // endpoint (url)
    public int one() {
        return 1;
    }

    private final List<Task> tasksList = List.of(
            new Task(1, "task1", "A first test task", false),
            new Task(2, "task2", "A second test task", true)
    );

    // Return all tasks in list
    @GetMapping("/tasks") // endpoint (url)
    public List<Task> getTasks() {
        return tasksList; // Returns the list of tasks as JSON. List and Set are converted to JSON
    }

    // Return a specific task
//    @GetMapping("/tasks/{id}") // endpoint (url)
//    public Task getTask(@PathVariable int id) {
//        return tasksList.get(id - 1); // List index starts from 0
//    }

    // Customize status code
    @GetMapping("/tasks/{id}") // endpoint (url)
    public ResponseEntity<Task> getTasks(@PathVariable int id) {
        return new ResponseEntity<>(tasksList.get(id - 1), HttpStatus.ACCEPTED); // Changes 200 OK to 200 ACCEPTED
    }
}
