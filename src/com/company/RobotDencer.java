package com.company;

public class RobotDencer extends Robot{
    private String dance;
    private String music;
    private String colorDisco;
    public RobotDencer(String go, String say, String buetoothConection, String dance, String music, String colorDisco){
        super(go, say, buetoothConection);
        this.dance=dance;
        this.music=music;
        this.colorDisco=colorDisco;
    }

    public String getDance() {
        return dance;
    }

    public void setDance(String dance) {
        this.dance = dance;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getColorDisco() {
        return colorDisco;
    }

    public void setColorDisco(String colorDisco) {
        this.colorDisco = colorDisco;
    }
    public void Work(){
        System.out.println("Ya RobotDancer - ya prosto dancing");
    }

        }

