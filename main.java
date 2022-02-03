import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;


public class main {
    public static Scanner sc = new Scanner(System.in);
    static ArrayList names = new ArrayList();
    static ArrayList ages = new ArrayList();
    static ArrayList genders = new ArrayList();
    static int totalseats = 10;
    static  int bookingnum = 0;
    static int waitingseats = 5;

    public static void main(String[] args) {


        boolean run = true;
        //creating staring #1
        while (run){
          //  art();
            System.out.println("Welome to Railway Ticket Booking ");
            System.out.println( " 1. Book a Ticket \n 2. Cancel a ticket \n 3. view Booked tickets \n 4. exit ");
        int userin = sc.nextInt();

        if (userin == 1) {
            bookaseat();
            totalseats -= 1;
//            if (userin == 1 && totalseats == 0){
//
//            }

        } else if (userin == 4) {
            run = false;
        } else if(userin == 3){
            viewtheticket();
        }else if(userin == 2){
            canceltheticket();
        }
    }





    }
    //functions
    //#1 function for booking

    static void bookaseat(){

        System.out.println("age : ");
        int age = sc.nextInt();
        System.out.println("Enter your name : ");
        String usrname = sc.next();
        System.out.println("gender : ");
        String gender = sc.next();

        names.add(usrname);
        ages.add(age);
        genders.add(gender);
        System.out.println("your booking id is : " + " " + bookingnum);
        bookingnum+=1; // bookingnum = bookingnum + 1;
        System.out.println("booked successfully !!!");


    }

    //#2 function for viewing the boked tickets

    static void viewtheticket(){
        System.out.println("Enter your booking ID : ");
        int userid = sc.nextInt();
        System.out.println(names.get(userid));
        System.out.println(ages.get(userid));
        System.out.println(genders.get(userid));

    }

    //#3 cancel a ticket

    static void canceltheticket(){
        System.out.println("Enter your booking id to cancel : ");
        int cancelbookid = sc.nextInt();
        names.remove(cancelbookid);
        ages.remove(cancelbookid);
        genders.remove(cancelbookid);
        System.out.println("Cancelled successfully !!");

        names.add(cancelbookid,"null");
        ages.add(cancelbookid,0);
        genders.add(cancelbookid,"null");
    }

    //# waiting list
    // need to be created





//   for art
    // static void art(){
    //     String artt = """

    //                 ██╗  ██╗ █████╗ ██████╗ ██╗███████╗    ████████╗██╗ ██████╗██╗  ██╗███████╗████████╗    ██████╗  ██████╗  ██████╗ ██╗  ██╗██╗███╗   ██╗ ██████╗     ███████╗██╗   ██╗███████╗████████╗███████╗███╗   ███╗
    //                 ██║  ██║██╔══██╗██╔══██╗██║██╔════╝    ╚══██╔══╝██║██╔════╝██║ ██╔╝██╔════╝╚══██╔══╝    ██╔══██╗██╔═══██╗██╔═══██╗██║ ██╔╝██║████╗  ██║██╔════╝     ██╔════╝╚██╗ ██╔╝██╔════╝╚══██╔══╝██╔════╝████╗ ████║
    //                 ███████║███████║██████╔╝██║███████╗       ██║   ██║██║     █████╔╝ █████╗     ██║       ██████╔╝██║   ██║██║   ██║█████╔╝ ██║██╔██╗ ██║██║  ███╗    ███████╗ ╚████╔╝ ███████╗   ██║   █████╗  ██╔████╔██║
    //                 ██╔══██║██╔══██║██╔══██╗██║╚════██║       ██║   ██║██║     ██╔═██╗ ██╔══╝     ██║       ██╔══██╗██║   ██║██║   ██║██╔═██╗ ██║██║╚██╗██║██║   ██║    ╚════██║  ╚██╔╝  ╚════██║   ██║   ██╔══╝  ██║╚██╔╝██║
    //                 ██║  ██║██║  ██║██║  ██║██║███████║       ██║   ██║╚██████╗██║  ██╗███████╗   ██║       ██████╔╝╚██████╔╝╚██████╔╝██║  ██╗██║██║ ╚████║╚██████╔╝    ███████║   ██║   ███████║   ██║   ███████╗██║ ╚═╝ ██║
    //                 ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝╚══════╝       ╚═╝   ╚═╝ ╚═════╝╚═╝  ╚═╝╚══════╝   ╚═╝       ╚═════╝  ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝╚═╝  ╚═══╝ ╚═════╝     ╚══════╝   ╚═╝   ╚══════╝   ╚═╝   ╚══════╝╚═╝     ╚═╝
    //                                                                                                                                                                                                                         \s
                               
    //             """;
    //     System.out.println(artt);
    // };



}
