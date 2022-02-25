package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-02-16T12:44:13.813Z")

@Controller
public class ReadmeApiController implements ReadmeApi {

    private static final Logger log = LoggerFactory.getLogger(ReadmeApiController.class);

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ReadmeApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.request = request;
    }

    public ResponseEntity<String> readme() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>("Esta API tem por objetivo fazer o CRUD de clientes.", HttpStatus.OK);
    }
}
