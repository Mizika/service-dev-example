package dev.example.service.impl;

import dev.example.service.ExampleService;
import dev.gen.example.main.model.ExampleRequest;
import dev.gen.example.main.model.ExampleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleServiceImpl implements ExampleService {

    @Override
    public ExampleResponse getExample(String item) {
        return new ExampleResponse()
                .item(item)
                .message("Good GET example!");
    }

    @Override
    public ExampleResponse postExample(ExampleRequest exampleRequest) {
        return new ExampleResponse()
                .item(exampleRequest.getItem())
                .message(exampleRequest.getMessage());
    }
}
