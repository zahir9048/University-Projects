/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagementsystem;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Zahir
 */

class School {
    String[] ta={"misbah","uzma","sakeena","afshan","","","","",""};
        int tasize = ta.length;
        
        String[] subj={"maths","urdu","chemistry","pst","","","","",""};
        int subjsize = subj.length;
}
class teacher extends School{
        
        int a=0,i=0;
        Scanner scan = new Scanner(System.in);
        
        void addSubjTeacher(){
            System.out.print("Enter teacher name you want to add: ");
            String tname = scan.next();
            
            while(a<ta.length){
            if(ta[a]==""){
              ta[a] = tname;
            break;
            }
            a++;
            }
            a=0;
        
            System.out.print("Enter Subject you want to add: ");
            String subject = scan.next();
            
            while(a<subj.length){
            if(subj[a]==""){
              subj[a] = subject;
            break;
            }
            a++;
            }
            a=0;
            System.out.println("\nThe teacher and subject has been added.");
            System.out.print("Do you want to see all the teachers? Type yes or no: ");
            String inp = scan.next();
            String Yes = "Yes";
            String yes = "yes";
            
            if(Yes.equals(inp) || yes.equals(yes)){
            System.out.print("\nTeachers  ");
         System.out.println(" \tSubjects ");
         System.out.println(ta[a] +"  \t"+subj[a]);
         System.out.println(ta[a+1]+" \t\t"+subj[a+1]);
         System.out.println(ta[a+2]+" \t"+subj[a+2]);
         System.out.println(ta[a+3]+" \t\t"+subj[a+3]); 
         System.out.println(ta[a+4]+" \t\t"+subj[a+4]);
         System.out.println(ta[a+5]+" \t\t"+subj[a+5]); 
            }
            else{
                System.out.println("Ok, no problem.");
            }
        }
        
       void showteacher(){
      System.out.print("Teachers  ");
      System.out.println(" \tSubjects ");
      System.out.println(ta[a] +"  \t"+subj[a]);
      System.out.println(ta[a+1]+" \t\t"+subj[a+1]);
      System.out.println(ta[a+2]+" \t"+subj[a+2]);
      System.out.println(ta[a+3]+" \t\t"+subj[a+3]); 
      System.out.println(ta[a+4]+" \t\t"+subj[a+4]);
      System.out.println(ta[a+5]+" \t\t"+subj[a+5]); 
       } 
       
       void editTeacherSubject(){
           
           System.out.print("Current Teachers  ");
      System.out.println(" \tSubjects ");
      System.out.println(ta[a] +"  \t\t"+subj[a]);
      System.out.println(ta[a+1]+" \t\t\t"+subj[a+1]);
      System.out.println(ta[a+2]+" \t\t"+subj[a+2]);
      System.out.println(ta[a+3]+" \t\t\t"+subj[a+3]); 
      System.out.println(ta[a+4]+" \t\t\t"+subj[a+4]);
      System.out.println(ta[a+5]+" \t\t\t"+subj[a+5]);
      
           System.out.print("\nEnter the teacher name you want to edit: ");
           String del = scan.next();
       a=0;
        while(a<ta.length){
            if(ta[a].equals(del)){
           i=a;
               ta[a]= "";
            break;
            }    
            a++;
        }
        
        System.out.print("Enter the teacher name you want to put: ");
        String nam = scan.next();
            while(a<ta.length){
            if(ta[a]==""){
              ta[a] = nam;
            break;}
            a++;
            }
            a=0;
            
     System.out.println("");       
     System.out.print("Do you want to change/edit Subject too? type yes or no: ");
           String dec = scan.next();
           System.out.println("");
           String Yes = "Yes"; 
           String yes = "yes";
           
           if(Yes.equals(dec) || yes.equals(dec)){
           System.out.print("Enter Subject you want to change: ");
           String delsub = scan.next();
            
          a=0;
        while(a<subj.length){
            if(subj[a].equals(delsub)){
           i=a;
               subj[a]= "";
            break;
            }    
            a++;
        }
        
        System.out.print("Enter Subject you want to put: ");
        String namsubj = scan.next();
        System.out.println("");
     
            while(a<subj.length){
            if(subj[a]==""){
              subj[a] = namsubj;
            break;}
            a++;
            }
            a=0;
       }
           else{
            System.out.println("Ok, no problem.");
            System.out.println("");
           }
           System.out.print("Changed Teachers  ");
      System.out.println(" \tSubjects ");
      System.out.println(ta[a] +"  \t\t"+subj[a]);
      System.out.println(ta[a+1]+" \t\t\t"+subj[a+1]);
      System.out.println(ta[a+2]+" \t\t"+subj[a+2]);
      System.out.println(ta[a+3]+" \t\t\t"+subj[a+3]); 
      System.out.println(ta[a+4]+" \t\t\t"+subj[a+4]);
      System.out.println(ta[a+5]+" \t\t\t"+subj[a+5]);
       }
        
    }

