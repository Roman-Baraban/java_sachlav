package home_tasks.Workers;

import java.util.ArrayList;

public class WorkersRoster {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Dwalin");
        Driver driver2 = new Driver("Balin");
        Driver driver3 = new Driver("Kili");
        Driver driver4 = new Driver("Fili");

        Chef chef1 = new Chef("Dori");
        Chef chef2 = new Chef("Ori");
        Chef chef3 = new Chef("Nori");
        Chef chef4 = new Chef("Oin");

        Developer dev1 = new Developer("Gloin");
        Developer dev2 = new Developer("Bombur");
        Developer dev3 = new Developer("Bofur ");
        Developer dev4 = new Developer("Bifur ");
        
        Manager boss1 = new Manager("Thorin Oakenshield");

        ArrayList<Driver> driversList = new ArrayList<>();
        ArrayList<Developer> devsList = new ArrayList<>();
        ArrayList<Chef> chefList = new ArrayList<>();

        driversList.add(driver1);
        driversList.add(driver2);
        driversList.add(driver3);
        driversList.add(driver4);
        chefList.add(chef1);
        chefList.add(chef2);
        chefList.add(chef3);
        chefList.add(chef4);
        devsList.add(dev1);
        devsList.add(dev2);
        devsList.add(dev3);
        devsList.add(dev4);


        for (int i = 0; i < driversList.size(); i++){
            driversList.get(i).voice();
            driversList.get(i).driving();
        }
        for (int i = 0; i < chefList.size(); i++){
            chefList.get(i).voice();
            chefList.get(i).cooking();
        }
        for (int i = 0; i < devsList.size(); i++){
            devsList.get(i).voice();
            devsList.get(i).coding();
        }
        boss1.voice();
        boss1.doingNothing();





    }
}
