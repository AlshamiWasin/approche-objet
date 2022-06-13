package tp15;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

    public static void main(String[] args) throws IOException {

        Path fichier = Paths.get( "C:/Users/Mohammas wasin/IdeaProjects/CoursObjet/src/tp15/fichier/recensement.csv" );

        Path newFichier = Paths.get( "C:/Users/Mohammas wasin/IdeaProjects/CoursObjet/src/tp15/fichier/new.csv" );

/*
        boolean estFicheir = Files.isRegularFile(fichier);
        boolean estNewFicheir = Files.isRegularFile(newFichier);

        boolean estLisible = Files.isReadable(fichier);
        boolean estNewLisible = Files.isReadable(newFichier);

        System.out.println(estFicheir + "" + estNewFicheir);
        System.out.println(estLisible + "" + estNewLisible);*/

        /*Files.copy(fichier , newFichier);*/

        String inputInitial = " le nom de la ville ;le code département . la population totale ;";

        List<String> lines = Files.readAllLines(fichier, StandardCharsets.UTF_8);

        List<String> linesToAdd = new ArrayList<>();


        for (String line : lines) {

            if (lines.indexOf(line) !=0){
                String[] item = line.split(";");

                String populationSansEspace = item[9].trim().replaceAll(" ", "");
                long populationTotal = Long.parseLong(populationSansEspace);

                if (populationTotal > 25000){
                    String nomVille = item[6];
                    String codeDepartement = item[2];

                    String linetoadd = nomVille+";"+codeDepartement+";"+populationTotal;

                    linesToAdd.add(linetoadd );
                }
            }else {
                linesToAdd.add(inputInitial);
            }

        }

        Files.write(newFichier, linesToAdd, StandardCharsets.UTF_8, StandardOpenOption.APPEND);


    }

}
