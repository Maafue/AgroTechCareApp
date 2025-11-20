package by.morozmaksim;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class contractController {
    @GetMapping("/{id}")
    public String getString(@PathVariable String id) {
        return "Hello World! " + id;
    }
}
