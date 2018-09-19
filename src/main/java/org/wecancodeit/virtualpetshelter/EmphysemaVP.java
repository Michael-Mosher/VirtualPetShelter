package org.wecancodeit.virtualpetshelter;

class EmphysemaVP extends AbstractDnaVP
{
	public EmphysemaVP(AbstractVirtualPet pet_decoration)
	{
		this.oVpDecoration = pet_decoration;
		this.shiftMaxStimulationBy(-15);
		this.addendDescription("slow paced and always wheezing");
	}
}
