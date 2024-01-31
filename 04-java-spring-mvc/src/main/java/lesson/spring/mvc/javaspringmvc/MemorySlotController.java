package lesson.spring.mvc.javaspringmvc;

import org.springframework.web.bind.annotation.*;


@RequestMapping("memory")
@RestController
public class MemorySlotController {

    static Object memory;


    @PostMapping
    Object postMemory(@RequestBody Object body) {
        memory = body;
        return memory;
    }

    @GetMapping
    Object getMemory() {
        return memory;
    }
}
