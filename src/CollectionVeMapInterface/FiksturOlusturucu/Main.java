package CollectionVeMapInterface.FiksturOlusturucu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static String[][] fillAllMatches(ArrayList<String> teams) {

        int totalTeams = teams.size();

        int totalMatchNumber = totalTeams * (totalTeams - 1);

        String[][] allMatches = new String[totalMatchNumber][2];

        String[][] weeklyMatches = fillFirstWeekMatchesRandomly(teams);

        for (int i = 0; i < totalMatchNumber / 2; ) {              // FIRST HALF OF THE ALL MATCHES

            for (String[] firstWeekMatch : weeklyMatches) {
                allMatches[i][0] = firstWeekMatch[0];
                allMatches[i][1] = firstWeekMatch[1];
                i++;
            }
            rotateWeeklyMatches(weeklyMatches);

        }

        mixMatches(allMatches);

        for (int i = totalMatchNumber / 2, j = 0; i < totalMatchNumber; i++, j++) {   // SECOND HALF OF THE ALL MATCHES
            allMatches[i][0] = allMatches[j][1];
            allMatches[i][1] = allMatches[j][0];
        }

        return allMatches;
    }

    public static String[][] fillFirstWeekMatchesRandomly(ArrayList<String> teams) {

        String[][] firstWeekMatches = new String[teams.size() / 2][2];
        Boolean[] isTeamUsed = new Boolean[teams.size()];
        Arrays.fill(isTeamUsed, false);

        int matchCounter = 0;

        while (!isAllTeamsUsed(isTeamUsed)) {

            Random random = new Random();
            int firstTeamRandomIndex = random.nextInt(teams.size());
            int secondTeamRandomIndex = random.nextInt(teams.size());

            if (!isTeamUsed[firstTeamRandomIndex] && !isTeamUsed[secondTeamRandomIndex] && (firstTeamRandomIndex != secondTeamRandomIndex)) {
                isTeamUsed[firstTeamRandomIndex] = true;
                isTeamUsed[secondTeamRandomIndex] = true;
                firstWeekMatches[matchCounter][0] = teams.get(firstTeamRandomIndex);
                firstWeekMatches[matchCounter][1] = teams.get(secondTeamRandomIndex);
                matchCounter++;
            }

        }

        return firstWeekMatches;
    }

    public static boolean isAllTeamsUsed(Boolean[] isTeamUsed) {
        for (Boolean value : isTeamUsed) {
            if (!value) return false;
        }
        return true;
    }

    public static void mixMatches(String[][] allMatches) {

        for (int i = 0; i < allMatches.length / 2; i += 3) {

            Random random = new Random();
            int randomIndex = random.nextInt(3) + i;
            String variable = allMatches[randomIndex][1];
            allMatches[randomIndex][1] = allMatches[randomIndex][0];
            allMatches[randomIndex][0] = variable;

        }

    }

    public static void rotateWeeklyMatches(String[][] weeklyMatches) {

        String firstVariable = weeklyMatches[1][0];
        weeklyMatches[1][0] = weeklyMatches[0][1];

        for (int i = 1; i < weeklyMatches.length - 1; i++) {

            String secondVariable = weeklyMatches[i + 1][0];
            weeklyMatches[i + 1][0] = firstVariable;
            firstVariable = secondVariable;

        }

        String secondVariable = weeklyMatches[weeklyMatches.length - 1][1];
        weeklyMatches[weeklyMatches.length - 1][1] = firstVariable;

        for (int i = weeklyMatches.length - 1; i >= 1; i--) {

            firstVariable = weeklyMatches[i - 1][1];
            weeklyMatches[i - 1][1] = secondVariable;
            secondVariable = firstVariable;

        }

    }

    public static void printWeeklyMatches(String[][] allMatches, int totalTeams) {
        int weekCounter = 0;
        for (String[] match : allMatches) {
            if (weekCounter % (totalTeams / 2) == 0) {
                System.out.println("Week " + ((weekCounter / (totalTeams / 2)) + 1));
            }
            weekCounter++;
            System.out.println(match[0] + " vs " + match[1]);
        }
    }

    public static void main(String[] args) {

        ArrayList<String> teams = new ArrayList<>();

        teams.add("BEŞİKTAŞ");
        teams.add("GALATASARAY");
        teams.add("FENERBAHÇE");
        teams.add("TRABZONSPOR");
        teams.add("SİVASSPOR");
        teams.add("HATAYSPOR");
        teams.add("ALANYASPOR");
        teams.add("KARAGÜMRÜK");
        teams.add("GAZİANTEP");
        teams.add("KONYASPOR");
        teams.add("BAŞAKŞEHİR");
        teams.add("RİZESPOR");
        teams.add("KASIMPAŞA");
        teams.add("MALATYASPOR");
        teams.add("ANTALYASPOR");
        teams.add("KAYSERİSPOR");
        teams.add("ERZURUMSPOR");
        teams.add("ANKARAGÜCÜ");
        teams.add("GENÇLERBİRLİĞİ");
        teams.add("DENİZLİSPOR");
        teams.add("GÖZTEPE");

        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        String[][] allMatches = fillAllMatches(teams);

        printWeeklyMatches(allMatches, teams.size());

    }
}
