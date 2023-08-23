package studentmanagementsystem;
import java.util.*;
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
   
    ArrayList<String> st = new ArrayList<String>();
    ArrayList<Integer> str = new ArrayList<Integer>();
    ArrayList<String> fn = new ArrayList<String>();
    ArrayList<String> gen = new ArrayList<String>();
    ArrayList<Integer> cs = new ArrayList<Integer>();
    ArrayList<Integer> age = new ArrayList<Integer>();
    
    
    public int returnIndex(int c){
            int index = str.indexOf(c);
            return index;
    }
    
    
    void meth(){
     teacher obj1 = new teacher();  
     Scanner scan = new Scanner(System.in);
     
  int a=50;
        
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
        
         
              
        str.add(1);    str.add(2);    str.add(3);   str.add(4);
        str.add(5);    str.add(6);   str.add(7);    str.add(8);
        str.add(9);     str.add(10);    str.add(11);      str.add(12);
        str.add(13);    str.add(14);   str.add(15);     str.add(16);
        str.add(17);  str.add(18);  str.add(19);    str.add(20);
        str.add(21);   str.add(22);   str.add(23);    str.add(24);
        str.add(25);   str.add(26);  str.add(27);    str.add(28);
        str.add(29);    str.add(30);   str.add(31);  str.add(32);
        str.add(33);    str.add(34);   str.add(35);     str.add(36);
        str.add(37);   str.add(38);   str.add(39);     str.add(40);    
        str.add(41);     str.add(42);  str.add(43);     str.add(44);
        str.add(45);  str.add(46);   str.add(47);     str.add(48);
        str.add(49);   str.add(50); 
        
        
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
                str.add(a);
                System.out.println("Student added Successfully ");
                System.out.println("\nNow,Total No. of Students are = "+ st.size() );
                }
                break;  
                
            case 2 : 
                System.out.println("\nTotal No. Of Students in School = "+ st.size() );
                System.out.println("\nStudents with Roll Numbers : ");
                for(int h=0; h<st.size();h++){
                    System.out.print(st.get(h) + "(" + str.get(h)+")"+ " "); 
                }
                     
                System.out.print("\nEnter Student roll num which you want to remove: ");
                int index = returnIndex(scan.nextInt());
                st.remove(index);
                str.remove(index);
                fn.remove(index);
                gen.remove(index);
                cs.remove(index);
                age.remove(index);   
                System.out.println("Student removed Successfully. ");
                System.out.println("\nTotal No. of Students are = "+ st.size() );
                System.out.println("\nUpdated Student List:");
                for(int h=0; h<st.size();h++){
                    System.out.print(st.get(h) + "(" + str.get(h)+")"+ " "); 
                }
                break;  
                
            case 3 : 
                System.out.println("Total Students: "+st.size());
                System.out.print("Enter Roll No you want to Search: ");
                int roll_num = scan.nextInt();
                int y = returnIndex(roll_num);         
                System.out.println("\nStudent at Roll No: "+roll_num+" is "+st.get(y));
                System.out.println("");
                System.out.print("Do you want "+st.get(y)+"'s information:(type yes or no) ");
                
                String d = scan.next();
                String o = "Yes";
                String p = "yes";

                if(o.equals(d) || p.equals(d)){              
                System.out.println("\nName: "+st.get(y));
                System.out.println("Roll Number: "+str.get(y));
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
                int b = returnIndex(scan.nextInt());
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
                
                System.out.println("\nThe information has been updated.");
           
                System.out.println("\nStudent Names : "+ st );
                break;
                
            case 5 : 
                
                System.out.println("Total number of Students: "+st.size());
                System.out.println("Students With Rollnumbers: ");
                for(int h=0; h<st.size();h++){
                    System.out.print(st.get(h) + "(" + str.get(h)+")"+ " "); 
                }
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
            
            case 11:
                int ind = 0;
                System.out.println("\nStudent Roll Numbers : "+ str );
                System.out.println("Enter roll num:");
                int in = scan.nextInt();
                ind = returnIndex(in);
                System.out.println("Index is:" + ind);
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
