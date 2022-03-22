/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;
import java.util.Vector; 
import java.util.Enumeration;
/**
 *
 *
 */
public class Course {

    private String title;
    private Vector courseRecords;

    Course() {
        courseRecords = new Vector();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void addCourseRecord(CourseRecord cr) {
        courseRecords.addElement(cr);
    }

    public Enumeration getCourseRecords() {
        return courseRecords.elements();
    }

    //printCourceStudents

    public void printCourceStudents() {
        String student_name;
         Enumeration en = courseRecords.elements();
         
        System.out.println("Course has "+ courseRecords.size() + " Students");
 
        while (en.hasMoreElements()) {
            CourseRecord cr = (CourseRecord) en.nextElement();
            student_name = cr.getStudent().getName();
            System.out.println(student_name);            
        }
    }
    
    //print best Students ===================================

    public void printBestStudent() throws NotYetSetException {
        double best_average = 0.0;
        String student_name = null ;

        Enumeration en = courseRecords.elements();  
        while (en.hasMoreElements()) {
            CourseRecord cr = (CourseRecord) en.nextElement();
            if (best_average < cr.average()) {
                best_average = cr.average();
                student_name = cr.getStudent().getName();
            }          
        }
        System.out.println("Best Student is " + student_name);
        
    }
        
    //printFinalExamStudents

    public void printFinalExamStudents() throws NotYetSetException {
        double best_average = 0.0;
        double average = 0.0;
        String student_name = null ;

        Enumeration en = courseRecords.elements();  
        
        System.out.println("Students that can practice in final exam");

        while (en.hasMoreElements()) {
            CourseRecord cr = (CourseRecord) en.nextElement();
            if (cr.canTakeFinalExam()) {
                System.out.println(cr.getStudent().getName());
            }          
        }
        
    }
}
