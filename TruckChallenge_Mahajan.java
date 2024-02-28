 public class TruckChallenge_Mahajan{
    public static void main(String[] args) {
        TruckFleet_Mahajan warehouse = new TruckFleet_Mahajan();
        Truck_Mahajan truck1 = new Truck_Mahajan(15, 200.0, "Freehold", "Warehouse");
        Truck_Mahajan truck2 = new Truck_Mahajan(7, 100.0, "Manalapan", "Warehouse");
        Truck_Mahajan truck3 = new Truck_Mahajan(2, 75.0, "Colts Neck", "Warehouse");
        Truck_Mahajan truck4 = new Truck_Mahajan(25, 300.0, "Howell", "Warehouse");
        Truck_Mahajan truck5 = new Truck_Mahajan(21, 250.0, "Marlboro", "Warehouse");
        warehouse.addTruck(truck1);
        warehouse.addTruck(truck2);
        warehouse.addTruck(truck3);
        warehouse.addTruck(truck4);
        warehouse.addTruck(truck5);
        System.out.println();

        Package_Mahajan package1 = new Package_Mahajan(20.0, "Manalapan", "101 Road St", false);
        Package_Mahajan package2 = new Package_Mahajan(100.0, "Manalapan", "300 Street Rd", false);
        Package_Mahajan package3 = new Package_Mahajan(150.0, "Freehold", "32 Avenue Rd", false);
        Package_Mahajan package4 = new Package_Mahajan(10.0, "Freehold", "1 Main St", false);
        Package_Mahajan package5 = new Package_Mahajan(15.0, "Freehold", "15 Temple Rd", false);
        Package_Mahajan package6 = new Package_Mahajan(16.0, "Freehold", "3 My Rd", false);
        Package_Mahajan package7 = new Package_Mahajan(1.0, "Marlboro", "4 Goldstein Way", false);
        Package_Mahajan package8 = new Package_Mahajan(15.0, "Marlboro", "15 Goldstein Way", false);
        Package_Mahajan package9 = new Package_Mahajan(35.0, "Freehold", "53 CompSci Ct", false);
        Package_Mahajan package10 = new Package_Mahajan(54.0, "Marlboro", "32 ColtsNeck Rd", false);
        warehouse.addPackage(package1);
        warehouse.addPackage(package2);
        warehouse.addPackage(package3);
        warehouse.addPackage(package4);
        warehouse.addPackage(package5);
        warehouse.addPackage(package6);
        warehouse.addPackage(package7);
        warehouse.addPackage(package8);
        warehouse.addPackage(package9);
        warehouse.addPackage(package10);
        warehouse.test();
        System.out.println();

        System.out.println("Truck 1's next location: " + truck1.getNextLocation());
        System.out.println("Truck 2's next location: " + truck2.getNextLocation());
        System.out.println("Truck 3's next location: " + truck3.getNextLocation());
        System.out.println("Truck 4's next location: " + truck4.getNextLocation());
        System.out.println("Truck 5's next location: " + truck5.getNextLocation());
        System.out.println();

        while (!(truck1.getNumPackages() == 0 && truck2.getNumPackages() == 0 && truck3.getNumPackages() == 0 && truck4.getNumPackages() == 0 && truck5.getNumPackages() == 0)) {
            if (!(truck1.getNumPackages() == 0)) {
                truck1.deliverPackage();
            }
            if (!(truck2.getNumPackages() == 0)) {
                truck2.deliverPackage();
            }
            if (!(truck3.getNumPackages() == 0)) {
                truck3.deliverPackage();
            }
            if (!(truck4.getNumPackages() == 0)) {
                truck4.deliverPackage();
            }
            if (!(truck5.getNumPackages() == 0)) {
                truck5.deliverPackage();
            }
            warehouse.test();
        }
        System.out.println();

        truck1.setLocation("Warehouse");
        truck2.setLocation("Warehouse");
        truck3.setLocation("Warehouse");
        truck4.setLocation("Warehouse");
        truck5.setLocation("Warehouse");
        warehouse.test();
        System.out.println();

        System.out.println(package1.getStatus());
        System.out.println(package2.getStatus());
        System.out.println(package3.getStatus());
        System.out.println(package4.getStatus());
        System.out.println(package5.getStatus());
        System.out.println(package6.getStatus());
        System.out.println(package7.getStatus());
        System.out.println(package8.getStatus());
        System.out.println(package9.getStatus());
        System.out.println(package10.getStatus());
    }
    }
