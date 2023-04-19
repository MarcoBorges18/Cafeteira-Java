import java.util.ArrayList;
import java.util.Scanner;

import cafeteira.Cafeteira;
import log.Log;

public class App {
    public static void main(String[] args) throws Exception {
        Cafeteira cafe = new Cafeteira();
        Log log = new Log(new ArrayList<String>());
        Scanner scan = new Scanner(System.in);
        int menu;
        boolean controller = true;

        while(controller){
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Encher Cafe");
            System.out.println("4 - Encher Agua");
            System.out.println("5 - Status");
            System.out.println("6 - Fazer Cafe");
            System.out.println("7 - Fazer Cafe");
            System.out.println("0 - Sair");
            menu = scan.nextInt();
            switch(menu){
                case 0:
                    System.out.println("Você escolheu sair");
                    controller = false;
                break;
                case 1:
                    cafe.ligar();
                    log.registro(cafe.toLog());
                break;
                case 2:
                    cafe.desligar();
                    log.registro(cafe.toLog());
                break;
                case 3:
                    System.out.println("Digite a quantidade de cafe de deseja colocar");
                    cafe.encherCafe(scan.nextInt());
                    log.registro(cafe.toLog());
                break;
                case 4:
                    System.out.println("Digite a quantidade de agua de deseja colocar");
                    cafe.encherAgua(scan.nextInt());
                    log.registro(cafe.toLog());
                break;
                case 5:
                    cafe.status();
                    log.registro(cafe.toLog());
                break;
                case 6:
                    System.out.println("Digite a quantidade de xicaras que deseja fazer");
                    cafe.fazerCafe(scan.nextInt());
                    log.registro(cafe.toLog());
                break;
                case 7:
                    System.out.println(log.toString());
                break;
            }
        }

        scan.close();
    }
}
