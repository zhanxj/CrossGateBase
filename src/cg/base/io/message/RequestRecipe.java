package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ByteArrayMessage;
import cg.base.io.proto.SkillProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestRecipe extends ByteArrayMessage {

	private REQUEST_RECIPE.Builder builder;

	public RequestRecipe(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_RECIPE_VALUE, status, sessionId, sender, datas);
		builder = REQUEST_RECIPE.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestRecipe() {
		super();
		builder = REQUEST_RECIPE.newBuilder();
		messageId = MessageId.MI_REQUEST_RECIPE_VALUE;
	}

	/**
	 * 
	 * @param	bagId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBagId(Integer bagId) {
		builder.setBagId(bagId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getBagId() {
		return builder.getBagId();
	}

	/**
	 * 
	 * @param	gridIds
	 * 			<u>do not has any annotate.</u>
	 */
	public void setGridIds(Iterable<Integer> gridIds) {
		builder.addAllGridIds(gridIds);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<Integer> getGridIdsList() {
		return builder.getGridIdsList();
	}

	/**
	 * 
	 * @param	recipeId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setRecipeId(Integer recipeId) {
		builder.setRecipeId(recipeId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getRecipeId() {
		return builder.getRecipeId();
	}

	public REQUEST_RECIPE getRequestRecipe() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
