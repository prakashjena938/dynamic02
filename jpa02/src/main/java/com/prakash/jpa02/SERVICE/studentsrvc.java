package com.prakash.jpa02.SERVICE;

import com.prakash.jpa02.ENTITY.student;
import com.prakash.jpa02.REPO.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentsrvc {

    @Autowired
    StudentRepo StudentRepo;
    public student savestudent(student student){
                return StudentRepo.save(student);
    }


    public List<student> getallstudent(){
        return StudentRepo.findAll();
    }

    public student getById(Integer id){
        Optional<student> option = StudentRepo.findById(id);
        student option2 =null;
      if (option.isPresent()){
          option2 =option.get();
      }
      else {
          System.out.println("not found");
      }
      return option2;
    }

    //update
    public student update(Integer id,student student){
        Optional<student> optional =StudentRepo.findById(id);
        student optional2=null;
        if (optional.isPresent()) {
           student stu = optional.get();
           stu.setName(student.getName());
           stu.setAge(student.getAge());
           stu.setEmail(student.getEmail());
           stu.setCourse(student.getCourse());
           optional2 = StudentRepo.save(stu);
        }
        else {
            System.out.println("not found");
        }
        return optional2;
    }

}
