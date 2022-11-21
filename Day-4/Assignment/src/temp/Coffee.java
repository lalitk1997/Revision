package temp;

import java.util.List;

public class Coffee {
    boolean hot;
    boolean creamy;
    boolean chocolateSauce;
    boolean milk;
    boolean high_water_pressure;

    public Coffee(boolean hot, boolean creamy, boolean chocolateSauce, boolean milk, boolean high_water_pressure) {
        this.hot = hot;
        this.creamy = creamy;
        this.chocolateSauce = chocolateSauce;
        this.milk = milk;
        this.high_water_pressure = high_water_pressure;
    }

    boolean mocha(){
        if(hot == true && creamy == true && chocolateSauce == false && milk == true && high_water_pressure == true){
            return true;
        }else{
            return false;
        }
    }

    boolean latte(){
        if(hot == true && creamy == true && chocolateSauce == true && milk == true && high_water_pressure == true){
            return true;
        }else{
            return false;
        }
    }

    boolean espresso(){
        if(hot == true && creamy == false && chocolateSauce == true && milk == true && high_water_pressure == false){
            return true;
        }else{
            return false;
        }
    }

    boolean frappuccino(){
        if(hot == false && creamy == true && chocolateSauce == true && milk == true && high_water_pressure == false){
            return true;
        }else{
            return false;
        }
    }

    public static void solve(List<Integer> list){
//        1\. print the size of the array list
        System.out.println(list.size());
//        2\. If the size of the list is even,
//        add 10 to the end of the list, else if it is odd,
//        add 10 at the beginning of the list
        if(list.size() % 2 == 0){
            list.add(list.size()-1, 10);
        }else{
            list.add(0, 10);
        }
//        3\. If the size of the list is greater than 5,
//        then add 3 at position 3, else add 3 at the end of the list
        if (list.size() > 5){
            list.add(2, 3);
        }else {
            list.add(list.size()-1, 3);
        }

//        4\. Check if the list contains the value 5 or not.
//        Print true, if the value is present, else print false, on a new line
        if(list.contains(5)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

//        5\. Check the number of odd elements in the list, and print it on a new line
        int oddEle = 0;
        for (int i=0; i<list.size(); i++){
            if (list.get(i) % 2 == 1){
                oddEle += 1;
            }
        }
        System.out.println(oddEle);

//        6\. Check the number of even elements in the list
        int evenEle = 0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) % 2 == 0){
                evenEle += 1;
            }
        }
        System.out.println(evenEle);

//        7\. Check the number of elements in the list which have a frequency of 1


//        8\. Check the count of elements which have a frequency of more than 1 in the list
//        9\. Print the first and the last element of the list

//        10\. Print all the elements of the list on a single line
    }

}
