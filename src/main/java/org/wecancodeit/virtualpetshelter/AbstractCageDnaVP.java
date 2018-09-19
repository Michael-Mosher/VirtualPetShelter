package org.wecancodeit.virtualpetshelter;

abstract class AbstractCageDnaVP extends AbstractDnaVP
{
	abstract public void cleanCage();
	
	public AbstractVirtualPet getPet()
	{
		return this.oVpDecoration;
	}
}
