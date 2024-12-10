package Week6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("week3/src/main/resources/eigenaars.txt");

        Map<String, Owner> owners = new HashMap<>();

        try {
            List<String> lines = Files
                    .readAllLines(file.toPath());

            for (String line : lines) {
                String[] parts = line.split(";");
                String firstName = parts[0];
                String lastName = parts[1];
                String petName = parts[2];
                String birthDate = parts[3];
                String type = parts[4];

                String ownerKey = firstName + " " + lastName;
                Owner owner = owners.computeIfAbsent(ownerKey, k -> new Owner(firstName, lastName));

                Pet pet = new Pet(petName, birthDate, type);
                owner.addPet(pet);
            }

            owners.values().forEach(System.out::println);

        } catch (IOException e) {
            System.err.println("Fout: " + e.getMessage());
        }
    }


}


        /*
        File file1 = new File("week3/src/main/resources/four-letter-words.txt");
        File output = new File("week3/src/main/resources/output.txt");


        System.out.println(file1.exists());

        try (Stream<String> lines = Files.lines(file1.toPath())) {
            List<String> result = lines
                            .filter(p -> p.contains("A"))
                            .filter(Main::isPalindrome)
                            .collect(Collectors.toList());

            result.sort(Comparator.reverseOrder());


            Files.write(output.toPath(), result);

            System.out.println("File sorted in reverse alphabetical order and saved to output.txt.");
        } catch (IOException e) {
            System.err.println("Error processing the file: " + e.getMessage());
                }

    }
    private static boolean isPalindrome(String str) {
         return str.equals(new StringBuilder(str).reverse().toString());
    }

         */

