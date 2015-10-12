package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoBag {

	private VO_BAG vo;

	private VO_BAG.Builder builder;

	public VoBag(VO_BAG vo) {
		this.vo = vo;
	}

	public VoBag() {
		builder = VO_BAG.newBuilder();
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
		int ret = vo.getId();
		return ret;
	}

	/**
	 * 
	 * @param	grids
	 * 			<u>do not has any annotate.</u>
	 */
	public void setGrids(Iterable<VoGrid> grids) {
		List<VO_GRID> list = Lists.newLinkedList();
		for (VoGrid vo : grids) {
			list.add(vo.getVO_GRID());
		}
		builder.addAllGrids(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoGrid> getGridsList() {
		List<VO_GRID> list = vo.getGridsList();
		List<VoGrid> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_GRID vo : list) {
			ret.add(new VoGrid(vo));
		}
		return ret;
	}

	public VO_BAG getVO_BAG() {
		return vo == null ? builder.build() : vo;
	}

}
