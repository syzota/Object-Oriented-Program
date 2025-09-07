/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus GK
 */

public class posttest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> artis = new ArrayList<>();
        ArrayList<String> genre = new ArrayList<>();
        
        boolean running = true;

        while (running) {
            System.out.println("\n+-----------------------------------------+");
            System.out.println("|       UNIVERSAL MUSIC GROUP (UMG)       |");
            System.out.println("|       ARTIST MANAGEMENT SYSTEM          |");
            System.out.println("+-----------------------------------------+");
            System.out.println("1. Add Artist");
            System.out.println("2. View Artist");
            System.out.println("3. Update Artist");
            System.out.println("4. Delete Artist");
            System.out.println("5. Exit");
            System.out.print("Choose the number between 1 to 5: ");
            int pilih = -1;
            try {
                  pilih = sc.nextInt();
                    sc.nextLine(); 
            } catch (Exception e) {
                    System.out.println("Enter the right thing, please!");
                    sc.nextLine(); 
                    continue; 
            }


            switch (pilih) {
                case 1:
                    System.out.print("Add the new artist's name   : ");
                    String nama = sc.nextLine();
                    System.out.print("Add their genre             : ");
                    String g = sc.nextLine();
                    artis.add(nama);
                    genre.add(g);
                    System.out.println("The artist added to our data successfully!");
                    break;

                case 2:
                    System.out.println("\n+-----------------------------------------+");
                    System.out.println("|       UNIVERSAL MUSIC GROUP (UMG)       |");
                    System.out.println("|            OUR ARTISTS LIST             |");
                    System.out.println("+-----------------------------------------+");
                    if (artis.isEmpty()) {
                        System.out.println("There are no artist that have been added.");
                    } else {
                        for (int i = 0; i < artis.size(); i++) {
                            System.out.println((i+1) + ". " + artis.get(i) + " (" + genre.get(i) + ")");
                        }
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Insert the number of the artist you want to update: ");
                        int idxU = sc.nextInt() - 1;
                        sc.nextLine();
                        if (idxU >= 0 && idxU < artis.size()) {
                            System.out.print("New name: ");
                            artis.set(idxU, sc.nextLine());
                            System.out.print("New genre: ");
                            genre.set(idxU, sc.nextLine());
                            System.out.println("The artist's data have been updated successfully!");
                        } else {
                            System.out.println("Enter the right number, please!");
                        }
                    } catch (Exception e) {
                        System.out.println("Enter the right number, please!");
                        sc.nextLine(); 
                    }
                    break;

                case 4:
                    try {
                        System.out.print("Insert the number of the artist you want to delete: ");
                        int idxH = sc.nextInt() - 1;
                        sc.nextLine();
                        if (idxH >= 0 && idxH < artis.size()) {
                            artis.remove(idxH);
                            genre.remove(idxH);
                            System.out.println("The artist's data have been deleted successfully!");
                        } else {
                            System.out.println("Enter the right number, please!");
                        }
                    } catch (Exception e) {
                        System.out.println("Enter the right number, please!");
                        sc.nextLine(); 
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Bye!");
                    break;

                default:
                    System.out.println("Enter the right thing, please!");
            }
        }
        sc.close();
    }
}
