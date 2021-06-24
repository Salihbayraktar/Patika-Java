package CollectionVeMapInterface.FiksturOlusturucu;

import java.util.*;

public class EskiYontem {

    public static void main(String[] args) {

        ArrayList<String> teams = new ArrayList<>();

        teams.add("GALATASARAY");
        teams.add("FENERBAHÇE");
        teams.add("BEŞİKTAŞ");
        teams.add("TRABZONSPOR");
        //teams.add("SİVASSPOR");
        //teams.add("HATAYSPOR");
        //teams.add("ALANYASPOR");
        //teams.add("KARAGÜMRÜK");
        //teams.add("GAZİANTEP");
        //teams.add("KONYASPOR");
        //teams.add("BAŞAKŞEHİR");
        //teams.add("RİZESPOR");
        //teams.add("KASIMPAŞA");
        //teams.add("MALATYASPOR");
        //teams.add("ANTALYASPOR");
        //teams.add("KAYSERİSPOR");
        //teams.add("ERZURUMSPOR");
        //teams.add("ANKARAGÜCÜ");
        //teams.add("GENÇLERBİRLİĞİ");
        //teams.add("DENİZLİSPOR");

        if(teams.size() %2 != 0){
            teams.add("Bay");
        }

        int totalTeams = teams.size();

        int combination = (totalTeams * (totalTeams-1)) / 2;
        System.out.println("combinatioın  : " + combination);
        String[][] firstHalfMatches = new String[(int) combination][2];
        ArrayList<Integer[]> allCombinations = new ArrayList<>();


        for (int i = 0; i < totalTeams; i++) {
            for (int j = 0; j < totalTeams; j++) {
                if (j == i) j++;

                allCombinations.add(new Integer[]{i, j});
            }
        }
        allCombinations.remove(allCombinations.size() - 1);

        for (Integer[] allCombination : allCombinations) {
            System.out.println(Arrays.toString(allCombination));
        }

        int totalRound = totalTeams - 1;

        Map<Integer, Boolean> isNumberUsed = new HashMap<>();
        for (int k = 0; k < totalTeams; k++) {
            isNumberUsed.put(k, false);
        }
        int matchCounter = 0;
        for (int i = 0; i < totalRound; i++) {

            for (int k = 0; k < totalTeams; k++) {
                isNumberUsed.replace(k, false);
            }

            while (isNumberUsed.containsValue(false)) {
                Random random = new Random();
                int randomNumber = random.nextInt(allCombinations.size());
                int firstTeamIndex = allCombinations.get(randomNumber)[0];
                int secondTeamIndex = allCombinations.get(randomNumber)[1];
                if (!isNumberUsed.get(firstTeamIndex) && !isNumberUsed.get(secondTeamIndex)) {

                    isNumberUsed.replace(firstTeamIndex, true);
                    isNumberUsed.replace(secondTeamIndex, true);
                    allCombinations.remove(randomNumber);
                    firstHalfMatches[matchCounter][0] = teams.get(firstTeamIndex);
                    firstHalfMatches[matchCounter++][1] = teams.get(secondTeamIndex);
                }
            }
        }

        int round = 0;
        for (String[] match : firstHalfMatches) {
            if (round % (totalTeams / 2) == 0) {
                System.out.println("Week " + ((round / (totalTeams / 2)) + 1));
            }

            System.out.println(match[0] + " vs " + match[1]);

            round++;
        }
        System.out.println("SECOND HALF");
        for (String[] match : firstHalfMatches) {
            if (round % (totalTeams / 2) == 0) {
                System.out.println("Week " + ((round / (totalTeams / 2)) + 1));
            }

            System.out.println(match[1] + " vs " + match[0]);

            round++;
        }

    }

}
