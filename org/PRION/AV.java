package org.PRION;

import java.io.File;

public class AV {
    public static void main(String[] args) {
        try {
            final File malware1 = new File(
                    System.getenv("APPDATA") + "/.minecraft/libraries/net/minecraftforge/injector");
            if (malware1.exists()) {
                System.out.println("Yoink Rat found... Deleting");
                malware1.delete();
            } else if (!malware1.exists()) {
                System.out.println("No Yoink Rat found... U r safe");
            }
            final File malware2 = new File(System.getenv("APPDATA") + "/.m");
            if (malware2.exists()) {
                System.out.println("Omikron.tk Rat found... Deleting");
                malware2.delete();
            } else if (!malware2.exists()) {
                System.out.println("No Omikron rat found... U r safe");
            }
        } catch (Exception e) {
        }
    }
}