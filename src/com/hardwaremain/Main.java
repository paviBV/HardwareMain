package com.hardwaremain;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.SocketHandler;

class HardwareMain{
    private int id;
    private String name;
    private int cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "HardwareMain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
	    List<HardwareMain> hardwareMainList = new ArrayList<>();
        HardwareMain hardwareMain = new HardwareMain();
        hardwareMain.setId(1001);
        hardwareMain.setName("Ram");
        hardwareMain.setCost(4000);
        hardwareMainList.add(hardwareMain);

        HardwareMain hardwareMain1 = new HardwareMain();
        hardwareMain1.setId(1002);
        hardwareMain1.setName("Rom");
        hardwareMain1.setCost(4000);
        hardwareMainList.add(hardwareMain1);

        HardwareMain hardwareMain2 = new HardwareMain();
        hardwareMain2.setId(1003);
        hardwareMain2.setName("Drive");
        hardwareMain2.setCost(6000);
        hardwareMainList.add(hardwareMain2);

        for (int i = 0; i < hardwareMainList.size(); i++) {
            System.out.println(hardwareMainList.get(i));
        }

        System.out.println(" Fetch a single record");
        for (int i = 0; i < hardwareMainList.size(); i++) {
            if (hardwareMainList.get(i).getId()==1004){
            System.out.println(hardwareMainList.get(i));
            break;
            }else{
                System.out.println(" File not found");
                break;
            }

        }

        System.out.println(" Update record");
        for (int i = 0; i < hardwareMainList.size(); i++) {
            if (hardwareMainList.get(i).getId()==1002){
                hardwareMainList.get(i).setName("Fan");
                hardwareMainList.get(i).setCost(800);
                System.out.println(hardwareMainList.get(i));
            }
        }

        System.out.println(" Delete record");
        for (int i = 0; i < hardwareMainList.size(); i++) {
            if (hardwareMainList.get(i).getId()==1002){
                hardwareMainList.remove(i);
            }
        }

        for (int i = 0; i < hardwareMainList.size(); i++) {
            if (hardwareMainList.get(i).getId() != 1002){
                System.out.println("not found");
                break;
            }
        }

        System.out.println(" Add new record");
        for (int i = 0; i < hardwareMainList.size(); i++) {
            if (hardwareMainList.get(i).getId()!=1004){
                HardwareMain hardwareMain4 = new HardwareMain();
                hardwareMain4.setId(1004);
                hardwareMain4.setName("HDD");
                hardwareMain4.setCost(3000);
                hardwareMainList.add(hardwareMain4);
            }
        }
        for (int i = 0; i < hardwareMainList.size(); i++) {
            System.out.println(hardwareMainList.get(i));
        }

    }
}
