package io.swagger.api;

import io.swagger.model.ErrorModel;
import io.swagger.model.Greeting;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import java.util.concurrent.atomic.AtomicLong;

import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-05T11:23:22.431Z")

@Controller
public class GreetingApiController implements GreetingApi {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public ResponseEntity<Greeting> greetingGet(@ApiParam(value = "name of user to greet") @RequestParam(value = "name", required = false, defaultValue="World") String name) {
        // do some magic!
        Greeting response = new Greeting()
                              .id(counter.incrementAndGet())
                              .content(String.format(template, name));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
