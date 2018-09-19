package org.wecancodeit.virtualpetshelter;

import java.util.ArrayList;
import java.util.List;

class VirtualPetShelter {

	private List<AbstractCageDnaVP> pets;
	private int iIndex = 0;
	
	public VirtualPetShelter()
	{
		this.pets = new ArrayList();
	}
	
	public void admitPet(AbstractVirtualPet new_pet)
	{
		AbstractCageDnaVP oPetInsert;
		if(!(new_pet instanceof AbstractCageDnaVP)){
			oPetInsert = new DirtyCage(new_pet);
		} else oPetInsert = (AbstractCageDnaVP) new_pet; 
		this.pets.add(oPetInsert);
	}
	
	public int getShelterOccupancy()
	{
		return this.pets.size();
	}

	public String[] getPetStatistics() {
		String[] answer = new String[5];
		if(!this.pets.isEmpty() && this.iIndex < this.getShelterOccupancy()){
			answer[0] = this.pets.get(this.iIndex).getName();
			answer[1] = "" + this.pets.get(this.iIndex).getHydration();
			answer[2] = "" + this.pets.get(this.iIndex).getFullness();
			answer[3] = "" + this.pets.get(this.iIndex).getStimulation();
			answer[4] = "" + this.pets.get(this.iIndex).getHealth();
		}
		return answer;
	}

	public void next()
	{
		this.iIndex++;
	}
	
	public boolean isValidIndex()
	{
		return this.iIndex < this.pets.size();
	}
	
	public void resetIndex()
	{
		this.iIndex = 0;
	}

	public void tickAll() {
		for(AbstractCageDnaVP pet : this.pets) {
			pet.tick();
		}
	}

	public void feedAll() {
		for(AbstractCageDnaVP pet : this.pets) {
			pet.incrementSignificantFullness();
		}
	}
	
	public void waterAll()
	{
		for(AbstractCageDnaVP pet : this.pets) {
			pet.incrementSignificantHydration();
		}
	}

	public void playWith(int i)
	{
		this.pets.get(i).incrementFullStimulation();
	}
	
	public void cleanAllCages()
	{
		for(AbstractCageDnaVP pet : this.pets) {
			pet.incrementSignificantHealth();
		}
	}

	public AbstractVirtualPet adoptOne(int i)
	{
		AbstractVirtualPet answer = this.pets.remove(i).getPet();
		return answer;
	}
	
	public String getCurrentName()
	{
		return this.pets.get(this.iIndex).getName();
	}
	
	public String getCurrentDescription()
	{
		return this.pets.get(this.iIndex).getDescription();
	}
	
	public int getCurrentHydration()
	{
		return this.pets.get(this.iIndex).getHydration();
	}
	
	public int getCurrentFullness()
	{
		return this.pets.get(this.iIndex).getFullness();
	}
	
	public int getCurrentStimulation()
	{
		return this.pets.get(this.iIndex).getStimulation();
	}
	
	public int getCurrentHealth()
	{
		return this.pets.get(this.iIndex).getHealth();
	}
	
	public int getCurrentIndex()
	{
		return this.iIndex;
	}
}
