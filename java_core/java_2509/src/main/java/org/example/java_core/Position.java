package org.example.java_core;

import org.example.day_7_java.Ex_2.ScannerUtils;
public class Position {
    int positionId;
    NamePosition positionName;

    ScannerUtils scannerUtils = new ScannerUtils();
    public Position() {
        while (true) {
            int id = scannerUtils.inputInt("nhập vào số lơn hơn 0");
            if (id > 0) {
                this.positionId = id;
                break;
            }
        }
        while (true) {
            System.out.println("Nhập Name Position (DEV, TEST, SCRUM_MASTER, PM) : ");
            String name = scannerUtils.inputString();
            NamePosition valueName = NamePosition.valueOf(name.toUpperCase());
            if (valueName == NamePosition.DEV || valueName == NamePosition.TEST || valueName == NamePosition.SCRUM_MASTER || valueName == NamePosition.PM) {
                this.positionName = valueName;
                break;
            }
        }
    }

    public Position(int positionId, NamePosition positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }
}

