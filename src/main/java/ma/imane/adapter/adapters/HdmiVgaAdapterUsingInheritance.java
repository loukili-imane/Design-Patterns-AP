package ma.imane.adapter.adapters;


import ma.imane.adapter.computer.TV;
import ma.imane.adapter.computer.VGA;

public class HdmiVgaAdapterUsingInheritance extends TV implements VGA {
    @Override
    public void print(String message) {
        System.out.println("~~~~~~~~~~~ Adapter ~~~~~~~~~~");
        byte[] data = message.getBytes();
        super.view(data);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
