package com.prakash.jpa02.CONTROLLER;

import com.prakash.jpa02.ENTITY.student;
import com.prakash.jpa02.SERVICE.studentsrvc ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("api/std")
public class studentcontroller {
    @Autowired
    studentsrvc studentsrvc;

    @PostMapping("/save")
    public student createstudent(@RequestBody student student){
        return studentsrvc.savestudent(student);
    }

    @GetMapping("/all")
    public List<student> alldata(){
    List<student>  all=  studentsrvc.getallstudent();
    return all;
    }
@GetMapping("/{id}")
    public student getById(@PathVariable Integer id){
        return studentsrvc.getById(id);
}
                                    //or
//    @GetMapping("/{path}")
//    public student getByiId(@PathVariable("path") Integer id){
//        return studentsrvc.getById(id);
//    }

                                      //or
    @GetMapping
    public student getById2(@RequestParam Integer id){
        return studentsrvc.getById(id);
    }

    // update
    @PutMapping("/{id}")
    public student update (@PathVariable Integer id , @RequestBody student student ){
        return studentsrvc.update(id,student);
    }
}
