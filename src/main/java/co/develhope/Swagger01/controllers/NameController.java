package co.develhope.Swagger01.controllers;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping(value = "/name")
    @ApiOperation(value = "Greets the user", notes = "Print an hello message for the user")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 400, message = "Bad input data"),
            @ApiResponse(code = 404, message = "Page not found"),
            @ApiResponse(code = 500, message = "Internal error", response = String.class)
    })
    public String name(){
        return "Hello Chiara!";
    }

    @GetMapping(value = "/name/{yourName}")
    @ApiOperation(value = "Greets the user", notes = "Print an hello message for the user")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 400, message = "Bad input data"),
            @ApiResponse(code = 404, message = "Page not found"),
            @ApiResponse(code = 500, message = "Internal error", response = String.class)
    })
    public String paramName (@ApiParam(value = "the user's name")@RequestParam String yourName){
        return "Hello " + yourName + "!";
    }

}

