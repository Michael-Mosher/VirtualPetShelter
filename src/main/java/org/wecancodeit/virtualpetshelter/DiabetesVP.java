package org.wecancodeit.virtualpetshelter;

class DiabetesVP extends AbstractDnaVP
{
	public DiabetesVP(AbstractVirtualPet pet_decoration)
	{
		this.oVpDecoration = pet_decoration;
		this.setHealthMultiplier(1.33);
	}
}
