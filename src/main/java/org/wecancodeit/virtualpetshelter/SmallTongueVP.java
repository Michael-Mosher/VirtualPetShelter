package org.wecancodeit.virtualpetshelter;

class SmallTongueVP extends AbstractDnaVP {

	public SmallTongueVP(AbstractVirtualPet pet_decoration)
	{
		this.oVpDecoration = pet_decoration;
		this.setHydrationMultiplier(1.25);
	}
}
