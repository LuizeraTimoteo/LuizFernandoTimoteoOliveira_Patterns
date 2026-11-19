public class FanController implements TemperatureObserver {
    @Override
    public void onTemperatureChanged(double temp) {
        System.out.println(temp > 28 ? "Ventilador: LIGAR" : "Ventilador: DESLIGAR");
    }
}
