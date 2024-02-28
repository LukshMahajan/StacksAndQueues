import java.util.*;
import java.util.concurrent.LinkedTransferQueue;
    public class TruckFleet_Mahajan {
        private ArrayList<LinkedTransferQueue<Truck_Mahajan>> truckFleet = new ArrayList<LinkedTransferQueue<Truck_Mahajan>>();
        private ArrayList<LinkedTransferQueue<Package_Mahajan>> waitingPackages = new ArrayList<LinkedTransferQueue<Package_Mahajan>>();

        public void addTruck(Truck_Mahajan truck){
            for (LinkedTransferQueue<Truck_Mahajan> truckArea : truckFleet){
                if (truckArea.isEmpty()){
                    truckFleet.remove(truckArea);
                    continue;
                }
                else if (truckArea.peek().getAreaServes().equals(truck.getAreaServes())){
                    truckArea.add(truck);
                    return;
                }
            }
            truckFleet.add(new LinkedTransferQueue<Truck_Mahajan>());
            truckFleet.get(truckFleet.size()-1).add(truck);
        }
        public void addPackage(Package_Mahajan packag){
            for (LinkedTransferQueue<Truck_Mahajan> truckArea : truckFleet){
                if (truckArea.isEmpty()){
                    truckFleet.remove(truckArea);
                    continue;
                }
                else if (truckArea.peek().getAreaServes().equals(packag.getDestArea())){
                    for (Truck_Mahajan truck : truckArea) {
                        if (truck.canAdd(packag)){
                            truck.addPackage(packag);
                            return;
                        }
                    }
                    for (LinkedTransferQueue<Package_Mahajan> packagQueue : waitingPackages) {
                        if (packagQueue.isEmpty()){
                            waitingPackages.remove(packagQueue);
                        }
                        else if (packagQueue.peek().getDestArea().equals(packag.getDestArea())){
                            packagQueue.add(packag);
                            return;
                        }
                    }
                }
            }
            waitingPackages.add(new LinkedTransferQueue<Package_Mahajan>());
            waitingPackages.get(waitingPackages.size()-1).add(packag);
        }
        public void searchForPackage(Package_Mahajan packag){
            for (LinkedTransferQueue<Truck_Mahajan> truckQueue: truckFleet){
                if (!truckQueue.peek().getAreaServes().equals(packag.getDestArea())){
                    continue;
                }
                for (Truck_Mahajan truck : truckQueue) {

                    ArrayList<Package_Mahajan> allPackages = truck.getAllPackages();
                    for (Package_Mahajan packagTest : allPackages) {
                        if (packagTest.equals(packag)) {
                            System.out.println(truck.getLocation());
                        }
                    }
                }
            }
            System.out.println("Package not found");
        }
        public void searchForTruck(Truck_Mahajan truck){
            System.out.println(truck.getLocation());
        }
        public void test(){
            return;
        }
    }
