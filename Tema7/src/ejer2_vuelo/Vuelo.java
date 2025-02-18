package ejer2_vuelo;

class Vuelo {
    private Tripulante[] tripulantes;
    private Pasajero[] pasajeros;
    private int numTripulantes;
    private int numPasajeros;
    
    Vuelo(){
    	tripulantes = new Tripulante[5];
    	pasajeros = new Pasajero[20];
    }
    
    Vuelo(Tripulante[] tripulantes, Pasajero[] pasajeros, int numTripulantes, int numPasajeros) {
    	this.tripulantes = tripulantes;
    	this.pasajeros = pasajeros;
    	this.numTripulantes = numTripulantes;
    	this.numPasajeros = numPasajeros;
    	
    }
    
    public void setTripulantes (Tripulante[] tripulantes) {
    	this.tripulantes = tripulantes;
    }
    public Tripulante[] getTripulantes() {
    	return tripulantes;
    }
    
    public void setPasajeros (Pasajero[] pasajeros) {
    	this.pasajeros = pasajeros;
    }
    public Pasajero[] getPasajeros() {
    	return pasajeros;
    }
    
    public void setNumTripulantes (int numTripulantes) {
    	this.numTripulantes = numTripulantes;
    }
    public int getNumTripulantes () {
    	return numTripulantes;
    }
    
    public void setNumPasajeros (int numPasajeros) {
    	this.numPasajeros = numPasajeros;
    }
    public int getNumPasajeros () {
    	return numPasajeros;
    }
    

    public void listaTripulacionPorRol(String rol) {
        Rol rolEnum = Rol.valueOf(rol.toUpperCase());
        for (int i = 0; i < numTripulantes; i++) {
            if (tripulantes[i].getRol() == rolEnum) {
                System.out.println(tripulantes[i].getNombre());
            }
        }
    }

    public void anyadirTripulante(String nombre, String rol) {
        if (numTripulantes < 5) {
            tripulantes[numTripulantes++] = new Tripulante(nombre, Rol.valueOf(rol.toUpperCase()));
        }
    }

    public void eliminarTripulante(String nombre) {
        for (int i = 0; i < numTripulantes; i++) {
            if (tripulantes[i].getNombre().equals(nombre)) {
                for (int j = i; j < numTripulantes - 1; j++) {
                    tripulantes[j] = tripulantes[j + 1];
                }
                tripulantes[--numTripulantes] = null;
                return;
            }
        }
    }

    public void anyadirPasajero(String nombre, String apellidos, String pasaporte, int asiento, boolean conVentana) {
        if (numPasajeros < 20) {
            pasajeros[numPasajeros++] = new Pasajero(nombre, apellidos, pasaporte, asiento, conVentana);
        }
    }

    public void eliminarPasajero(String nombre) {
        for (int i = 0; i < numPasajeros; i++) {
            if (pasajeros[i].getNombre().equals(nombre)) {
                for (int j = i; j < numPasajeros - 1; j++) {
                    pasajeros[j] = pasajeros[j + 1];
                }
                pasajeros[--numPasajeros] = null;
                return;
            }
        }
    }

    public void obtenerPasajeroPorAsiento(int asiento) {
        for (int i = 0; i < numPasajeros; i++) {
            if (pasajeros[i].getAsiento() == asiento) {
                pasajeros[i].mostrarDatos();
                return;
            }
        }
        System.out.println("No hay pasajero en el asiento " + asiento);
    }
}
