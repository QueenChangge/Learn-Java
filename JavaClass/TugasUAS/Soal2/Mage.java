package TugasUAS.Soal2;

public class Mage extends Hero{
    @Override
    public void healing(){
        int healing_total = intelligence * 20;
        int plus_intelligence = healing_total - intelligence;

        System.out.println("Hero "+ nama_hero + " dengan role "+ role + " melakukan healing vitality sebesar " + plus_intelligence + " dan kini vitality nya sebesar " + healing_total);
    }
}
