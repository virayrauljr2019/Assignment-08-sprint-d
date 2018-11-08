public class Main {
    public static void main(String[] args) {
        // write your code here
        calcCapacitytot(8, 3, 30);
        calcCapacitytot(9, 3, 30);
        calcCapacitytot(10, 3, 30);
        calcCapacitytot(11, 3, 30);
        calcCapacitytot(8, 4, 30);
        calcCapacitytot(8, 5, 30);
        calcCapacitytot(8, 6, 30);

        calcCapacitytot(8, 3, 35);
        calcCapacitytot(9, 3, 35);
        calcCapacitytot(10, 3, 35);
        calcCapacitytot(11, 3, 35);
        calcCapacitytot(8, 4, 35);
        calcCapacitytot(8, 5, 35);
        calcCapacitytot(8, 6, 35);

        calcCapacitytot(8, 3, 30);
        calcCapacitytot(8, 3, 40);
        calcCapacitytot(9, 3, 40);
        calcCapacitytot(10, 3, 40);
        calcCapacitytot(11, 3, 40);
        calcCapacitytot(8, 4, 40);
        calcCapacitytot(8, 5, 40);
        calcCapacitytot(8, 6, 40);


    }
    public static void calcCapacitytot(int devs, int weeks, int hours)
    {
        int wi1 = 100;
        int wi2 = 50;
        int wi3 = 20;
        int wi4 = 360;
        int wi5 = 80;
        int wi6 = 160;
        int wi7 = 500;
        int wi8 = 240;
        int wi9 = 40;
        int wi10 = 40;
        double workefforttot = (wi1 + wi2 + wi3 + wi4 + wi5 + wi6 + wi7 + wi8 + wi9 + wi10)*100;

        double totcapacity = (workefforttot / (devs * weeks * hours));
        System.out.printf("With %d developers working a %d week sprint, for %d hrs/wk, they would be at %d%% of capacity.\n",devs,weeks,hours,(int)(totcapacity));


    }
}