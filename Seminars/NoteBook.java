package Seminars;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NoteBook {
    private int ramSize;
    private int hddCapacity;
    private String operatingSystem;
    private String color;

    public NoteBook(int ramSize, int hddCapacity, String operatingSystem, String color) {
        this.ramSize = ramSize;
        this.hddCapacity = hddCapacity;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public NoteBook() {

    }
    public int getRamSize() {
        return ramSize;
    }
    public int getHddCapacity() {
        return hddCapacity;
    }

    public String getColor() {
        return color;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public String toString() {
        return "RAM Size: " + ramSize + " | " + "HDD Capacity: " + hddCapacity + " | "
                + "Operating system: " + operatingSystem + " | " + "Color: " + color;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj){
//            return true;
//        }
//        if (!(obj instanceof NoteBook)){
//            return false;
//        }
//        NoteBook pc = (NoteBook)obj;
//        return ramSize == pc.ramSize && hddCapacity == pc.hddCapacity &&
//                operatingSystem.equals(pc.operatingSystem) && color.equals(pc.color);
//
//    }

    @Override
    public int hashCode() {
        return ramSize + hddCapacity + operatingSystem.hashCode() + color.hashCode();
    }

    public List<NoteBook> getRandomNoteBookCollection(int[] ramSizes, int[] hddCapacities,
                                                    String[] operatingSystems, String[] colors, int size) {
        List<NoteBook> noteBookCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            noteBookCollection.add(new NoteBook(ramSizes[random.nextInt(ramSizes.length)], hddCapacities[random.nextInt(hddCapacities.length)],
                    operatingSystems[random.nextInt(operatingSystems.length)], colors[random.nextInt(colors.length)]));
        }
        return noteBookCollection;
    }
}
