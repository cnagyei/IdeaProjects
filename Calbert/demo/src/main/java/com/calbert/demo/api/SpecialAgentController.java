package com.calbert.demo.api;

import com.calbert.demo.model.entity.SpecialAgent;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class SpecialAgentController {

    @GetMapping("/agents/{id}")
    ResponseEntity<String> validateAgentPathVariable(@PathVariable("id") @Min(1) int id) {
        return ResponseEntity.ok("Agent id is valid");
    }

    @GetMapping("/agents")
    ResponseEntity<String> validateAgentRequestParam(
            @RequestParam("code") @Pattern(regexp = "[0-9]{1,3}") String code) {
        return ResponseEntity.ok("Agent code is valid");
    }

    @PostMapping("/agent")
    public ResponseEntity<String> validate(@Valid @RequestBody SpecialAgent specialAgent) {
        return ResponseEntity.ok("Agent info is valid");
    }

    @PostMapping("/agent-list")
    public ResponseEntity<String> validateList(@RequestBody List<@Valid SpecialAgent> specialAgents) {
        return  ResponseEntity.ok("All agents have valid info");
    }
}
