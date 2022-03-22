/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * 
 */
public class Assignment {

    private double mark = -1;

    Assignment() {
    }

    public double getMark() throws NotYetSetException {
        if (mark == -1) {
//            throw new NotYetSetException("Mark is not yet set");
            System.out.println("Mark is not yet set");
        }
        return mark;
    }

    public void setMark(int m) {
        mark = m;
    }

}
