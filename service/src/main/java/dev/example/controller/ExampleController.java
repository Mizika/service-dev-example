package dev.example.controller;

import dev.example.service.ExampleService;
import dev.gen.example.main.api.TestApi;
import dev.gen.example.main.model.ExampleRequest;
import dev.gen.example.main.model.ExampleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExampleController implements TestApi {

    private final ExampleService exampleService;

    @Override
    public ResponseEntity<ExampleResponse> getExample(String item) {
        return ResponseEntity.ok(exampleService.getExample(item));
    }

    @Override
    public ResponseEntity<ExampleResponse> postExample(ExampleRequest exampleRequest) {
        return ResponseEntity.ok(exampleService.postExample(exampleRequest));
    }
}
