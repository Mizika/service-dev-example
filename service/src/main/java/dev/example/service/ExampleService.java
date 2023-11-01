package dev.example.service;

import dev.gen.example.main.model.ExampleRequest;
import dev.gen.example.main.model.ExampleResponse;

public interface ExampleService {

    ExampleResponse getExample(String item);

    ExampleResponse postExample(ExampleRequest exampleRequest);

}
