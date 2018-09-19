package org.wecancodeit.virtualpetshelter;

class BigChestVP extends AbstractDnaVP
{
	public BigChestVP(AbstractVirtualPet pet_decoration)
	{
		this.oVpDecoration = pet_decoration;
		this.shiftMaxHealthBy(5);
	}
}
