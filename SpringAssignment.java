import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public String getCourses() {
        StringBuilder response = new StringBuilder();
        response.append("Foundation courses offered in the Computer Science Department:\n");
        response.append("- Course 1\n");
        response.append("- Course 2\n\n");

        response.append("Undergraduate courses offered in the Computer Science Department:\n");
        response.append("- Course 1\n");
        response.append("- Course 2\n");
        response.append("- Course 3\n");
        response.append("- Course 4\n");
        response.append("- Course 5\n\n");

        response.append("Honours courses offered in the Computer Science Department:\n");
        response.append("- Course 1\n");
        response.append("- Course 2\n");
        response.append("- Course 3\n");
        response.append("- Course 4\n\n");

        return response.toString();
    }
}

