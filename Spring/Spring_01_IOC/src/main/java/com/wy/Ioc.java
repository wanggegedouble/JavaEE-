package com.wy;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ioc {
    private Student student;
    private Teacher teacher;

    public void test(){
        System.out.println(teacher.toString());
    }

    public void test01(){
        System.out.println(student.toString());
    }
}
