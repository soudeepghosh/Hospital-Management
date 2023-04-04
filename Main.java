package hospital_management;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter the role in which you want to login :");
        System.out.println("1. Doctor");
        System.out.println("2. Patient");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Scanner sc = new Scanner(System.in);
        int role = sc.nextInt();
        sc.nextLine();
        if(role == 1){
            System.out.println("Enter your name : ");
            String name = sc.nextLine();
            System.out.println("Enter your password : ");
            String pass = sc.next();
            System.out.println("Hello, Dr. "+name+" ");
            HashSet<String> doctorPass = new HashSet<>();
            doctorPass.add("doctor");
            doctorPass.add("doctor1");
            doctorPass.add("doctor2");
            doctorPass.add("doctor3");

            if(doctorPass.contains(pass)){
                do{
                    System.out.println("==============================");
                    System.out.println("1. Check appointment");
                    System.out.println("2. Patient details");
                    System.out.println("0. Exit");
                    System.out.println("==============================");
                    int choice = sc.nextInt();
                    if(choice==1){
                        int min = 1, max = 200;
                        int rand = (int) (Math.random()*(max-min+1)+min);
                        if(rand%2==0){
                            System.out.println("A patient has just booked to your appointmnent");
                        }else{
                            System.out.println("You have no appointment right now");
                        }
                        System.out.println();
                    }
                    else if(choice==2){
                        Patients p1 = new Patients("Avanti Pratima", "Orthopedics", "    9754665263");
                        Patients p2 = new Patients("Shekhar Radha", " Cardiologists", "  9944189771");
                        Patients p3 = new Patients("Mahendra Anik", " General Surgery", "8805240432");
                        Patients p4 = new Patients("Gayathri Ayaan", "Ophthalmology", "  9195555646");
                        Patients p5 = new Patients("Bhavna Shubham", "ENT Specialists", "7344771321");
                        Patients p6 = new Patients("Nand Pradeep  ", "Neurologists ", "  6298221733");
                        Patients p7 = new Patients("Aswathi krish ", "Psychiatrists ", " 7724651364");
                        Patients[] p = {p1,p2,p3,p4,p5,p6,p7};
                        System.out.println("Patient's Name"+"       "+" Department"+"       "+"   Phone No.");
                        System.out.println("-------------"+"       "+" ----------"+"       "+"   ----------");
                        for(int i=0;i<p.length;i++){
                            System.out.println(p[i]);
                            System.out.println("-----------------------------------------------------------");
                        }
                    }else{
                        System.exit(choice);
                    }
                }while(true);
            }else{
                System.out.println("You have entered wrong password");
            }
        }
        else if(role == 2){
        System.out.println("Enter patient name : ");
        String name = sc.nextLine();
        System.out.println("Enter your password : ");
        String pass = sc.next();
        HashSet<String> patientPass = new HashSet<>();
        patientPass.add("patient1");
        patientPass.add("patient2");
        patientPass.add("patient3");

        if(patientPass.contains(pass)){
            System.out.println(":::::::::::::::::::::::::::::::::::::::");
            System.out.println("Hello, "+name+" welcome to our Hospital");
            
            do {
                System.out.println("=============================");
                System.out.println("1. Doctor's details");
                System.out.println("2. Book appoinment");
                System.out.println("0. Exit");
                System.out.println("=============================");
            char ch = sc.next().charAt(0);

            switch(ch){

                case '0':
                    System.out.println("Thanks for visiting out app..");
                    System.exit(ch);

                case '1' :  

                Doctors[] d = new Doctors[7];
                d[0] = new Doctors("Avanti Pratima", "Orthopedics", "    9754665263");
                d[1] = new Doctors("Shekhar Radha", " Cardiologists", "  9944189771");
                d[2] = new Doctors("Mahendra Anik", " General Surgery", "8805240432");
                d[3] = new Doctors("Gayathri Ayaan", "Ophthalmology", "  9195555646");
                d[4] = new Doctors("Bhavna Shubham", "ENT Specialists", "7344771321");
                d[5] = new Doctors("Nand Pradeep  ", "Neurologists ", "  6298221733");
                d[6] = new Doctors("Aswathi krish ", "Psychiatrists ", " 7724651364");
    
                System.out.println("Doctor's Name"+"       "+" Department"+"       "+"   Phone No.");
                System.out.println("-------------"+"       "+" ----------"+"       "+"   ----------");
                for(int i=0;i<d.length;i++){
                    System.out.println(d[i]);
                    System.out.println("-----------------------------------------------------------");
                }

                break;

                case '2' :
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Enter in which department you want to book your appointment");
                    System.out.println("1. Orthopedics \n 2. Cardiologists \n3. Psychiatrists");
                    System.out.println("4. Ophthalmology \n 5. ENT  \n6. Neurologists");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Enter your choice: ");
                    int choice = sc.nextInt();
                    switch(choice){
                        case 1: 
                            System.out.println("Your appointment has been booked successfully. Go to Orthopedics's department");
                            break;
                        case 2:    
                            System.out.println("Your appointment has been booked successfully. Go to Cardiologist's department.");
                            break;
                        case 3:    
                            System.out.println("Your appointment has been booked successfully. Go to Psychiatrists's department.");
                            break;   
                        case 4:    
                            System.out.println("Your appointment has been booked successfully. Go to Ophthalmology's department.");
                            break;  
                        case 5:    
                            System.out.println("Your appointment has been booked successfully. Go to ENT's department.");
                            break;
                        case 6:    
                            System.out.println("Your appointment has been booked successfully. Go to Neurologists's department.");
                            break;
                        default: System.out.println("You haven't enter the correct choice to book your appointment.");                    
                    }       

                    break;

            }
            }while(true);
            
        }else{
            System.out.println("You have entered wrong password...");
        }
    }
        
        
        
    }
}
