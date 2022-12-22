package task.create_api.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import task.create_api.demo.modal.School;
import task.create_api.demo.service.SchoolService;

import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    SchoolService schoolService;
    @GetMapping("/school")
    private List<School> getAllSchool(){
        return schoolService.getAllSchool();
    }
    @GetMapping("/school/{id}")
    private School getSchool(@PathVariable("id") Integer schoolId){
        return schoolService.getSchoolById(schoolId);
    }
    @DeleteMapping("/school/{id}")
    private void deleteSchool(@PathVariable("id") Integer schoolId){
      schoolService.delete(schoolId);
    }
    @PostMapping("/school")
    private Integer saveSchool(@RequestBody School school){
        schoolService.save(school);
        return school.getSchoolId();
    }

}
