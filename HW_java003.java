import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class HW_java003 {
    public static ArrayList<Integer> AddElement(int n, int leng) {
        Random rand = new Random();
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < leng; i++) {
            resultList.add(rand.nextInt(n));
        }
        return resultList;

    }

    public static ArrayList<Integer> OddNumbers(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) % 2 == 0) {
                intList.remove(i);
                i--;
            }
        }

        return intList;

    }

    public static int MeanNumber(ArrayList<Integer> intList) {
        double result = 0;
        for (int i = 0; i < intList.size(); i++) {
            result += intList.get(i);
        }
        result = result / intList.size();
        if (result > (double) (int) result + 0.5) {
            return (int) result + 1;

        } else {
            return (int) result;
        }

    }

    public static List<String> PlanetAdd(List<Integer> intList) {
        List<String> planet = new ArrayList<>();
        for (int i : intList) {
            if (i == 0) {
                planet.add("Меркурий");
            } else if (i == 1) {
                planet.add("Венера");
            } else if (i == 2) {
                planet.add("Земля");
            } else if (i == 3) {
                planet.add("Марс");
            } else if (i == 4) {
                planet.add("Юпитер");
            } else if (i == 5) {
                planet.add("Сатурн");
            } else if (i == 6) {
                planet.add("Уран");
            } else if (i == 7) {
                planet.add("Нептун");
            }
        }
        return planet;
    }

    public static void Counter(List<String> pl) {
        Collections.sort(pl);
        
        
        ArrayList<Integer> counts = new ArrayList<>();
        int count = 1;
        String word = new String();

        word = pl.get(0);
        for (int j = 1; j < pl.size(); j++) {
            if (pl.get(j) == word) {
                count++;
            } else {
                counts.add(count);
                word = pl.get(j);
                count = 1;

            }

        }
        counts.add(count);

        for (int l = 1; l < pl.size(); l++) {
            if (pl.get(l - 1).equals(pl.get(l))) {
                pl.remove(l);
                l--;
            }
        }
        for (int k = 0; k < pl.size(); k++) {
        System.out.println(pl.get(k) + " количество " + counts.get(k));

        }

    }

    public static void main(String[] args) {
        // 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
        // Random rand = new Random();
        ArrayList<Integer> frstList = AddElement(40, 10);

        System.out.println("Првое задание");
        System.out.println(frstList);
        System.out.println(OddNumbers(frstList));
        System.out.println();

        // 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и
        // среднее арифметическое из этого списка. Collections.max()
        ArrayList<Integer> sortList = new ArrayList<Integer>();
        frstList = AddElement(40, 10);

        System.out.println("Втоое задание");
        System.out.println(frstList);
        System.out.println("Среднее " + MeanNumber(frstList));

        sortList = frstList;

        Collections.sort(sortList);
        System.out.println(sortList);
        System.out.println("минимальное " + (sortList.get(0)));
        System.out.println("максимальное " + (sortList.get(sortList.size() - 1)));
        System.out.println();

        // 3. Заполнить список названиями планет Солнечной системы в произвольном
        // порядке с повторениями. Вывести название каждой планеты и количество его
        // повторений в списке.
        List<Integer> arrMask = AddElement(9, 9);
        System.out.println("Тетье задание");
        System.out.println(arrMask);
        List<String> arrPlanet = PlanetAdd(arrMask);
        System.out.println(arrPlanet);
        Counter(arrPlanet);

        // 4. *Реализовать алгоритм сортировки слиянием

    }
}
