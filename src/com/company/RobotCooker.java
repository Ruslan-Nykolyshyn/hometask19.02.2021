package com.company;

public class RobotCooker extends Robot{
    private String cook;
    public RobotCooker(String go,
                       String say,          String bluetoothConnection, String cook){
        super ( go,say,bluetoothConnection);
        this.cook=cook;
    }

    public String getCook() {
        return cook;
    }

    public void setCook(String cook) {
        this.cook = cook;
    }
    public void Work(){
        System.out.println("Ya prosto RobotCooker - ya prosto cooking");
    }
}
