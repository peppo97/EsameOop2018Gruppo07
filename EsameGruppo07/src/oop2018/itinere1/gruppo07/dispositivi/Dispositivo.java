/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.itinere1.gruppo07.dispositivi;

/**
 *
 * @author gruppo07
 */
public abstract class Dispositivo {
    private int id;
    private boolean acceso;
    
    public Dispositivo(int id) {
        this.id = id;
        this.acceso = true;
    }

    public int getId() {
        return id;
    }

    public void accendi() {
        this.acceso = true;
    }
    
    public void spegni() {
        this.acceso = false;
    }
    
    public boolean isAcceso() {
        return acceso;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dispositivo other = (Dispositivo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ID dispositivo: " + id + ", Stato: " + (acceso ? "Acceso   " : "Spento   ");
    }
    
    
    
}
