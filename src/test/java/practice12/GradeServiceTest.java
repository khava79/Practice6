package practice12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeServiceTest {

    @Test
    void testAddValidGrade() {
        GradeService<Integer> service = new GradeService<>();
        service.addGrade(new StudentGrade<>("Maria", "Physics", 66));
        assertEquals(1, service.getAllGrades().size());
    }

    @Test
    void testAddInvalidGrade() {
        GradeService<Integer> service = new GradeService<>();
        assertThrows(InvalidGradeException.class, () ->
                service.addGrade(new StudentGrade<>("Pavel", "Chemistry", -4)));
    }

    @Test
    void testAverageGrade() {
        GradeService<Integer> service = new GradeService<>();
        service.addGrade(new StudentGrade<>("C", "Biology", 60));
        service.addGrade(new StudentGrade<>("A", "Biology", 90));
        double average = service.calculateAverageGradeBySubject("Biology");
        assertEquals(75, average);
    }

    @Test
    void testAverageGradeNoSubject() {
        GradeService<Integer> service = new GradeService<>();
        service.addGrade(new StudentGrade<>("Ivan", "Chemistry", 79));
        assertThrows(IllegalArgumentException.class, () -> service.calculateAverageGradeBySubject("History"));
    }

}
