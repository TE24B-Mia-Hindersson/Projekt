void main() {
    int[] passagerare = new int[20];
    boolean fortsatt = true;
    while (fortsatt) {
        IO.println("BOKNINGSSYSTEM BUSS");
        IO.println("1. Boka en plats");
        IO.println("2. Visa lediga platser ");
        IO.println("3.Beräkna vinsten");
        IO.println("4.Hitta bokning");
        IO.println("5.Ta bort bokning");
        IO.println("6. Avsluta");
        String svar = IO.readln("Ange ditt val");
        int val = Integer.parseInt(svar);
        if (val == 1) {
            int plats = -1;
            // hitta ledig plats
            for (int i = 0; i < passagerare.length; i++) {
                if (passagerare[i] == 0) {
                    plats = i;
                    break;
                }
            }
            if (plats == -1) {
                IO.println("Bussen är full!");
            } else {
                String svardate = IO.readln("Ange födelsedatum (YYYYMMDD)");
                int date = Integer.parseInt(svardate);
                passagerare[plats] = date;
                IO.println("Bokningen är klar!");
                IO.println("Din plats är:" + (plats + 1));
                IO.readln("Tryck enter för att fortsätta:");
            }
        }
        if (val == 2) {
            int lediga = 0;
            for (int i = 0; i < passagerare.length; i++) {
                if (passagerare[i] == 0) {
                    lediga++;
                }
            }
            IO.println("Det finns" + lediga + "platser kvar");
            IO.readln("Tryck enter för att fortsätta:");
        }
        if (val == 3) {
            int bokade = 0;
            for (int i = 0; i < passagerare.length; i++) {
                if (passagerare[i] != 0) {
                    bokade++;
                }
            }
            double vinst = bokade * 299.90;
            IO.println("Antal bokade platser:" + bokade);
            IO.println("Vinsten är:" + vinst);
            IO.readln("Tryck enter för att fortsätta:");
        }
        if (val == 4) {
            String svardate = IO.readln("Ange födelsedatum (YYYYMMDD)");
            int date = Integer.parseInt(svardate);
            boolean hitta = false;
            for (int i = 0; i < passagerare.length; i++) {
                if (passagerare[i] == date) {
                    IO.println("personen sitter på " + i + 1);
                    hitta = true;
                }
            }
            if (hitta == false) {
                IO.println("bokningen finns inte!");
            }
            IO.readln("Tryck enter för att fortsätta:");
        }
        if (val == 5) {
            String svardate = IO.readln("Ange födelsedatum (YYYYMMDD)");
            int date = Integer.parseInt(svardate);
            boolean hitta = false;
            for (int i = 0; i < passagerare.length; i++) {
                if (passagerare[i] == date) {
                    IO.println("Bokningen på plats " + (i + 1) + "är bortagen");
                    passagerare[i] = 0;
                    hitta = true;
                    break;
                }
            }
            if (hitta = true)
            {
                IO.println("Bokningen finns inte");
            }
             IO.readln("Tryck enter för att fortsätta:");
        }
        if (val == 6)
        {
            fortsatt = false;
              IO.readln("Tryck enter för att avsluta");
        }
    }
}
