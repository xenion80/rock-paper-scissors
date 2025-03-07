package company;
import java.util.Scanner;
import java.util.Random;
public class practical {
    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        System.out.println("pick your number human for rock,paper or scissors");
        int sc= t.nextInt();
        switch (sc){
            case 1 -> System.out.println("rock");
            case 2 -> System.out.println("paper");
            case 3 -> System.out.println("scissors");
        }
        Random v= new Random();
        int comp= v.nextInt(1,4);
        System.out.println("computer has chosen");
        switch(comp){
            case 1 -> System.out.println("rock");
            case 2 -> System.out.println("paper");
            case 3 -> System.out.println("scissors");

        }
        if((sc==1 && comp==2)||(sc==2&&comp==3)||(sc==3&&comp==1)){
            System.out.println("computer has won ");
        }
        else if(sc>=4){
            System.out.println("choose right number");
        }
        else if((sc==1&&comp==1)||(sc==2&&comp==2)||(sc==3&&comp==3)){
            System.out.println("draw");
        }

        else{
            System.out.println("you won");
        }


    }
}
