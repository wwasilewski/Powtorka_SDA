//Napisz program, który obliczy sumę liczb od 1 do 100 oraz obliczy średnią z tych liczb

package sda.powtorka.tydzien1.sumandaverage;

public class SumAndAverageMain
{
    public static void main(String[] args) {

        SumAndAverage saa = new SumAndAverage();
        System.out.println("sum of all integer numbers 1-100 is: " + saa.sumfrom1to100());
        System.out.println("average of all integer numbers 1-100 is: " + saa.averagefrom1to100());
    }
}
