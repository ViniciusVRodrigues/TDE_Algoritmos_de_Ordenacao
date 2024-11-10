package sorting;

import csv.CSVReader;

public class SortingManager {
    private CSVReader csvReader;
    public SortingManager() {
        this.csvReader = new CSVReader();
    }
    public void sort(SortingInterface sortingInterface,String sortName) {
        CSVReader csvReader = new CSVReader();
        int[] aleatorio100 = csvReader.read("conjuntosDeDados/aleatorio_100.csv");
        int[] aleatorio1000 = csvReader.read("conjuntosDeDados/aleatorio_1000.csv");
        int[] aleatorio10000 = csvReader.read("conjuntosDeDados/aleatorio_10000.csv");
        int[] crescente100 = csvReader.read("conjuntosDeDados/crescente_100.csv");
        int[] crescente1000 = csvReader.read("conjuntosDeDados/crescente_1000.csv");
        int[] crescente10000 = csvReader.read("conjuntosDeDados/crescente_10000.csv");
        int[] decrescente100 = csvReader.read("conjuntosDeDados/decrescente_100.csv");
        int[] decrescente1000 = csvReader.read("conjuntosDeDados/decrescente_1000.csv");
        int[] decrescente10000 = csvReader.read("conjuntosDeDados/decrescente_10000.csv");
        sortingInterface.sort(aleatorio100, sortName+" aleatorio 100");
        sortingInterface.sort(aleatorio1000, sortName+" aleatorio 1000");
        sortingInterface.sort(aleatorio10000, sortName+" aleatorio 10000");
        sortingInterface.sort(crescente100, sortName+" crescente 100");
        sortingInterface.sort(crescente1000, sortName+" crescente 1000");
        sortingInterface.sort(crescente10000, sortName+" crescente 10000");
        sortingInterface.sort(decrescente100, sortName+" decrescente 100");
        sortingInterface.sort(decrescente1000, sortName+" decrescente 1000");
        sortingInterface.sort(decrescente10000, sortName+" decrescente 10000");
    }
}

