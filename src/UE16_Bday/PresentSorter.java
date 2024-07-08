package UE16_Bday;

public class PresentSorter {
    public void sortPresentsByDesireInsertionSort(Present[] presents) {
        //INSERTION SORT
        for (int i = 1; i < presents.length; i++) {

            for (int j = i; j > 0; j--) {
                if (presents[j].desire < presents[j - 1].desire) {
                    //Have to be careful to switch the whole object, not just desire or a part of the object
                    Present temp = presents[j];
                    presents[j] = presents[j - 1];
                    presents[j - 1] = temp;

                } else {
                    break;
                }
            }
        }
    }

    public void sortPresentsByDesireBubbleSort(Present[] presents) {
        //BUBBLE SORT
        //Loop for the runs -> how often do I have to do the whole thing
        for (int i = 0; i < presents.length - 1; i++) {
            boolean change = false;
            //Loop for comparisons
            for (int j = 0; j < presents.length - i - 1; j++) {
                if (presents[j].desire > presents[j + 1].desire) {
                    Present temp = presents[j];
                    presents[j] = presents[j + 1];
                    presents[j + 1] = temp;
                    change = true;
                }
            }
            if (!change) {
                break;
            }

        }
    }
}
