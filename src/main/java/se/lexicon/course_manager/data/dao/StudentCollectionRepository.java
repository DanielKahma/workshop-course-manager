package se.lexicon.course_manager.data.dao;



import se.lexicon.course_manager.data.sequencers.StudentSequencer;
import se.lexicon.course_manager.model.Student;

import java.util.Collection;
import java.util.HashSet;

// TODO provide proper implementation.

public class StudentCollectionRepository implements StudentDao {

    private Collection<Student> students;

    public StudentCollectionRepository(Collection<Student> students) {

        this.students = students;
    }

    @Override
    public Student createStudent(String name, String email, String address) {

        int id = StudentSequencer.nextStudentId();
        Student student;
        student = new Student(id, name, email, address);

        return student;

    }

    @Override
    public Student findByEmailIgnoreCase(String email) {


        return null;
    }

    @Override
    public Collection<Student> findByNameContains(String name) {

        return null;
    }

    @Override
    public Student findById(int id) {

        return null;
    }

    @Override
    public Collection<Student> findAll() {

        return null;
    }

    @Override
    public boolean removeStudent(Student student) {

        return false;
    }

    @Override
    public void clear() {

        this.students = new HashSet<>();
    }
}
