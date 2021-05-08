/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GladOS
 */
public class Main {
    public static void main(String[] args){
        Roster someRoster = new Roster();
        someRoster.callParser();
        someRoster.printAll();
        someRoster.callAvgDays();
        someRoster.callDegreePrint();
        someRoster.remove("A3");
        someRoster.printAll();
        someRoster.remove("A3");
    }
}
