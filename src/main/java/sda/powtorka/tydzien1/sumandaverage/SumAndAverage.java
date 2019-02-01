//Napisz program, który obliczy sumę liczb od 1 do 100 oraz obliczy średnią z tych liczb

package sda.powtorka.tydzien1.sumandaverage;

public class SumAndAverage {

    public int sumfrom1to100() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public float averagefrom1to100() {
        return sumfrom1to100() / 100.0f;
    }
}
