package task.create_api.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import task.create_api.demo.modal.School;
import task.create_api.demo.repository.SchoolRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolService {
    @Autowired
    SchoolRepository schoolRepository;

    public List<School> getAllSchool(){
        List<School> schools = new ArrayList<School>();

        return schoolRepository.findAll();
    }
    public School getSchoolById(Integer schoolId){
        return schoolRepository.findById(schoolId).get();
    }
    public void save(School school){
        schoolRepository.save(school);
    }
    public void delete(Integer schoolId){
        schoolRepository.deleteById(schoolId);
    }
}
