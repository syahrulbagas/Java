/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamerental;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Toshiba
 */
public class gold extends member {
     public int jmlCashback;
    
    int cashback(){
         if ("M002".equals(this.id)){
            this.jmlCashback = 5000;
        } else if ("M003".equals(this.id)){
            this.jmlCashback = 10000;
        } else{
            this.jmlCashback = 0;
        }
        return this.jmlCashback;
    }
}
