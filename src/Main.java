//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Starting Task 1
         System.out.println("Task 1");
         float dog = 8f;
         System.out.println(dog);
         float cat = 3.6f;
         System.out.println(cat);
         long paper = 763789L;
         System.out.println(paper);  //End of Task 1

        //Starting Task 2
         System.out.println("Task 2");
         dog = dog + 4;
         System.out.println(dog);
         cat = cat + 4;
         System.out.println(cat);
         paper = paper + 4;
         System.out.println(paper); //End of Task 2

        //Starting Task 3
         System.out.println("Task 3");
         dog = dog - 3.5f;
         System.out.println(dog);
         cat = cat - 1.6f;
         System.out.println(cat);
         paper = paper - 7639L;
         System.out.println(paper); //End of Task 3

        //Starting Task 4
         System.out.println("Task 4");
         int friend = 19;
         System.out.println(friend);
         friend = (friend + 2);
         System.out.println(friend);
         friend = (friend / 7);
         System.out.println(friend); //End of Task 4

        //Starting Task 5
         System.out.println("Task 5");
         float frog = 3.5f;
         System.out.println(frog);
         frog = frog * 10;
         System.out.println(frog);
         frog = frog / 3.5f;
         System.out.println(frog);
         frog = (frog + 4);
         System.out.println(frog); //End of Task 5

        //Starting Task 6
         System.out.println("Task 6");
         float boxerWeight1 = 78.2f;
         float boxerWeight2 = 82.7f;
         float totalWeight = (boxerWeight1 + boxerWeight2);
         System.out.println(totalWeight);
         float difference = (boxerWeight2 - boxerWeight1);
         System.out.println(difference); //End of Task 6

        //Task 7
         System.out.println("Task 7");
         float modulo = (boxerWeight2 % boxerWeight1);
         System.out.println(difference); //End of Task 7

        //Task 8
         System.out.println("Task 8");
         int totalHours = 640;
         int horsOnePerson = 8;
         int numberOfPersons = totalHours / horsOnePerson;
         System.out.println("Всего сотркдников в компании - " + numberOfPersons + " человек");
         numberOfPersons = numberOfPersons + 94;
         totalHours = numberOfPersons * 8;
         System.out.printf("Если в компании работает " + numberOfPersons + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");
         //End of Task 8
    }
}