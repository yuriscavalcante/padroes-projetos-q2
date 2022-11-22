import java.util.Scanner;

public class Temperatura {
    
    private CelsiusInterfaceTarget temp;
    public CelsiusInterfaceTarget getTemp(){
        return temp;
    }
    public void setTemp(CelsiusInterfaceTarget temp){
        this.temp = temp;
    }

    public void printTemp(){
        System.out.println(temp.getTemperaturaInCelsius()+ " C°");
    }

    public static void main(String [] args){
        Temperatura temperatura = new Temperatura();
        temperatura.setTemp(new CelsiusCalculatorAdapter());
        int i = 0;
        while(i<5){
            temperatura.printTemp();
            i++;
        }
    }   
}