class info{
    void meth(){
     teacher obj1 = new teacher();  
        Scanner scan = new Scanner(System.in);
     
  int a=50;
        ArrayList<String> st = new ArrayList<String>();
        st.add("waleed");   st.add("rafay");   st.add("shahmeer");  st.add("zeeshan");
        st.add("zainab");   st.add("zernab");  st.add("hussain");   st.add("abdullah");
        st.add("adnan");    st.add("nida");    st.add("musa");      st.add("jawad");
        st.add("aiman");    st.add("jamal");   st.add("hamza");     st.add("maaz");
        st.add("inshaal");  st.add("morris");  st.add("hassan");    st.add("usama");
        st.add("shayan");   st.add("talha");   st.add("taseer");    st.add("sameer");
        st.add("muneeb");   st.add("fatima");  st.add("etezaz");    st.add("raheel");
        st.add("owais");    st.add("wahab");   st.add("mubashir");  st.add("ubaid");
        st.add("yasir");    st.add("rehan");   st.add("arham");     st.add("nabeel");
        st.add("zaheer");   st.add("sajid");   st.add("fawad");     st.add("masooma");    
        st.add("rida");     st.add("aneesa");  st.add("alina");     st.add("aliza");
        st.add("jamshed");  st.add("faraz");   st.add("maria");     st.add("farhan");
        st.add("kamran");   st.add("zafar");
        
         ArrayList<String> str = new ArrayList<String>();
              
        str.add("waleed(1)");    str.add("rafay(2)");    str.add("shahmeer(3)");   str.add("zeeshan(4)");
        str.add("zainab(5)");    str.add("zernab(6)");   str.add("hussain(7)");    str.add("abdullah(8)");
        str.add("adnan(9)");     str.add("nida(10)");    str.add("musa(11)");      str.add("jawad(12)");
        str.add("aiman(13)");    str.add("jamal(14)");   str.add("hamza(15)");     str.add("maaz(16)");
        str.add("inshaal(17)");  str.add("morris(18)");  str.add("hassan(19)");    str.add("usama(20)");
        str.add("shayan(21)");   str.add("talha(22)");   str.add("taseer(23)");    str.add("sameer(24)");
        str.add("muneeb(25)");   str.add("fatima(26)");  str.add("etezaz(27)");    str.add("raheel(28)");
        str.add("owais(29)");    str.add("wahab(30)");   str.add("mubashir(31)");  str.add("ubaid(32)");
        str.add("yasir(33)");    str.add("rehan(34)");   str.add("arham(35)");     str.add("nabeel(36)");
        str.add("zaheer(37)");   str.add("sajid(38)");   str.add("fawad(39)");     str.add("masooma(40)");    
        str.add("rida(41)");     str.add("aneesa(42)");  str.add("alina(43)");     str.add("aliza(44)");
        str.add("jamshed(45)");  str.add("faraz(46)");   str.add("maria(47)");     str.add("farhan(48)");
        str.add("kamran(49)");   str.add("zafar(50)");
        
        ArrayList<String> fn = new ArrayList<String>();
        fn.add("yasir");   fn.add("rehan");  fn.add("arham");     fn.add("nabeel");
        fn.add("zaheer");  fn.add("sajid");  fn.add("fawad");     fn.add("masoom");    
        fn.add("ahmed");   fn.add("haris");  fn.add("ali");       fn.add("ali");
        fn.add("waleed");  fn.add("rafay");  fn.add("shahmeer");  fn.add("zeeshan");
        fn.add("khan");    fn.add("imtiaz"); fn.add("hussain");   fn.add("abdullah");
        fn.add("adnan");   fn.add("sohail"); fn.add("musa");      fn.add("jawad");
        fn.add("aiman");   fn.add("jamal");  fn.add("hamza");     fn.add("maaz");
        fn.add("inshaal"); fn.add("morris"); fn.add("hassan");    fn.add("usama");
        fn.add("shayan");  fn.add("talha");  fn.add("taseer");    fn.add("sameer");
        fn.add("muneeb");  fn.add("amir");   fn.add("etezaz");    fn.add("raheel");
        fn.add("owais");   fn.add("wahab");  fn.add("mubashir");  fn.add("ubaid");
        fn.add("kamil");   fn.add("jamal");  fn.add("abid");      fn.add("rashid");
        fn.add("mudasir"); fn.add("usman");
        
        ArrayList<String> gen = new ArrayList<String>();
        gen.add("M");    gen.add("M");   gen.add("M");     gen.add("M");
        gen.add("F");   gen.add("F");   gen.add("M");     gen.add("M");    
        gen.add("M");     gen.add("F");  gen.add("M");     gen.add("M");
        gen.add("F");   gen.add("M");   gen.add("M");  gen.add("M");
        gen.add("M");   gen.add("M");  gen.add("M");   gen.add("M");
        gen.add("M");    gen.add("M");    gen.add("M");      gen.add("M");
        gen.add("M");    gen.add("F");   gen.add("M");     gen.add("M");
        gen.add("M");  gen.add("M");  gen.add("M");    gen.add("M");
        gen.add("M"); gen.add("M");   gen.add("M");    gen.add("M");
        gen.add("M");   gen.add("M");  gen.add("M");    gen.add("F");
        gen.add("F");    gen.add("M");   gen.add("F");  gen.add("F");
        gen.add("M");    gen.add("M");   gen.add("F");  gen.add("M");
        gen.add("M");   gen.add("M");
        
        ArrayList<Integer> cs = new ArrayList<Integer>();
        cs.add(3);    cs.add(10);   cs.add(6);     cs.add(10);
        cs.add(7);   cs.add(5);   cs.add(6);     cs.add(1);    
        cs.add(9);     cs.add(4);  cs.add(5);     cs.add(5);
        cs.add(4);   cs.add(4);   cs.add(10);  cs.add(4);
        cs.add(6);   cs.add(2);  cs.add(3);   cs.add(1);
        cs.add(9);    cs.add(10);    cs.add(1);      cs.add(9);
        cs.add(1);    cs.add(10);   cs.add(2);     cs.add(6);
        cs.add(8);  cs.add(8);  cs.add(2);    cs.add(4);
        cs.add(10); cs.add(3);   cs.add(7);    cs.add(9);
        cs.add(7);   cs.add(5);  cs.add(4);    cs.add(6);
        cs.add(10);    cs.add(2);   cs.add(4);  cs.add(3);
        cs.add(7);    cs.add(3);   cs.add(8);  cs.add(1);
        cs.add(10);    cs.add(5);  
        
        ArrayList<Integer> age = new ArrayList<Integer>();
        age.add(8);    age.add(15);   age.add(11);     age.add(15);
        age.add(12);    age.add(10);   age.add(11);     age.add(6);
        age.add(14);    age.add(9);   age.add(10);     age.add(10);
        age.add(9);    age.add(9);   age.add(15);     age.add(9);
        age.add(11);    age.add(7);   age.add(8);     age.add(6);
        age.add(14);    age.add(15);   age.add(6);     age.add(14);
        age.add(6);    age.add(15);   age.add(7);     age.add(11);
        age.add(13);    age.add(13);   age.add(7);     age.add(9);
        age.add(15);    age.add(8);   age.add(12);     age.add(14);
        age.add(12);    age.add(10);   age.add(9);     age.add(11);
        age.add(15);    age.add(7);   age.add(9);     age.add(8);
        age.add(14);    age.add(8);   age.add(14);     age.add(6);
        age.add(16);    age.add(11);
        
        
        char ch;
       
        do{
            
            System.out.println("***DIAMOND HIGH SCHOOL MANAGEMENT SYSTEM***");
            System.out.println("\n\nPress 1 to Add New Student in System: ");
            System.out.println("Press 2 to Remove Student from System :");
            System.out.println("Press 3 to Search Student by Roll No: ");
            System.out.println("Press 4 to Edit name of Students: ");
            System.out.println("Press 5 to Show all Students and their information: ");
            System.out.println("Press 6 to Add teacher in School: ");
            System.out.println("Press 7 to Show all teachers of School: ");
            System.out.println("Press 8 to Edit teachers and Subjects: ");
            System.out.println("Press 9 to Show Fee Structure: ");
            System.out.println("Press 10 to Clear all data ! ");
            System.out.print("\nPress any number from given choices: ");
            int choice = scan.nextInt();  
            System.out.println("");
            switch (choice) 
            {
            case 1 : 
                System.out.println("\nTotal No. Of Students in School = "+ st.size() );
                System.out.print("Enter number of students you want to add: ");
                int n = scan.nextInt();
                for(int j = 1;  j<=n;j++){
                System.out.print("\nEnter Student "+j+" Name: ");
                st.add(scan.next()); 
                System.out.print("Enter Father Name: ");
                fn.add(scan.next());
                System.out.print("Enter Gender: ");
                gen.add(scan.next());
                System.out.print("Enter Class: ");
                cs.add(scan.nextInt());
                System.out.print("Enter Age: ");
                age.add(scan.nextInt());
                a++;
                System.out.println("Roll No. assigned to Student is : "+a);   
                System.out.println("Student added Successfully ");
                System.out.println("\nNow,Total No. of Students are = "+ st.size() );
                }
                break;  
                
                 case 2 : 
                System.out.println("\nTotal No. Of Students in School = "+ st.size() );
                System.out.println("\nStudent Names with Roll Numbers : "+ str );
                System.out.print("\nEnter Student name which you want to remove: ");
                String z=scan.next();
                st.remove(z);
                fn.remove(z);
                gen.remove(z);
                cs.remove(z);
                age.remove(z);   
                System.out.println("Student removed Successfully. ");
                System.out.println("\nTotal No. of Students are = "+ st.size() );
                System.out.println("\nStudent Names = "+ st );
                a--;
                break;  
                
            case 3 : 
                System.out.println("Total Roll numbers of Students: "+st.size());
                System.out.print("Enter Roll No you want to Search: ");
                int x=scan.nextInt();
                int y = x-1;           
                System.out.println("\nStudent at Roll No: "+x+" is "+st.get(y));
                System.out.println("");
                System.out.print("Do you want "+st.get(y)+"'s information:(type yes or no) ");
                
                String d = scan.next();
                String o = "Yes";
                String p = "yes";

                if(o.equals(d) || p.equals(d)){              
                System.out.println("\nName: "+st.get(y));
                System.out.println("Father's Name: "+fn.get(y));
                System.out.println("Gender: "+gen.get(y));
                System.out.println("Class: "+cs.get(y));
                System.out.println("Age: "+age.get(y));
                }
                else{
                System.out.println("Ok, no problem");
                }
                break;        
                                            
            case 4 : 
                     
                System.out.println("\nTotal No. Of Students in School = "+ st.size() );
                System.out.println("Student Names with Roll Numbers : "+ str );
                System.out.print("\nEnter Roll No. which you want to edit: ");
                int c = scan.nextInt();
                int b = c-1;
                System.out.print("\nEnter name which you want to put: ");
                String value1 = scan.next();
                st.set(b,value1);
                System.out.print("\nEnter father's name which you want to put: ");
                String value2 = scan.next();
                fn.set(b,value2);
                System.out.print("\nEnter gender which you want to put: ");
                String value3 = scan.next();
                gen.set(b,value3);
                System.out.print("\nEnter class which you want to put: ");
                int value4 = scan.nextInt();
                cs.set(b,value4);
                System.out.print("\nEnter age which you want to put: ");
                int value5 = scan.nextInt();
                st.set(b,value1);
                fn.set(b,value2);
                gen.set(b,value3);
                cs.set(b,value4);
                age.set(b,value5);
                
                System.out.println("\nTyhe information has been updated.");
           
                System.out.println("\nStudent Names : "+ st );
                break;
                
            case 5 : 
                //for(int i=0;i<da.size();i++)
                System.out.println("Total number of Students: "+st.size());
                System.out.println("Names = "+ st );
                System.out.println("Which Stude");
                System.out.println("\n Father's Names of all Students = "+ fn );
                System.out.println("\nGenders of all Students = "+ gen );
                System.out.println("\nClasses of all Students = "+ cs );
                System.out.println("\nAges of all Students = "+ age );
                break; 
            
                case 6 : 
                obj1.addSubjTeacher();

                break;
                
                case 7 : 
                obj1.showteacher();
                break;
                
                case 8 : 
                obj1.editTeacherSubject();
                break;
                
            case 9 :
                System.out.println("\nAdmission fee =10,000/-RS ");
                System.out.println("\nGrade 1 fee = 1,500/-RS ");
                System.out.println("\nGrade 2 fee = 1,600/-RS ");
                System.out.println("\nGrade 3 fee = 1,650/-RS ");
                System.out.println("\nGrade 4 fee = 1,700/-RS ");
                System.out.println("\nGrade 5 fee = 1,750/-RS ");
                System.out.println("\nGrade 6 fee = 1,800/-RS ");                
                System.out.println("\nGrade 7 fee = 1,900/-RS ");
                System.out.println("\nGrade 8 fee = 2,000/-RS ");
                System.out.println("\nGrade 9 fee = 2,500/-RS ");
                System.out.println("\nGrade 10 fee =2,600/-RS ");
                break;         
                
            case 10 :
                System.out.print("Do you really want to clear all data? type yes ot no: ");
                String e = scan.next();
                String Yes = "Yes";
                String yes = "yes";
                
                if(Yes.equals(e) || yes.equals(e)){
                
                System.out.println("\nTotal No. Of Students in School = "+ st.size() );
                st.clear();
                fn.clear();
                gen.clear();
                cs.clear();
                age.clear();
                System.out.println("\nAll data Cleared Successfully.");
                System.out.println("\nTotal No. of Students now = "+ st.size() );
                }
                else{
                System.out.println("Ok , no problem.");    
                }
                break;    

            default: 
                System.out.println("Wrong Entry \n ");
                break;   
            }    
            
            System.out.print("\n\nDo you want to continue (Type y or n): ");
            ch = scan.next().charAt(0);  
            System.out.println("");
        } while (ch == 'Y'|| ch == 'y'); 
        System.out.println("Thanks for using our App. Goodbye!");
  }
}

public class StudentManagementSystem {
     public static void main(String[] args){   
        
       Scanner scan = new Scanner(System.in); 
       info obj1 = new info();
       
        System.out.println("\n");
        System.out.println("**********************************");
        System.out.println("*                                *");
        System.out.println("* Welcome to DIAMOND HIGH SCHOOL *");
        System.out.println("*                                *");
        System.out.println("**********************************");
        System.out.println("\nWhich Branch you work in ? ");
        System.out.println("1) F.B.Area Branch         ");
        System.out.println("2) Gulshan e Iqbal Branch  ");
        System.out.println("3) North Nazimabad Branch  ");
        System.out.print("Press 1,2,3: ");
        int i = scan.nextInt();
        
        if(i==1 || i==2 || i ==3){
        if(i==1){
         System.out.println("\n\n\t    F.B.Area Branch");    
            }
        else if(i==2){
            System.out.println("\n\n\t  Gulshan e Iqbal Btanch");
        }
        else if(i==3){
            System.out.println("\n\n\t  North Nazimabad Branch ");
        }
         System.out.println(""); 
         obj1.meth();
        }
        else{
            System.out.println("Wrong keword entered.");
        }
    }
    
}
