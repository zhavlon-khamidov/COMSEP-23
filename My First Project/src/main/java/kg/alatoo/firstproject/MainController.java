package kg.alatoo.firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class MainController extends Object {

    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

    @GetMapping("t1")
    public String test1(Model model) {

        String text = "My message! Hello world";
        model.addAttribute("myText", text);

        Student student = new Student(1, "Azhar", "Asankulova");

        model.addAttribute("student", student);
        return "test";
    }
}
