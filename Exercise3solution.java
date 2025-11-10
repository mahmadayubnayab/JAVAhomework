
package exercise3solution;

import java.util.Scanner;

public class Exercise3solution {

 
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);  
        
        
        
        
        
        
          // exercise three solution;
   
   
   
   // question number 3.1; 
   
  /*      System.out.println("enter a , b , c : ");
   double a = input.nextDouble();
   double b  = input.nextDouble();
   double c  = input.nextDouble();
 double determinant = (b*b) - (4* a * c);
   if(determinant>0){
   double r1 = (-b + Math.sqrt(determinant))/(2*a);
   double r2 = (-b - Math.sqrt(determinant))/(2*a);
       System.out.println("this function has two  roots = " +r1 + r2 );
  
   }else if(determinant==0){
   double r1 = -b/(2*a);
       System.out.println("this function has one root = " + r1);
   }else {
        System.out.println("this function has not root ");
   }*/
   
        
           
  // question number 3.2;
  
     /*  int num1 = (int)(Math.random()*100);
       int num2 = (int)(Math.random()*100);
       int num3 = (int)(Math.random()*100);

    int sum = num1 + num2 + num3;
        System.out.println("this is sum of three number " +sum );  
   
        System.out.print("enter one number ");
       int number = input.nextInt();
       if(sum == number ){
           System.out.println("your cod is true ");
       }else {
           System.out.println("your cod is wrong ");
       }*/   
  

     
  // question number 3.3;
  
    /* System.out.println("enter a1 , b1,c1,,a2,b2,c2,");
     double a1 = input.nextDouble();
     double b1 = input.nextDouble();
     double c1 = input.nextDouble();
     double a2 = input.nextDouble();
     double b2 = input.nextDouble();
     double c2 = input.nextDouble();

     double determinant = (a1*b2) - (a2*b1);
     double xdeter = (c1*b2) - (c2*b1);
     double ydeter = (a1*c2) - (a2* c1);
     
     if(determinant != 0){
     double x = xdeter/determinant;
     double y = ydeter/determinant;
         System.out.println("these are x and y value =" + x   + y  );
     }else {
         System.out.println("this function does not has solution");
     }*/
     
   
 // question number 3.4;
 
  /*  int a = (int)(Math.random() * 12);
        System.out.println(a);
    
    if(a==1){
        System.out.println("month is junwary");
    }else if(a==2){
        System.out.println("month is fiburwary");
    } else if(a==3){
        System.out.println("month is march");
    }else if(a==4){
        System.out.println("month is afril");
    }else if(a==5){
        System.out.println("month is may");
    }else if(a==6){
        System.out.println("month is june");
    }else if(a==7){
        System.out.println("month is july");
    }else if(a==8){
        System.out.println("month is agust");
    }else if(a==9){
        System.out.println("month is september");
    }else if(a==10){
        System.out.println("month is octuber");
    }else if(a==11){
        System.out.println("month is novmber");
    }  else if(a==12){
        System.out.println("month is desumber");
    } else{
        System.out.println("your cod is wrong");
    } */

 
  
  // question number 3.5;
  
     /*   System.out.println("enter your weigth and heigth ");
  double  weigth = input.nextInt();
  double  heigth = input.nextInt();
  double bmi = weigth / (heigth* heigth);
  
  if(bmi<=18.5){
      System.out.println(" you are under weigth ");
  }else if(bmi < 25 ){
      System.out.println("you are normal ");
  }else if(bmi < 30){
        System.out.println("you are overweigth");
    }else if(bmi >30){
      System.out.println("you are obase ");
    }else{
      System.out.println("   ");
    } */ 
  
    
     // question number 3.10;
     
    /* int num1 = (int)(Math.random()* 100); 
     int num2 = (int)(Math.random()* 100); 
        System.out.println(num1);
        System.out.println(num2);
        int sum = num1 + num2;
     System.out.println("this sum of num1 + num2 = " +  sum  );*/
    
    
    
    // question number  3.11
    
     /*   System.out.println("enter one month of year");
    int month = input.nextInt();
    int days;
    switch(month){
        case 1: 
        case 3:  case 5: case 7:
        case 8: case 10: case 12: 
            days =31;
            break;
        case 4: case 6: case 9: case 11: 
            days = 30;
            break;
        case 2:
            System.out.println("is this year leap :"  );
            boolean leapyear = input.nextBoolean();
          days = (leapyear)? 29:28;
          break;
        default:
            System.out.println("enter one number 1 to 12 ");
            
            return;
    }
        System.out.println("this month  " + days + " day  has");*/
     
     
     
     
     // question number 3.12;
     
     /*   System.out.println("enter one  number ");
     int number = input.nextInt();
     int original  = number;
     int reversed = 0;
     while (number != 0){
     
         int digit = number % 10;
         reversed = reversed *10 + digit ;
         number /=10;
         
             } if(original == reversed){
             System.out.println("this is  palindrom number");
             
             }else{
                 System.out.println("this is not palindrom number ");
             } */
    
        
       
    }
    
}
