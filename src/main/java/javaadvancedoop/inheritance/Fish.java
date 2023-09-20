package javaadvancedoop.inheritance;

import java.util.Set;
public class Fish extends Animal{
    private Set<FishSpecies> fishSpeciesSet;
    public Fish(double height,double weight, Set<FishSpecies> fishSpecies){
        super(height, weight);
        this.fishSpeciesSet = fishSpecies;
    }
    public Set<FishSpecies> getFishSpeciesSet(){
        return fishSpeciesSet;
    }
    public void setFishSpeciesSet(Set<FishSpecies> fishSpecies) {
        this.fishSpeciesSet = fishSpecies;
    }

    public double swimSpeedInMetersPerSecond(){
        return weight * 2;
    }
}
