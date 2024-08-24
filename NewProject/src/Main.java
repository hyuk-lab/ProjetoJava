
public class Main {
    public static void main(String[] args) {

        int [] list1 = {4,5,6,12,22,41,54};
        int [] list2 = {20,29,33,41,12,10};

        int[] listanova = new int[list1.length + list2.length];

        int i = 0;

        while (i < list1.length){
            listanova[i] = list1[i];
            i++;

        }

        i = list1.length;
        int j = 0;

        while (j < list2.length){
            listanova[j + i] = list2[j];
            j++;
        }


        System.out.println("Mostrando a lista nova");

        for (int k = 0; k < listanova.length; k++)
            System.out.println("Lista nova posição " + k + " - " + listanova[k]);






        }
    }
