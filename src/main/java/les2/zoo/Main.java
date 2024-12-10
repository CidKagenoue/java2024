package les2.zoo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Bonobo> bonobos = new ArrayList<>();
        bonobos.add(new Bonobo(1, "Hortense", LocalDate.of(1978, 6, 16), Gender.FEMALE));
        bonobos.add(new Bonobo(2, "Banya", LocalDate.of(1990, 2, 1), Gender.FEMALE));
        bonobos.add(new Bonobo(3, "Vifijo", LocalDate.of(1994, 7, 23), Gender.MALE));
        bonobos.add(new Bonobo(4, "Djanoa", LocalDate.of(1995, 3, 27), Gender.FEMALE));
        bonobos.add(new Bonobo(5, "Binti", LocalDate.of(1995, 8, 14), Gender.FEMALE));
        bonobos.add(new Bonobo(6, "Zamba", LocalDate.of(1998, 4, 16), Gender.MALE));
        bonobos.add(new Bonobo(7, "Busira", LocalDate.of(2004, 2, 16), Gender.FEMALE));
        bonobos.add(new Bonobo(8, "Kianga", LocalDate.of(2005, 7, 17), Gender.FEMALE));
        bonobos.add(new Bonobo(9, "Habari", LocalDate.of(2006, 1, 29), Gender.MALE));
        bonobos.add(new Bonobo(10, "Nayembi", LocalDate.of(2006, 4, 26), Gender.FEMALE));
        bonobos.add(new Bonobo(11, "Moko", LocalDate.of(2013, 2, 20), Gender.MALE));
        bonobos.add(new Bonobo(12, "Kikongo", LocalDate.of(2014, 1, 29), Gender.MALE));
        bonobos.add(new Bonobo(13, "Bina", LocalDate.of(2015, 4, 3), Gender.FEMALE));
        bonobos.add(new Bonobo(14, "Nila", LocalDate.of(2015, 8, 29), Gender.FEMALE));
        bonobos.add(new Bonobo(15, "Mokonzi", LocalDate.of(2016, 2, 16), Gender.MALE));
        bonobos.add(new Bonobo(16, "Sanza", LocalDate.of(2017, 1, 31), Gender.FEMALE));
        bonobos.add(new Bonobo(17, "Balina", LocalDate.of(2019, 12, 7), Gender.FEMALE));
        bonobos.add(new Bonobo(18, "Unabii", LocalDate.of(2019, 12, 28), Gender.FEMALE));
        bonobos.add(new Bonobo(19, "Wakati", LocalDate.of(2021, 1, 1), Gender.FEMALE));
        bonobos.add(new Bonobo(20, "Xolani", LocalDate.of(2022, 1, 1), Gender.FEMALE));


        //bonobos.sort(Comparator.comparing(Bonobo::getDateOfBirth));
//oef2
        /*
        bonobos.stream()
                .sorted((a, b) -> {
                    int sort = a.getDateOfBirth().getYear() - b.getDateOfBirth().getYear();
                    if (sort == 0){
                        return a.compareTo(b);
                    } else {
                        return sort;
                    }
                })
                .forEach(System.out::println);

         */

//oef3
        /*
        bonobos.stream()
                .filter(a -> a.getGender() == Gender.MALE)
                .sorted((a,b) -> Integer.compare(b.getId(),a.getId()))
                .forEach(System.out::println);

*/
//oef4
        /*
        bonobos.stream()
                .filter(a -> a.getDateOfBirth().getYear() >= 2000 && a.getDateOfBirth().getYear() <= 2010 )
                .sorted(Comparator.comparing(Bonobo::getName))
                .forEach(System.out::println);
         */

        //oef5
/*
        List<Integer> birthYears = bonobos.stream()
            .map(b -> b.getDateOfBirth().getYear())
            .distinct()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());


            System.out.println(birthYears);
       */
       //oef6
        /*
       bonobos.stream()
               .sorted(Comparator.comparing(Bonobo::getName))
               .filter(n -> n.getName().startsWith("B"))
               .forEach(System.out::println);
        */

        /*
       //oef7
        boolean b1 = bonobos.stream()
                .anyMatch(b -> b.getDateOfBirth().getYear() == 2007);

        System.out.println(b1);

         */

        //oef 8


    }
}
