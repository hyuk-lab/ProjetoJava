
public class Main {
    public static void main(String[] args) {

        int [] list1 = {4,5,6,12,22,41,54};
        int [] list2 = {20,29,33,41,12,10};

        int[] listanova = new int[30];
        int unir = 0;

        for (int i = 0; i < list1.length; i++) {
            listanova[unir++] = list1[i];
        }

        for (int i = 0; i < list2.length; i++) {
            listanova[unir++] = list2[i];
        }


        for (int i = 0; i < listanova.length; i++) {
            System.out.print(listanova[i] + " ");
        }


        }
    }
