package be.seeseemelk.mockbukkit.inventory;

import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;

public class InventoryViewMock extends InventoryView
{
	private Inventory topInventory;
	private Inventory bottomInventory;
	private HumanEntity player;
	private InventoryType type = InventoryType.CHEST;

	public InventoryViewMock()
	{
		
	}
	
	/**
	 * Sets the top inventory.
	 * @param inventory The top inventory.
	 */
	public void setTopInventory(Inventory inventory)
	{
		topInventory = inventory;
	}
	
	/**
	 * Sets the bottom inventory.
	 * @param inventory The bottom inventory.
	 */
	public void setBottomInventory(Inventory inventory)
	{
		bottomInventory = inventory;
	}
	
	/**
	 * Sets the player viewing.
	 * @param player The player viewing.
	 */
	public void setPlayer(HumanEntity player)
	{
		this.player = player;
	}
	
	/**
	 * Sets the type of inventory view.
	 * @param type The new type of inventory view.
	 */
	public void setType(InventoryType type)
	{
		this.type = type;
	}

	@Override
	public Inventory getTopInventory()
	{
		return topInventory;
	}

	@Override
	public Inventory getBottomInventory()
	{
		return bottomInventory;
	}

	@Override
	public HumanEntity getPlayer()
	{
		return player;
	}

	@Override
	public InventoryType getType()
	{
		return type;
	}

}