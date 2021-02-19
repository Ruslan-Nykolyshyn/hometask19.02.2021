package com.company;

public class Cofferobot extends Robot{
 private String cofe;
 private int rozetka;
 public  Cofferobot( String go,
          String say,          String bluetoothConnection, String cofe, int rozetka){
     super(go, say,bluetoothConnection);
     this.cofe=cofe;
     this.rozetka=rozetka;
 }

    public String getCofe() {
        return cofe;
    }

    public void setCofe(String cofe) {
        this.cofe = cofe;
    }

    public int getRozetka() {
        return rozetka;
    }

    public void setRozetka(int rozetka) {
        this.rozetka = rozetka;
    }



    }

