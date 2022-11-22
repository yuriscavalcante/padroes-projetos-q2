import com.stark.cooporation.FarenheitSensor;
public class CelsiusCalculatorAdapter implements CelsiusInterfaceTarget {
    @Override
    public double getTemperaturaInCelsius(){
        FarenheitSensor farenheitSensor = new FarenheitSensor();
        double temperaturaInFarenheit = farenheitSensor.getTemperaturaFarenheit();
        double temperaturaInCelsius = (temperaturaInFarenheit - 32) * 5/9;
        return temperaturaInCelsius;
    }
}
