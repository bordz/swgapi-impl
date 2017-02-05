package io.swagger.api;

import io.swagger.model.ErrorModel;
import io.swagger.model.Greeting;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-05T11:23:22.431Z")

@Api(value = "greeting", description = "the greeting API")
public interface GreetingApi {

    @ApiOperation(value = "", notes = "returns a greeting to the user and a count on how many times the API greeted since start of service", response = Greeting.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "greeting response", response = Greeting.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Greeting.class) })
    @RequestMapping(value = "/greeting",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Greeting> greetingGet(@ApiParam(value = "name of user to greet") @RequestParam(value = "name", required = false) String name);

}
