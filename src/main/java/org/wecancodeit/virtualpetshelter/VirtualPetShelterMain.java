package org.wecancodeit.virtualpetshelter;

import java.util.Scanner;
import java.util.*;

class VirtualPetShelterMain {

	public static void main(String[] args)
	{
		System.out.println("Welcome to the Freak Show Shelter!");
		Scanner oUserInput = new Scanner(System.in);
		VirtualPetShelter shelter = new VirtualPetShelter();
		shelter.admitPet(new VirtualPet("Cherie", "Smells like cherry bomb"));
		shelter.admitPet(new VirtualPet("Joan", "Wants to be your dog"));
		String sCurrentInput = "";
		String sTempName = "";
		String sTempDescription = "";
		while(true) {
			shelter.tickAll();
			shelter.resetIndex();
			for (;shelter.isValidIndex(); shelter.next()) {
				if(shelter.getCurrentHydration()<2) VirtualPetShelterMain.processNeglectedCurrent(shelter);
				else if( shelter.getCurrentFullness()<2) VirtualPetShelterMain.processNeglectedCurrent(shelter);
				else if(shelter.getCurrentStimulation()<2 ) VirtualPetShelterMain.processNeglectedCurrent(shelter);
				else if(shelter.getCurrentHealth()<2 ) VirtualPetShelterMain.processNeglectedCurrent(shelter);
			}
			VirtualPetShelterMain.outputOptions(shelter);
			if((sCurrentInput = oUserInput.nextLine()).trim().equalsIgnoreCase("quit")) break;
			switch(sCurrentInput.trim()) {
			case "1": // feed the pets
				shelter.feedAll();
				break;
			case "2":
				shelter.waterAll();
				break;
			case "3":
				VirtualPetShelterMain.outputIndividualPetList(shelter);
				if((sCurrentInput = oUserInput.nextLine()).trim().equalsIgnoreCase("quit")) break;
				shelter.playWith(Integer.parseInt(sCurrentInput) -1);
				break;
			case "4":
				VirtualPetShelterMain.outputIndividualPetList(shelter);
				if((sCurrentInput = oUserInput.nextLine()).trim().equalsIgnoreCase("quit")) break;
				shelter.adoptOne(Integer.parseInt(sCurrentInput) -1);
				break;
			case "5":
				System.out.println("Please provide a name for the new shelter member:");
				if((sTempName = oUserInput.nextLine()).trim().equalsIgnoreCase("quit")) break;
				System.out.println("Please provide the description for the new shelter member:");
				if((sTempDescription = oUserInput.nextLine()).trim().equalsIgnoreCase("quit")) break;
				if (shelter.getShelterOccupancy()==2) {
					shelter.admitPet(new EmphysemaVP(new VirtualPet(sTempName, sTempDescription)));
				} else if(shelter.getShelterOccupancy()==3) {
					shelter.admitPet(new BigChestVP(new SmallTongueVP(new VirtualPet(sTempName, sTempDescription))));
				} else {
					shelter.admitPet(new DiabetesVP(new VirtualPet(sTempName, sTempDescription)));
				}
				break;
			case "6":
				System.out.println("Sarah MacLaughlin will take it from here...");
				System.exit(0);
			default:
				break;
			}
		}
	}

	private static void processNeglectedCurrent(VirtualPetShelter s)
	{
		s.adoptOne(s.getCurrentIndex());
	}

	private static void outputOptions(VirtualPetShelter shelter) {
		String payload = "";
		String sCurrentName = "";
		String[] aCurrentPet;
		String[][] aPetSets = new String[shelter.getShelterOccupancy() +1][5];// {};
		aPetSets[0] = new String[] {"Name", "Hydration", "Fullness", "Stimulation", "Health"};
		int iLongestName = 0;
		int iNumericalIndex = 1;
		int iMaxClmnWidth = 16;
		int iMinNameWidth = (" " + aPetSets[0][0] + " ").length();
		int iCurrentTabQty = 0;
		int iMaxStatWidth = 3;
		int iMaxSecondClmnWidth = (" " + aPetSets[0][1] + " ").length();
		int iMaxThirdClmnWidth = (" " + aPetSets[0][2] + " ").length();
		int iMaxFourthClmnWidth = (" " + aPetSets[0][3] + " ").length();
		int iMaxFifthClmnWidth = (" " + aPetSets[0][4] + " ").length();
		int iOuterIndex = 0;
		int iInnerIndex = 0;
		int iTabStop = 8;
		
		
		shelter.resetIndex();
		if(shelter.isValidIndex()) {
			for( ; shelter.isValidIndex(); shelter.next()) {
				aCurrentPet = shelter.getPetStatistics();
				sCurrentName = aCurrentPet[0];
				if(sCurrentName.length() > iLongestName) iLongestName = sCurrentName.length();
				aPetSets[iNumericalIndex++] = aCurrentPet;
			}
			if(iLongestName % iTabStop != 0) iLongestName += iLongestName % iTabStop;
			if(iLongestName > iMaxClmnWidth) iLongestName = iMaxClmnWidth;
			
			for(shelter.resetIndex(); iOuterIndex <= shelter.getShelterOccupancy(); iOuterIndex++) {
				for(iInnerIndex=0; iInnerIndex < 5; iInnerIndex++) {
					if(payload.length()>0 && payload.substring(payload.length()-1, payload.length()).compareTo("\n")!=0){
						payload += "|";
					}
					if(iOuterIndex == 0 ) {
						if(iInnerIndex==0) payload += "This is the status of your pets: \n\n";
						sCurrentName = aPetSets[iOuterIndex][iInnerIndex];
						payload += sCurrentName;
						for(
								iCurrentTabQty=((iMaxClmnWidth - sCurrentName.length())/iTabStop)
								+ ((iMaxClmnWidth - sCurrentName.length())%iTabStop)>0 ? 1 : 0;
								iCurrentTabQty > 0; iCurrentTabQty--){
							payload += "\t";
						}
					} else {
						sCurrentName = aPetSets[iOuterIndex][iInnerIndex];
						for(
								iCurrentTabQty=((iMaxClmnWidth - sCurrentName.length())/iTabStop)
								+ ((iMaxClmnWidth - sCurrentName.length())%iTabStop)>0 ? 1 : 0;
								iCurrentTabQty > 0; iCurrentTabQty--){
							payload += "\t";
						}
						payload += sCurrentName;
					}
				}
				if(iOuterIndex==0){
					payload += "\n---------------|---------------|---------------|---------------|---------------";
				}
				payload += "\n";
			}
		}
		payload += "\nWhat would you like to do next?\n\n";
		payload += "1. Feed the pets\r\n" + 
				"2. Water the pets\r\n" + 
				"3. Play with a pet\r\n" + 
				"4. Adopt a pet\r\n" + 
				"5. Admit a pet\r\n" + 
				"6. Quit";
		System.out.println(payload);
	}
	
	private static void outputIndividualPetList(VirtualPetShelter shelter)
	{
		int iIndex = 1;
		String payload = "";
		AbstractCageDnaVP aCurrentPet;
		shelter.resetIndex();
		for( ; shelter.isValidIndex(); shelter.next()) {
			payload += " " + iIndex++ + ". " + shelter.getCurrentName() + " " + shelter.getCurrentDescription() + "\n";
		}
		System.out.println(payload);
	}

}
