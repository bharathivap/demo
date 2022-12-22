package task.create_api.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import task.create_api.demo.modal.TeacherDetail;
import task.create_api.demo.service.TeacherServices;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    TeacherServices teacherServices;
    @GetMapping("/teacher")
    private List<TeacherDetail> getAllTeacher(){
        return teacherServices.getAllTeacher();
    }
    @GetMapping("/teacher/{id}")
    private TeacherDetail getTeacher(@PathVariable("id") long id){
        return teacherServices.getTeacherById(id);
    }
    @DeleteMapping("/teacher/{id}")
    private void deleteTeacher(@PathVariable("id") long id){
      teacherServices.delete(id);
    }
    @PostMapping("/teacher")
    private long
    saveTeacher(@RequestBody TeacherDetail teacherDetail){
        teacherServices.save(teacherDetail);
        return teacherDetail.getId();
    }
}
