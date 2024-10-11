public class Conversion implements Comparable<Conversion>{
    private double montoConvertir;
    private int opcionSeleccionada;




    public int opcionConvertir(int opcionSeleccionada){
    this.opcionSeleccionada = opcionSeleccionada;
    return opcionSeleccionada;
}

    public double getMontoConvertir() {
        return montoConvertir;
    }

    public int getOpcionSeleccionada() {
        return opcionSeleccionada;
    }


    @Override
    public int compareTo(Conversion conversion) {
        return 0;
    }
}
