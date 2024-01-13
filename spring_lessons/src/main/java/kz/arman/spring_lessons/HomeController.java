package kz.arman.spring_lessons;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/") // Обрабатывает запросы с корневым путем /
    public String home(){
        return "home"; // Возвращаем имя представления
    }
}
