package TugasUAS.Soal2;

public class Warrior extends Hero{
    @Override
    public void healing(){
        int healing_total = strength * 10;
        int plus_strength = healing_total - strength;

        System.out.println("Hero "+ nama_hero + " dengan role "+ role + " melakukan healing vitality sebesar " + plus_strength + " dan kini vitalitynya sebesar " + healing_total);
    }
}
