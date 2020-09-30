/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;

/**
 *
 * @author rauls
 */
public class Person {

   private final String name;
   private final LocalDate fecha;

    public Person(String name, LocalDate fecha) {
        this.name = name;
        this.fecha = fecha;
    }

    public String getName() {
        return name;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    public int getAge(){
        return toYears(LocalDate.now().toEpochDay() -  fecha.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days/365.25);
    }
}
