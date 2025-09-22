package edu.fcu.cs1133.config;

import edu.fcu.cs1133.model.Course;
import edu.fcu.cs1133.model.Teacher;
import edu.fcu.cs1133.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("courseSecurity")
public class CourseSecurity {

    @Autowired
    private CoursesRepository coursesRepository;

    public boolean isCourseOwnedBy(int courseId, Object principal) {
        if (principal instanceof Teacher t) {
            return coursesRepository.findById(courseId)
                    .map(c -> c.getTeacher() != null && c.getTeacher().getTeacherId() == t.getTeacherId())
                    .orElse(false);
        }
        return false;
    }
}
