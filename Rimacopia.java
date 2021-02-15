/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Rima {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //Declaració de variables
        String linia1="", linia2="", linia3="", linia4="", fi="",fi1="",fi2="",fi3="";
        int num = 0, caracters=0, estrofa1=0, llargada=0, contador=0;
        
        
        System.out.println("Benvingut al programa \"Tipos de rima\"!!");
        System.out.println("Per favor, indica quantes estrofes vols tractar "
                + "(>=0):");
        
        num = ent.nextInt();
        
        if(num>=1) {
             System.out.println("Perfecte has introduit "+num+" estrofes");
        }
        else {
            System.out.println("Ha de ser major o igual que 0!!");
            System.out.println("Per favor, indica quantes estrofes vols tractar "
                + "(>=0):");
        num = ent.nextInt();
        }
        
        
        
        if (num > 0) {
           
            System.out.println("Per favor, indica a partir de quina lletra "
                    + "vols comprovar la rima (>=1):");
            caracters = ent.nextInt();
        }

        if (caracters <= 1) {
            System.out.println("Per favor, indica a partir de quina lletra "
                    + "vols comprovar la rima (>=1):");
            num = ent.nextInt();
        }

        if (num > 0) {
            System.out.println("Perfecte, comprovarem la rima de les "+num+" últimes lletres del vers!!");
            System.out.println("Per favor, introduix el tipo de rima a comprovar"
                    + ", d'entre els següents:");
            System.out.println("1 (AAAA)");
            System.out.println("2 (AABB)");
            System.out.println("3 (ABBA)");
            System.out.println("4 (ABAB)");
            System.out.println("Tipus de rima (1-4):");
            num = ent.nextInt();
        }

        if (num <= 0) {
            System.out.println("Valor incorrecte");
            System.out.println("Insereix un valor entre 1 i 4");
            num = ent.nextInt();
        }
        
        if (num >= 5) {
            System.out.println("Valor incorrecte");
            System.out.println("Insereix un valor entre 1 i 4");
            num = ent.nextInt();
        }
        
        
        switch (num) {
            case 1:
                if (num == 1) {
                    System.out.println("Perfecte, has triat la rima AAAA, "
                            + "anomenada continua!!");
                    System.out.println("Per favor, introduix els 4 versos de "
                            + "l'estrofa: ");

                    linia1=ent.skip("[\r\n]*").nextLine();
                    llargada=linia1.length()-caracters;
                    
                    for (int i = llargada; i < linia1.length(); i++) {
                        fi=fi+linia1.charAt(i);   
                    }
                    
                    
                    
                    linia2=ent.skip("[\r\n]*").nextLine();
                    llargada=linia2.length()-caracters;
                    for (int i = llargada; i < linia2.length(); i++) {
                        fi1=fi1+linia2.charAt(i);
                    }
                    
                    
                    linia3=ent.skip("[\r\n]*").nextLine();
                    llargada=linia3.length()-caracters;
                    for (int i = llargada; i < linia3.length(); i++) {
                        fi2=fi2+linia3.charAt(i);
                    }
                   
                    linia4=ent.skip("[\r\n]*").nextLine();
                    llargada=linia4.length()-caracters;
                    for (int i = llargada; i < linia4.length(); i++) {
                        fi3=fi3+linia4.charAt(i);
                    }
                    
                    if(fi==fi1 && fi1==fi2 && fi2==fi3){
                        System.out.println("SI");
                    }else{
                        System.out.println("NO");
                    }
                }
                    
            case 2:
                if (num == 2) {
                    System.out.println("Perfecte, has triat la rima AABB, "
                            + "anomenada bessona!!");
                    System.out.println("Per favor, introduix els 4 versos de "
                            + "l'estrofa: ");
                    ent.skip("[\r\n]*").nextLine();
                    ent.skip("[\r\n]*").nextLine();
                    ent.skip("[\r\n]*").nextLine();
                    ent.skip("[\r\n]*").nextLine();
                    
                }
            case 3:
                if (num == 3) {
                    System.out.println("Perfecte, has triat la rima ABBA, "
                            + "anomenada abraçada!!");
                    System.out.println("Per favor, introduix els 4 versos de "
                            + "l'estrofa: ");
                    ent.skip("[\r\n]*").nextLine();
                    ent.skip("[\r\n]*").nextLine();
                    ent.skip("[\r\n]*").nextLine();
                    ent.skip("[\r\n]*").nextLine();
                    
                }
            case 4:
                if (num == 4) {
                    System.out.println("Perfecte, has triat la rima ABAB, "
                            + "anomenada creauada!!");
                    System.out.println("Per favor, introduix els 4 versos de "
                            + "l'estrofa: ");
                    ent.skip("[\r\n]*").nextLine();
                    ent.skip("[\r\n]*").nextLine();
                    ent.skip("[\r\n]*").nextLine();
                    ent.skip("[\r\n]*").nextLine();
                    
                }
                break;
            default:
        }
        System.out.println("Un total de "+estrofa1+" han seguit la rima "
                + "indicada, la qual suposa un "+((double)+contador*100)+" del total "
                        + "d'estrofes introduïdes");
        System.out.println("Adéu!!");
    }
}
