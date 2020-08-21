package Core.level5.task1225;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Закрепляем паттерн Singleton
*/

public class Solution {
    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void main(String[] args) {

    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            if (s.equals(Planet.EARTH)) { // интерфейс используется как ENUM
                thePlanet = Earth.getInstance();
            } else if (s.equals(Planet.MOON)) {
                thePlanet = Moon.getInstance();
            } else if (s.equals(Planet.SUN)) {
                thePlanet = Sun.getInstance();
            } else {
                thePlanet = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
