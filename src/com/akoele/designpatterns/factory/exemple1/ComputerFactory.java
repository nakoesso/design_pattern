package com.akoele.designpatterns.factory.exemple1;

public class ComputerFactory {
    public static Computer getComputer(String type) {
       switch (type){

              case "PC":
                return new Pc("16 GB", "1 TB", "2.9 GHz");
              case "Server":
                return new Server("128 GB", "8 TB", "6 GHz");
              case "Gamer" :
                    return new PCGamer("32 GB", "2 TB", "3.5 GHz");
              case "Imaginaire" :
                    return new PCGamer("1To", "100 To SSD", "25.5 GHz");
           default:
                throw new IllegalArgumentException("Unknown computer type: " + type);
       }
    }
}
