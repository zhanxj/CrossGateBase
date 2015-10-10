package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoGrid {

	private VO_GRID vo;

	private VO_GRID.Builder builder;

	public VoGrid(VO_GRID vo) {
		this.vo = vo;
	}

	public VoGrid() {
		builder = VO_GRID.newBuilder();
	}

	/**
	 * 
	 * @param	item
	 * 			<u>do not has any annotate.</u>
	 */
	public void setItem(VoItem item) {
		builder.setItem(item.getVO_ITEM());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoItem getItem() {
		return new VoItem(vo.getItem());
	}

	/**
	 * 
	 * @param	size
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSize(Integer size) {
		builder.setSize(size);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getSize() {
		return vo.getSize();
	}

	/**
	 * 
	 * @param	count
	 * 			<u>do not has any annotate.</u>
	 */
	public void setCount(Integer count) {
		builder.setCount(count);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getCount() {
		return vo.getCount();
	}

	/**
	 * 
	 * @param	id
	 * 			<u>do not has any annotate.</u>
	 */
	public void setId(Integer id) {
		builder.setId(id);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getId() {
		return vo.getId();
	}

	public VO_GRID getVO_GRID() {
		return vo == null ? builder.build() : vo;
	}

}
