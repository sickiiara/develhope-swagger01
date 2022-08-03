package co.develhope.Swagger01.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class DefaultController {

    @GetMapping(value = "")
    @ApiOperation(value = "Welcome", notes = "Print a welcome message")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 400, message = "Bad input data"),
            @ApiResponse(code = 500, message = "Internal error from Spring", response = String.class)
    })

    public String sayWelcome(){
        return "Welcome in Swagger 01";
    }
}