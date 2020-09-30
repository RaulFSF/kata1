/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author rauls
 */
public class kata1 {
    public static void main(String[] args) {
        Person persona = new Person("Raul Francisco", LocalDate.of(2000, Month.OCTOBER, 3));
        System.out.println(persona.getName() + " " + persona.getAge());
    }
}
