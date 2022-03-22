/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Vector; 
import java.util.Enumeration;
import java.util.Iterator;
/**
 *
 *
 */
public class CourseRecord {

    private Student student;
//    private int count = 0;
    private Vector assignments;

    CourseRecord() {
        assignments = new Vector();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student s) {
        student = s;
    }

    public void addAssignment(Assignment a) {
        assignments.addElement(a);
    }

    public Enumeration getAssignments() {
        return assignments.elements();
    }
    
   //Average
    public double average() throws NotYetSetException { 
//         assignments.elements(); // size
        double average = 0.0 ;
        double marks = 0.0 ;
        int assignment_count = 0 ;
        Enumeration en = assignments.elements();
        while (en.hasMoreElements()) {
            Assignment assignment = (Assignment) en.nextElement();
           if (assignment.getMark() != -1) {
                assignment_count ++;
                marks += assignment.getMark();
                average = marks/assignment_count;
            }
        }
        return average;
    }
    
   // canTakeFinalExam
    public boolean canTakeFinalExam() throws NotYetSetException { 
//         assignments.elements(); // size
        int assignment_count = 0 ;
        Enumeration en = assignments.elements();
        while (en.hasMoreElements()) {
            Assignment assignment = (Assignment) en.nextElement();
           if (assignment.getMark() != -1) {
                assignment_count++;
            }
        }
        return assignment_count>=3 ;
    }
}
