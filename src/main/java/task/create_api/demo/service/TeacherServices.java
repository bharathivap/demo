package task.create_api.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import task.create_api.demo.modal.TeacherDetail;
import task.create_api.demo.repository.TeacherRepo;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServices {
    @Autowired
    TeacherRepo teacherRepository;

    public List<TeacherDetail> getAllTeacher() {
        List<TeacherDetail> teacherDetails = new ArrayList<TeacherDetail>();
        return teacherRepository.findAll();
    }
    public TeacherDetail getTeacherById(Long id){
        return teacherRepository.findById(id).get();
    }
    public void save(TeacherDetail teacherDetail){
        teacherRepository.save(teacherDetail);
    }
    public void delete(Long id){
        teacherRepository.deleteById(id);
    }
}
