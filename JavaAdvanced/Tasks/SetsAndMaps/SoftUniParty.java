package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> VIP = new LinkedHashSet<>();
        Set<String> regular = new LinkedHashSet<>();  // it would be better if the task use TreeSet instead of two LinkedHashSets

        String reservationNumber = scanner.nextLine();

        while (!reservationNumber.equals("PARTY")) {

            char startingSymbol = reservationNumber.charAt(0);

            boolean isVipRegistration = Character.isDigit(startingSymbol);
            if (isVipRegistration) {
                VIP.add(reservationNumber);
            } else {
                regular.add(reservationNumber);
            }
            reservationNumber = scanner.nextLine();
        }

        String guestReservation = scanner.nextLine();
        while (!guestReservation.equals("END")) {

            VIP.remove(guestReservation);
            regular.remove(guestReservation);

            guestReservation = scanner.nextLine();
        }

        System.out.println(VIP.size() + regular.size());
        System.out.println(String.join(System.lineSeparator(), VIP) + String.join(System.lineSeparator(), regular));
    }
}
