package org.wecancodeit.virtualpetshelter;

class DirtyCage extends AbstractCageDnaVP
{
	public DirtyCage(AbstractVirtualPet pet_decoration)
	{
		this.oVpDecoration = pet_decoration;
		this.addendDescription("in a cage in need of cleaning");
	}
	
	public void tick()
	{
		this.oVpDecoration.decrementHealthBy(10);
		this.oVpDecoration.tick();
	}
	
	public void cleanCage()
	{
		this.oVpDecoration.incrementFullHealth();
	}
}
