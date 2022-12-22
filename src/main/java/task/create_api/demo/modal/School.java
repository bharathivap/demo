package task.create_api.demo.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table
@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column("schoolId")
    private Integer schoolId;

    //private String SchoolId;f
    @Column("schoolName")
    private String schoolName;

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolID) {
        schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName=schoolName;
    }



}
