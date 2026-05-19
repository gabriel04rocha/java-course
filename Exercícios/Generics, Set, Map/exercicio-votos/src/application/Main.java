package application;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import model.exceptions.EmptyFileException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> candidateVotes = new HashMap<>();
        System.out.print("Enter the complete path for the file: ");
        String filePath = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String newLine = br.readLine();
                if (newLine == null) {
                    throw new EmptyFileException("O arquivo especificado está vazio.");
                }
                while (newLine != null) {
                    String[] lineInfo = newLine.split(",");
                    if (candidateVotes.containsKey(lineInfo[0])) {
                        candidateVotes.put(lineInfo[0], Integer.parseInt(lineInfo[1]) + candidateVotes.get(lineInfo[0]));
                    } else {
                        candidateVotes.put(lineInfo[0], Integer.valueOf(lineInfo[1]));
                    }
                    newLine = br.readLine();
                }

                for (String listKey : candidateVotes.keySet()) {
                    System.out.println(listKey + ": " + candidateVotes.get(listKey));
                }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado, tente novamente!");
        } catch (IOException e) {
            System.out.println("Erro de IO. Tente novamente.");
        } catch(EmptyFileException e) {
            System.out.println("O arquivo está vazio! Providencie um arquivo que contenha as informações necessárias.");
        }
    }
}