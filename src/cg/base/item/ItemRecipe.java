package cg.base.item;

public interface ItemRecipe {
	
	String getName();
	
	short getId();
	
	int getItemId();
	
	short getSkillId();
	
	MaterialInfo[] getMaterials();
	
	public static interface MaterialInfo {
		
		int getItemId();
		
		byte getNeedAmount();
		
	}

}
